package com.will.herb.cart.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.will.herb.cart.model.CartService;
import com.will.herb.cart.model.CartVO;

@Controller
@RequestMapping("/shop/cart")
public class CartController {
	private static final Logger logger = LoggerFactory.getLogger(CartController.class);
	
	@Autowired private CartService cartService;
	
	@RequestMapping("/cartAdd.do")
	public String cartAdd(@ModelAttribute CartVO cartVo, 
			HttpSession session
			,@RequestParam String mode) {
		String userid=(String) session.getAttribute("userid");
		cartVo.setCustomerId(userid);
		logger.info("장바구니 담기 화면, 파라미터 cartVo={}, mode={}", cartVo, mode);
		
		int cnt = cartService.insertCart(cartVo);
		logger.info("장바구니 담기 결과, cnt={}", cnt);
		
		String page="";
		if(mode.equals("cart")) {
			page="/shop/cart/cartList.do";
		}else if(mode.equals("order")) {
			page="/shop/order/orderSheet.do";
		}
		
		return "redirect:" + page;
		
	}
	
	@RequestMapping("/cartList.do")
	public String cartList(HttpSession session, Model model) {
		logger.info("장바구니 목록, 파라미터 ");
		String userid = (String)session.getAttribute("userid");
		
		List<Map<String, Object>> list =cartService.selectCartView(userid);
		logger.info("장바구니 목록 결과, list.size={}", list.size());
		
		model.addAttribute("list",list);
		
		
		return "shop/cart/cartList";
	}
	
	@RequestMapping("/cartDelete.do")
	public String cartDelete(@RequestParam(defaultValue = "0") int cartNo,
			Model model) {
		logger.info("장바구니 상품 삭제, 파라미터 cartNo={}", cartNo);
		
		int cnt = cartService.deleteCart(cartNo);
		logger.info("장바구니 상품 삭제 결과, cnt={}", cnt);
		String msg="상품 삭제 실패", url="/shop/cart/cartList.do";
		if(cnt>0) {
			msg="상품 삭제 성공";
		}
		
		model.addAttribute("msg", msg);
		model.addAttribute("url", url);
		
		return "common/message";
	}
	
	@RequestMapping("/cartEdit.do")
	public String cartEdit(@ModelAttribute CartVO cartVo
			,Model model) {
		logger.info("장바구니 상품 수량 수정, 파라미터 cartVo={}", cartVo);
		
		int cnt = cartService.updateCartNum(cartVo);
		
		return "redirect:/shop/cart/cartList.do";
	}
	
}
