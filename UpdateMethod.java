package com.edubridge.hibernate.valuetype;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=UserSession.getSession();
	    Transaction t=session.beginTransaction(); 
	    UserDetails userdetails=new UserDetails();
		userdetails.setPhone("9112307181");
		userdetails.setUserId(9);
		userdetails.setUserName("Pranav");
		userdetails.setdob(new Date());
		session.update(userdetails);
		userdetails.setUserName("Gurram");
		t.commit();
		System.out.println("updated successfully");
		session.close();
		
	}


	}

