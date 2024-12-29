package com.abcshopapp.service;

import java.util.List;

import com.abcshopapp.dto.Invoice;
import com.abcshopapp.dto.Product;

public interface ProductService {

	double calculateOrderAmount(int customerId,int productId, int qty);
	void addProduct(Product product);
	List<Product>getAllProducts();
}