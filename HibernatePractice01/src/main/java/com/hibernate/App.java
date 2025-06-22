package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Session Starts" );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sFactory = cfg.buildSessionFactory();
        
        Student student = new Student();
        //student.setId(102);
        student.setName("Prem");
        student.setAge(21);
        
        System.out.println(student.toString());
        
        Session session = sFactory.openSession();
        
        session.save(student);
        
        Transaction tx = session.beginTransaction();
        
        tx.commit();
        
        session.close();
        
        
    }
}
