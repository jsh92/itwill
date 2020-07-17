package com.will.herb.order.model;

import java.util.List;
import java.util.Map;

public interface OrderDAO {
	int insertOrder(OrderVO orderVo);
	int insertOrderDetails(OrderVO orderVo);
	Map<String, Object> selectOrdersView(int orderNo);
	List<Map<String, Object>> selectOrderDetailsView(int orderNo);
}
