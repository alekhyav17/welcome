package com.niit.heloo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.heloo.dao.CategoryDAO;
import com.niit.heloo.model.CategoryModel;

@Service
public class CategoryServiceimpl implements CategoryService{
	@Autowired
	CategoryDAO categoryDAO;
	public void insertCategoryModel(CategoryModel cm)
	{
		categoryDAO.insertCategoryModel(cm);
	}
	public List<CategoryModel> getCategoryList() {
		// TODO Auto-generated method stub
		System.out.println("In SERVICE");
		List<CategoryModel> a=categoryDAO.getCategoryList();
		System.out.println(a);
		return a;
	
	}
}
