package com.springboot.model;

public class Cart {
	
	private Integer cartId;
	private String bookName;
	private Integer quantity;
	private Double price;
	
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public String getBookName() {
		return bookName;
	}	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	

}
