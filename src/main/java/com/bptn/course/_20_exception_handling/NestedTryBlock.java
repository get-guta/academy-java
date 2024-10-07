package com.bptn.course._20_exception_handling;

public class NestedTryBlock{    
	 public static void main(String args[]){   
	 // Our outer try block   
	  try {
	    //   int z =39/0;    
	    try {    
	        // Our first inner try block:  
	        System.out.println("Going to divide by 0");    
	        int b =39/0;    
	    } catch(ArithmeticException e) {  
	        //The catch block for our first inner try block:  
	        System.out.println("You divided by zero: " + e);  
	    }       
	    // Our second inner try block  
	    try{    
	        int a[]=new int[5];    
	        // Attempting to assign a value outside of the array's boundaries:
	        a[5]=4;    
	    } catch(ArrayIndexOutOfBoundsException e) {  
	        // Catch block for our second inner try:
	        System.out.println("You attempted to assign a value to an out of bounds index: " + e);  
	    }    
	    System.out.println("The inner try blocks have finished running, and our initial try is complete.");    
	  }  catch(Exception e) {  
	    // Catch block for our original outer try:
	    System.out.println("There was an error outside of the conditions set by the inner trys!");  
	  }    
	  System.out.println("Try blocks have been run and we can now return to our regularly scheduled program.");    
	  }    
	}  