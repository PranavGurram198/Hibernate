package com.edubridge.hibernate.valuetype;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveOrUpdateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=UserSession.getSession();
	    Transaction t=session.beginTransaction(); 
	    UserDetails userdetails=new UserDetails();
		userdetails.setPhone("9112307181");
		userdetails.setUserId(1);
		userdetails.setUserName("Pranav");
		userdetails.setdob(new Date());
		session.saveOrUpdate(userdetails);
		userdetails.setUserName("Gurram");
		t.commit();
		System.out.println("updated successfully");
		session.close();
		
	}

}
