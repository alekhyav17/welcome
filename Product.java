package com.niit.training;
import java.util.*;
public class Product {
	int id;
	String pname;
	double price;
	Product(int i,String name,double p)
	{
		id=i;
		pname=name;
		price=p;
	}
	Product()
	{}
	public int getId() {
		return id;
	}
	public void setId(int i) {
		id =i ;
	}
	public String getPname() {
		return pname;
	}
	
	public double getPrice() {
		return price;
	}
	public String toString()
	{
		return id+" "+pname+" ";
	}
	public boolean equals(Object o)
	{
		Product p = (Product)o;
		return(getId()==p.getId());
		
	}
	public int hashCode()
	{
		final int N=129;
		int d=1;
		int result=d*N+this.id;
		return result;
	}
	public static void main(String args[])
	{
		Product p1 = new Product(1,"samsung",2313.1d);
		System.out.println(p1);
		Product p2 = new Product(2,"sony xperia",23413.1d);
		System.out.println(p2);
		boolean t = p1.equals(p2);
		System.out.println(t);
		Product p3 = p1;
		System.out.println(p1.equals(p3));
		Product p4 = new Product();
		Product p5 = new Product();
		p4.setId(100);
		p5.setId(100);
		System.out.println(p4.equals(p5));
		System.out.println(p4.hashCode());
		System.out.println(p5.hashCode());
		HashSet hs = new HashSet();
		hs.add(p4);
		hs.add(p5);
		System.out.println(hs);
		
	
	}
}
