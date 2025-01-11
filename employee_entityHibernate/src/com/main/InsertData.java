package com.main;

import com.entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.Employee;

public class InsertData {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		e.setEmp_id(1);
		e.setName("sham");
		e.setEmail("sham@gmail.com");
		e.setAdress("Hydrabad");

		ss.save(e);// ss.persist(e);
		tr.commit();

		System.out.println("data inserted");
	}
}
