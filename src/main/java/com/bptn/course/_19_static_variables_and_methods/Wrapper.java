package com.bptn.course._19_static_variables_and_methods;

public class Wrapper {
	   public static void main(String[] args) {
	     Integer i = 2;
	     Double d = 3.5;
	     System.out.println( i.intValue() ); // intValue() returns the primitive value
	     System.out.println( d.doubleValue() );

	     String ageStr = "16";
	     // Integer.parseInt and Double.parseDouble are often used to
	     // convert an input string to a number so you can do math on it.
	     System.out.println("Age " + ageStr + " in 10 years is " + (Integer.parseInt(ageStr) + 10) );
	     System.out.println("Note that + with strings does concatenation, not addition: " + (ageStr + 10));
	   }
	}

