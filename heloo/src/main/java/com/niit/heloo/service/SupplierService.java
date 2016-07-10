package com.niit.heloo.service;

import java.util.List;

import com.niit.heloo.model.SupplierModel;

public interface SupplierService {
	public void insertSupplierModel(SupplierModel sm);
	List<SupplierModel> getSupplierList();

}
