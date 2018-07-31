package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M6 
{
	public static void main(String[] args) 
	{
		if (args.length <3)
		{
			System.out.println("please supply 3 cla");
			System.out.println("eg. 103 swathi kiran");
			return;
		}
		Person p1 = new Person();
		p1.setPersonId(Integer.parseInt(args[0]));
		p1.setFirstName(args[1]);
		p1.setLastName(args[2]);
		
		Configuration c1 = new Configuration();
		c1.configure();		
		
		@SuppressWarnings("deprecation")
		SessionFactory sf = c1.buildSessionFactory();
		Session s1 = sf.openSession();
		
		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();
		
		System.out.println("done");
	}

}
