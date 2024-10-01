package com.bptn.course._08_object_oriented;

 class Department {
	 
	 private String deptName;
	 private int noOfEmpl;
	 public Department(String deptName, int noOfEmpl){
		  this.deptName = deptName;
		  this.noOfEmpl = noOfEmpl;			  
	 }
	 
	 public void displayDepartmentInfo() {
		 
		 System.out.println("Department Name:"+deptName);
		 System.out.println("Number of Employees: "+ noOfEmpl);
		 
	 }

}
