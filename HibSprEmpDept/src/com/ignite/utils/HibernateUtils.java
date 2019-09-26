package com.ignite.utils;

import org.hibernate.SessionFactory;

// A singleton class
public class HibernateUtils {
	
	// Prevents Instantiate
	private HibernateUtils(){}
	
	// Static factory pattern method allows to call from outside to obtain a single object
	public static SessionFactory getSessionFactory(){
		return null;
	}

}
