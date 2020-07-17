package com.will.herb.order.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.will.herb.cart.model.CartService;
import com.will.herb.member.model.MemberService;
import com.will.herb.member.model.MemberVO;
import com.will.herb.order.model.OrderService;
import com.will.herb.order.model.OrderServiceImpl;
import com.will.herb.order.model.OrderVO;

@Controller
@RequestMapping("/shop/order")
public class OrderController {
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired private CartService cartService;
	@Autowired private MemberService memberService;
	@Autowired private OrderService orderService;
	
	@RequestMapping(value = "/orderSheet.do", method = RequestMethod.GET)
	public String order(HttpSession session, Model model) {
		logger.info("주문 페이지");
		
		logger.info("장바구니 목록, 파라미터 ");
		String userid = (String)session.getAttribute("userid");
		
		List<Map<String, Object>> list =cartService.selectCartView(userid);
		logger.info("장바구니 목록 결과, list.size={}", list.size());
		
		MemberVO memVo =memberService.selectMember(userid);
		String email="";
		if(memVo.getEmail1()!=null && !memVo.getEmail1().isEmpty()) {
			email= memVo.getEmail1() + memVo.getEmail2();
		}
		
		
		model.addAttribute("list",list);
		model.addAttribute("memVo",memVo);
		model.addAttribute("email",email);
		
		
		return "shop/order/orderSheet";
	}
	
	@RequestMapping(value = "/orderSheet.do", method = RequestMethod.POST)
	public String order_post( @ModelAttribute OrderVO orderVo, HttpSession session,  Model model) {
		String userid = (String)session.getAttribute("userid");
		orderVo.setCustomerId(userid);
		logger.info("주문 입력 결과, 파라미터 orderVo={}", orderVo);
		
		int cnt = orderService.insertOrder(orderVo);
		//insert 후 orderVo에 orderNo값이 입력 되었기 때문에 보낼 때는 꼭 뒤에서 해야한다
		logger.info("주문하기 결과, cnt={}", cnt);
		
		return"redirect:/shop/order/orderComplete.do?orderNo="+orderVo.getOrderNo();
	}
	
	@RequestMapping("/orderComplete.do")
	public String orderComplete(@RequestParam(defaultValue = "0") int orderNo, Model model) {
		logger.info("주문 완료 페이지, 파라미터 orderNo={}", orderNo);
		
		Map<String, Object> map = orderService.selectOrdersView(orderNo);
		logger.info("ordersView 검색 결과, map={}", map);
		
		List<Map<String, Object>> list =  orderService.selectOrderDetailsView(orderNo);
		logger.info("orderDetailsView 검색 결과, list.size={}", list.size());
		
		model.addAttribute("ordersMap", map);
		model.addAttribute("list", list);
		
		return "shop/order/orderComplete";
	}
	
	
}
