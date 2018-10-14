package com.problem.practice;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Base64;



public class Solution {	
	
	
	public static String penetrate(String base64ObjectInput, String fieldName, int newValue) throws Exception {
		String penetratedBase64=null;
		ByteArrayInputStream in = new ByteArrayInputStream(Base64.getDecoder().decode(base64ObjectInput));
		
		ObjectInputStream objIn = new ObjectInputStream(in);
	    Class<? extends Object> c = objIn.readObject().getClass();
	    if(c.getName().equalsIgnoreCase("com.nortal.testassignment.Solution$Money")) {
	    	Field f =  c.getDeclaredField(fieldName);
			 
			 f.setAccessible(true);
		
			 Money m = new Solution.Money();
			     
			     f.set(m, newValue);
			     ByteArrayOutputStream baos = new ByteArrayOutputStream();
			     
			   ObjectOutputStream os = new ObjectOutputStream(baos) ;
			   os.writeObject(m);
			   
			   penetratedBase64=  Base64.getEncoder().encodeToString( baos.toByteArray());
			     

	    	
	    }else if(c.getName().equalsIgnoreCase("com.nortal.testassignment.Solution$MoneyWithCurrency")){
	    	Field f =  c.getDeclaredField(fieldName);
			 
			 f.setAccessible(true);
			 MoneyWithCurrency m = new Solution.MoneyWithCurrency();
			     
			     f.set(m, newValue);
			     ByteArrayOutputStream baos = new ByteArrayOutputStream();
			     
			   ObjectOutputStream os = new ObjectOutputStream(baos) ;
			   os.writeObject(m);
			   
			   penetratedBase64=  Base64.getEncoder().encodeToString( baos.toByteArray());
	    	
	    	
	    	
	    }else {
	    	Field f =  c.getDeclaredField(fieldName);
	    	
			 f.setAccessible(true);
			 MoneyWithCurrencyAndSerial m = new Solution.MoneyWithCurrencyAndSerial();
			     
			     f.set(m, newValue);
			     ByteArrayOutputStream baos = new ByteArrayOutputStream();
			     
			   ObjectOutputStream os = new ObjectOutputStream(baos) ;
			   os.writeObject(m);
			   
			   penetratedBase64=  Base64.getEncoder().encodeToString( baos.toByteArray());
	    	
	    	
	    	
	    }
		System.out.println(penetratedBase64);
		
		return penetratedBase64;
	}
	
	
	
	public static class Money implements Serializable{
		private int value;
		public static final long serialVersionUID = 9062282770556489963l;
		
	}
	
	public static class MoneyWithCurrency  implements Serializable{
		public static final long serialVersionUID = -1474896920071739101l;
		private int amount; 
		private String currency="";
		
	}
	
	public static class MoneyWithCurrencyAndSerial implements Serializable{
		 
		
		private static final long serialVersionUID =-4997187403367254147l;
		private int _amount;
		private String _currency="";
		private String _serial="";
	}
	
}

