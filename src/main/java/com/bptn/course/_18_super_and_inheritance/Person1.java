package com.bptn.course._18_super_and_inheritance;

class Person1 {
	   private String name;

	   public Person1(String theName) {
	      this.name = theName;
	   }

	   public String getName() {
	      return name;
	   }

	   public boolean setName(String theNewName) {
	      if (theNewName != null) {
	         this.name = theNewName;
	         return true;
	      }
	      return false;
	   }
	}

