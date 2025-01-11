package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class InsertData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = new Student();

		s.setMob_no(9675728575L);
		s.setS_name("shivam");
		s.setAge(22);
		s.setAdress("mumbai");

		ss.save(s);
		System.out.print(" data added...");

		tr.commit();
		ss.close();

	}
}