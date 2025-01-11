package Com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Com.entity.User;

public class UpdateData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(User.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int userId = 1;

		User u = ss.get(User.class, userId);
		u.setUserName("Karan");

		ss.update(u);
		System.out.println("data updated succefully");

		tr.commit();
		ss.close();
	}
}
