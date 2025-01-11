package com.main;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Employee;


public class GetSingleRecord {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int Emp_id = 2;
		Employee e = ss.load(Employee.class, Emp_id);
		Employee e1 = ss.load(Employee.class, Emp_id);
		System.out.println(e1);
		
//		System.out.println("Emp_id :" + e.getEmp_id());
//		System.out.println("name :" + e.getName());
//		System.out.println("email :" + e.getEmail());
//		System.out.println("city :" + e.getAdress());
		
		
	System.out.println("data fetch succefully...");

		tr.commit();
		ss.close();
	}
}
