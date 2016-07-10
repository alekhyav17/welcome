package com.niit.heloo.dao;

import java.util.List;

import com.niit.heloo.model.ProductModel;

public interface ProductDAO {
	public void insertProductModel(ProductModel u);

	public List<ProductModel> getProductList();
	//void remove(Integer pid);
	
	void update(ProductModel p);

}
