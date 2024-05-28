package com.src.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		
		
		String dateText = "15-02-1998";
		
		
		extractDate(dateText);
	}

	/**
	 * @param dateText
	 */
	private static void extractDate(String dateText) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	        try {
	            Date date = dateFormat.parse(dateText);
	            System.out.println(date);
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	}

}
