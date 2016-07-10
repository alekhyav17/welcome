package com.niit.heloo.service;

import java.util.List;

import com.niit.heloo.model.CategoryModel;

public interface CategoryService {
	public void insertCategoryModel(CategoryModel cm);
	List<CategoryModel> getCategoryList();

}
