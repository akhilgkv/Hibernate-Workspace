package com.lara;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M7 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter person Id");		
		p1.setPersonId(sc.nextInt());
		System.out.println("enter first name");
		p1.setFirstName(sc.next());
		System.out.println("enter last name");
		p1.setLastName(sc.next());
		
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
