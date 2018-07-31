package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M5 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.setPersonId(102);
		p1.setFirstName("Bhanu");
		p1.setLastName("Kiran");
		
		Configuration c1 = new Configuration();
		c1.configure();		
		
		SessionFactory sf = c1.buildSessionFactory();
		Session s1 = sf.openSession();
		
		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();
		
		System.out.println("done");
	}
}