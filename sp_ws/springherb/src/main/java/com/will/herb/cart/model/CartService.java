package com.will.herb.cart.model;

import java.util.List;
import java.util.Map;

public interface CartService {
	int insertCart(CartVO vo);
	List<Map<String, Object>> selectCartView(String customerId);
	int deleteCart(int cartNo);
	int updateCartNum(CartVO cartVo);
}
