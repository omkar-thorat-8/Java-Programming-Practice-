package com.obito;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee(120,"xyz",23000);
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session ses = factory.openSession();
		
		e1 = ses.getReference(Employee.class,120);
		
		Transaction tr=ses.beginTransaction();
		e1.getEmpId();
		ses.persist(e1);
		ses.remove(e1);
		
		tr.commit();
		ses.close();
	}
}