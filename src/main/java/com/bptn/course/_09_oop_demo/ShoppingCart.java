package com.bptn.course._09_oop_demo;

class ShoppingCart {

	private CartItem[] items;
	private int itemCount;

	public ShoppingCart() {

		items = new CartItem[5];
		itemCount = 0;
	}

	// addProductToCart
	public void addproductToCart(Product product, int quantity) {
		if (itemCount <= 4) {
			CartItem newItem = new CartItem(product, quantity);
			items[itemCount] = newItem;
			itemCount++;
			product.reduceStock(quantity);
		} else {
			throw new IllegalArgumentException("Cart Full!");

		}
	}

	// showProductInCart
	public CartItem[] showProductInCart() {
		CartItem[] currentItems = new CartItem[itemCount];
		// loop through the array to get the item data
		for (int i = 0; i < itemCount; i++) {
			currentItems[i] = items[i];

		}

		return currentItems;

	}

}
