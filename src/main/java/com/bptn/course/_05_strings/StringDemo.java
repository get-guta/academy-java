package com.bptn.course._05_strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userName = " testuser ";
		System.out.println(userName.length());
		System.out.println(userName.charAt(2));
		System.out.println(userName.substring(4));
		System.out.println(userName.substring(2,3));
		System.out.println(userName.equals("testUser"));
		System.out.println(userName.trim());
		System.out.println(userName.indexOf('s'));




	}

}
