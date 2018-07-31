package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M11 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.setPersonId(114);
		p1.setFirstName("Mohan");
		p1.setLastName("singh");
		
		Configuration c1 = new Configuration();
		c1.configure();		
		
		SessionFactory sf = c1.buildSessionFactory();
		Session s1 = sf.openSession();
		
		s1.beginTransaction();
		s1.saveOrUpdate(p1);
		s1.getTransaction().commit();
		
		System.out.println("done");
	}
}
