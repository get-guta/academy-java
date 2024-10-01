package com.bptn.course._09_oop_demo;

class Product {
	
	private String productId;
	private String productName;
	private Double productPrice;
	private int productQuantity;
	
	public Product(String productId, String productName, Double productPrice, int productQuantity) {
		
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}
	
	//Getters /Accessors
	
	public String getProductId() {
		return this.productId;
	}
	public String getProductName() {
		return this.productName;
	}
	public Double getProductPrice() {
		return this.productPrice;
	}
	public int getProductQuantity() {
		return this.productQuantity;
	}
	
	public void reduceStock(int qauntity) {
		if(qauntity <= this.productQuantity) {
			this.productQuantity -= qauntity;
		}else {
			
			throw new IllegalArgumentException("Insuffiecient Stock!");
		}
		
	}
	
}
