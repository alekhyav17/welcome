package com.niit.heloo.dao;

import java.util.List;

import com.niit.heloo.model.SupplierModel;

public interface SupplierDAO {
	
  public void insertSupplierModel(SupplierModel sm);
  public List<SupplierModel> getSupplierList();
}
