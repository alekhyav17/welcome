package com.niit.heloo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.heloo.model.SupplierModel;


@Repository
public class SupplierDAOimpl implements SupplierDAO{
	@Autowired(required=true)
	private SessionFactory sessionFactory;
	    @Transactional
		public void insertSupplierModel(SupplierModel sm)
		{
			Session s=this.sessionFactory.openSession();
			Transaction t=s.beginTransaction();
			s.save(sm);
			t.commit();

}
			@SuppressWarnings("unchecked")
			@Transactional(propagation=Propagation.SUPPORTS)
			public List<SupplierModel> getSupplierList()// method of ProductDAOInt defined
			{
				System.out.println("-----------  "+sessionFactory);
				Session s=sessionFactory.openSession();
				Transaction t = s.beginTransaction();
				System.out.println("In dao ");
				List<SupplierModel> al=new ArrayList<SupplierModel>();
						 al=s.createQuery("from SupplierModel").list();
				 t.commit();
				 return al;
			}  

}
