package com.will.herb.order.model;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.will.herb.cart.model.CartDAO;

@Service
public class OrderServiceImpl implements OrderService {
	private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
	@Autowired private OrderDAO orderDao;
	@Autowired private CartDAO cartDao;
	

	@Override
	@Transactional
	public int insertOrder(OrderVO orderVo) {
		int cnt1=0,cnt2=0,cnt3=0;
		cnt1 = orderDao.insertOrder(orderVo);
		logger.info("orders insert 결과, cnt1={}", cnt1);
		
		cnt2 = orderDao.insertOrderDetails(orderVo);
		logger.info("orderDetails insert 결과, cnt2={}, orderVo={}", cnt2, orderVo);
		
		cnt3 = cartDao.deleteCartByUserid(orderVo.getCustomerId());
		logger.info("cart에서 삭제 결과, cnt3={}", cnt3);
		
		return cnt3;
	}


	@Override
	public Map<String, Object> selectOrdersView(int orderNo) {
		return orderDao.selectOrdersView(orderNo);
	}


	@Override
	public List<Map<String, Object>> selectOrderDetailsView(int orderNo) {
		return orderDao.selectOrderDetailsView(orderNo);
	}
}
