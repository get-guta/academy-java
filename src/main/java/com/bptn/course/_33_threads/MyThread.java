package com.bptn.course._33_threads;

public class MyThread extends Thread {


	 @Override
	 public void run() {
	  for (int i = 0; i < 5; i++) {
	   System.out.println("Thread: " + Thread.currentThread().getName());
	  }


	 }


	}