package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLExample {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session s = factory.openSession();

		//HQL
		String query = "from Student";
		
		Query q = s.createQuery(query);
		
		//single - (Unique)
		//multiple- list
		List<Student> list =  q.list();
		
		factory.close();
	}
	
}
