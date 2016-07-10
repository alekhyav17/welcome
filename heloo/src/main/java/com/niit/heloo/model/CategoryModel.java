package com.niit.heloo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="category")
public class CategoryModel {
	@Id
	@Column
	String categoryid;
	@Column
	String categoryname;
	@Column
	String categoryprice;
	@Column
	String categorysize;
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getCategoryprice() {
		return categoryprice;
	}
	public void setCategoryprice(String categoryprice) {
		this.categoryprice = categoryprice;
	}
	public String getCategorysize() {
		return categorysize;
	}
	public void setCategorysize(String categorysize) {
		this.categorysize = categorysize;
	}
	
}
