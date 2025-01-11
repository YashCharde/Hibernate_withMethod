package Com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Com.entity.User;

public class InsertData {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(User.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		User u = new User();
		u.setUserId(1);
		u.setUserName("karan123");
		u.setEmail("karan@gmail.com");

		  ss.save(u); //ss.persist(u)

		System.out.println("data inserted succefully");

		tr.commit();
		ss.close();
	}
}
