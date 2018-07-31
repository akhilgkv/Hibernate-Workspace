package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M14 
{
	public static void main(String[] args) 
	{
		Configuration c1 = new Configuration();
		c1.configure();		
		
		SessionFactory sf = c1.buildSessionFactory();
		Session s1 = sf.openSession();
		
		Person p1 = (Person) s1.load(Person.class, 112);
		p1.setLastName("Srivathsava");
				
		s1.beginTransaction();
		s1.saveOrUpdate(p1);
		s1.getTransaction().commit();
		
		System.out.println("done");
	}
}
