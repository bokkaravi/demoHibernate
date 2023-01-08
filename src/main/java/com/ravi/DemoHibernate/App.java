package com.ravi.DemoHibernate;

//import javax.transaction.HeuristicMixedException;
//import javax.transaction.HeuristicRollbackException;
//import javax.transaction.RollbackException;
//import javax.transaction.SystemException;
//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws SecurityException {
//    	Employee emp1 = new Employee(1,"ravi","s/w");
//    	Employee emp2 = new Employee(1,"sai ganesh","s/w");
    	
    	Employee emp = new Employee();
    	emp.setId(1);
    	emp.setDept("s/w");
    	emp.setEmpName("ravi");
    	
    	emp.setId(2);
    	emp.setDept("s/w");
    	emp.setEmpName("sai ganesh");
    	
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
    	
    	SessionFactory sessionFactory = con.buildSessionFactory();
    	
    	Session session = sessionFactory.openSession(); //which will give us the object of session
    	
    	Transaction transaction =  session.beginTransaction();
    	
    	session.save(emp);
    	
    	transaction.commit();
    	
    	
    	
    	
        
    }
}
