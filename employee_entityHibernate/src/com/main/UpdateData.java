package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class UpdateData {
     public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int Emp_id = 2;
		Employee e = ss.get(Employee.class, Emp_id);
		if (e != null) {
			e.setName("rohit");
			e.setAdress("Nagpur");

			ss.update(e);
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student with ID " + Emp_id + " not found.");
        }
        
		
		
		
		tr.commit();
		ss.close();
	} 
}
