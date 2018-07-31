package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M18 
{
	public static void main(String[] args) 
	{
		Configuration c1 = new Configuration();
		c1.configure();		
		
		SessionFactory sf = c1.buildSessionFactory();
		Session s1 = sf.openSession();
		
		Person p1 =  (Person) s1.get(Person.class, 112);
		if (p1 != null) {
			System.out.println("id: " + p1.getPersonId());
			System.out.println("first name: " + p1.getFirstName());
			System.out.println("last name: " + p1.getLastName());
		}
		else {
			System.out.println("no records found");
		}		
		System.out.println("done");
	}
}
