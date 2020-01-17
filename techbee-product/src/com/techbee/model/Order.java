package com.techbee.model;

public class Order {

	private String orderId;
	private String productId;
	private String customerId;
	private int productQuantity;
	private String giftWrap;
	private String deliveryInstructions;
	private int deliveryDate;
	private double cartValue;
	private String couponCode;
	
	public Order() {
		
	}
	
	public String getOrderId() {
		return orderId;
	}
	
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public int getProductQuantity() {
		return productQuantity;
	}
	
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	public String getGiftWrap() {
		return giftWrap;
	}
	
	public void setGiftWrap(String giftWrap) {
		this.giftWrap = giftWrap;
	}
	
	public String getDeliveryInstructions() {
		return deliveryInstructions;
	}
	
	public void setDeliveryInstructions(String deliveryInstructions) {
		this.deliveryInstructions = deliveryInstructions;
	}
	
	public int getDeliveryDate() {
		return deliveryDate;
	}
	
	public void setDeliveryDate(int deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	public double getCartValue() {
		return cartValue;
	}
	
	public void setCartValue(double cartValue) {
		this.cartValue = cartValue;
	}
	
	public String getCouponCode() {
		return couponCode;
	}
	
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productId=" + productId + ", customerId=" + customerId
				+ ", productQuantity=" + productQuantity + ", giftWrap=" + giftWrap + ", deliveryInstructions="
				+ deliveryInstructions + ", deliveryDate=" + deliveryDate + ", cartValue=" + cartValue + ", couponCode="
				+ couponCode + "]";
	}
}
