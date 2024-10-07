package com.bptn.course._23_interfaces;

interface Animal {
	 void sound();
	}


	interface Pet {
	 void play();
	}


	class Dog implements Animal, Pet {


	 @Override
	 public void play() {
	  System.out.println("Woof Woof");
	 }


	 @Override
	 public void sound() {
	  System.out.println("Dog is barking");
	 }


	}