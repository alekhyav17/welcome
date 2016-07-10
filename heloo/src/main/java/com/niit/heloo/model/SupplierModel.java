package com.niit.heloo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="supplier")
public class SupplierModel {
	@Id
	@Column
	String supplierid;
	@Column
	String suppliername;
	@Column
	String supplierprice;
	@Column
	String suppliersize;
	public String getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getSupplierprice() {
		return supplierprice;
	}
	public void setSupplierprice(String supplierprice) {
		this.supplierprice = supplierprice;
	}
	public String getSuppliersize() {
		return suppliersize;
	}
	public void setSuppliersize(String suppliersize) {
		this.suppliersize = suppliersize;
	}
	

}
