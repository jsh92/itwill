package com.will.herb.cart.model;

import java.util.List;
import java.util.Map;

public interface CartDAO {
	int selectPdCount(CartVO vo);
	int insertCart(CartVO vo);
	int updateCartQty(CartVO vo);
	List<Map<String, Object>> selectCartView(String customerId);
	int deleteCart(int cartNo);
	int updateCartNum(CartVO vo);
	int deleteCartByUserid(String userid);
}
