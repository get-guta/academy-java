package com.bptn.course._08_object_oriented;

 class TechDepartment extends Department {
	 
	 private double totalPurchaseAmount;
	 
	
	 public TechDepartment(String deptName, int noOfEmpl, double totalPurchaseAmount) {
		
		 super(deptName, noOfEmpl);	
		 this.totalPurchaseAmount = totalPurchaseAmount;
		 
	}

	 
	 

}
