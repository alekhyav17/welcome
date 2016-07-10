package com.niit.heloo.dao;

import java.util.List;

import com.niit.heloo.model.CategoryModel;

public interface CategoryDAO {
	
  public void insertCategoryModel(CategoryModel cm);
  public List<CategoryModel> getCategoryList();
}
