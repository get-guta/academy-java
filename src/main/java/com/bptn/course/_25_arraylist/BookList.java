package com.bptn.course._25_arraylist;
import java.util.ArrayList;
import java.util.List;

public class BookList {
	
	public static void main(String[] args) {
		
		int counter =1;
		//Create a new ArrayList called "myBooks"
		List<String> myBooks = new ArrayList<>();
		
		
		//Add 3 favorite book to this list
		myBooks.add("ItEndsWithUs");
		myBooks.add("ItStartsWithUs");
		myBooks.add("Atomic Habits");
		
		//Display all Books
		
		System.out.println("My Favourite Books are: "+ myBooks);
		
		for(String book : myBooks) {
			System.out.println("Books: "+  counter + ":" + book);
			counter++;
		}
		
		//Display the first book from the list
		
		System.out.println(myBooks.get(0));
		//System.out.println(myBooks.getFirst());
		 myBooks.remove(1);
		System.out.println("My Favourite Books are: "+ myBooks);

		
		if(myBooks.contains("Atomic Habits".toLowerCase()))
		{
			System.out.println("Book Found");
			
		} else{
			System.out.println("Book Not Found");
		}
		
		System.out.println("Book Found"+ myBooks.size());
		System.out.println("Book Found"+ myBooks.get(myBooks.size()-1));

		
		myBooks.remove(1);

}
}