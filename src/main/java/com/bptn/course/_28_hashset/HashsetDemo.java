package com.bptn.course._28_hashset;
import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		HashSet<String> mySet = new HashSet<>();


		  mySet.add("Toronto");
		  mySet.add("Vancouver");
		  mySet.add("Hamilton");
		  mySet.add("Hamilton");
		  mySet.add("Hamilton");
		  mySet.add("Hamilton");


		  System.out.println(mySet);


		  System.out.println(mySet.contains("toronto"));


		  mySet.remove("Hamilton");
		  System.out.println(mySet);

	}

}
