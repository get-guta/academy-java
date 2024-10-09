package com.bptn.course._27_iterator;
import java.util.ArrayList;
import java.util.Iterator;


public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> myBooks = new ArrayList<>();


		  // Add 3 favorite books to this list
		  myBooks.add("Dark Matter".toLowerCase());
		  myBooks.add("Charlie and the Chocolate Factory".toLowerCase());
		  myBooks.add("Harry Potter".toLowerCase());


		  // Display all books
		  Iterator<String> iterator = myBooks.iterator();


		  while (iterator.hasNext()) {
		   String bookName = iterator.next();
		   System.out.println(bookName);
		  }

	}

}
