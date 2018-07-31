package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M20 
{
	public static void main(String[] args) 
	{
		Configuration c1 = new Configuration();
		c1.configure();		
		
		SessionFactory sf = c1.buildSessionFactory();
		Session s1 = sf.openSession();
		
		Person p1 =  new Person();
		p1.setPersonId(117);
		
		s1.beginTransaction();
		s1.delete(p1);
		s1.getTransaction().commit();
		System.out.println("done");
	}
}
