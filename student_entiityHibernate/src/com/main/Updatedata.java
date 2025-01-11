package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class Updatedata {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Student.class);
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();
        
        long mob_no = 9675728575L;
        Student s = ss.get(Student.class, mob_no);
        s.setS_name("shrived");
        s.setAdress("pune");
        s.setAge(18);
        
        ss.update(s);
        System.out.println("data updated succefully....");
        
        tr.commit();
        ss.close();
	}

}
