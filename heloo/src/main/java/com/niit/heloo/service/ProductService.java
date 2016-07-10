package com.niit.heloo.service;

import java.util.List;

import com.niit.heloo.model.ProductModel;

public interface ProductService {
	public void insertProductModel(ProductModel u);
	List<ProductModel> getProductList();
	//void remove(Integer pid);
	void update(ProductModel p);

}
