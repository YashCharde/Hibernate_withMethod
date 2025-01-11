package Com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Com.entity.User;

public class GetSingleRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(User.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int userId = 1;
		User u = ss.get(User.class, userId);
		System.out.println(u);

//		System.out.println("userId : " + u.getUserId());
//		System.out.println("userName : " + u.getUserName());
//		System.out.println("email : " + u.getEmail());
        
		System.out.println("data fetch succefully");
		
		tr.commit();
		ss.close();
	}
}
