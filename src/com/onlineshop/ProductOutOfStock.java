package com.onlineshop;

public class ProductOutOfStock extends RuntimeException {
	ProductOutOfStock(String message){
		super(message);
	}
}
