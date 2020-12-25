package com.Hafta3ve4Odevi.Soru2;

import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		
		Set<Book> books = new TreeSet<Book>();
		books.add(new Book("Java Book",  500, "Murat �zdilek", 2019));
		books.add(new Book("Python Book",430 , "Seyfi Y�lmaz" ,  2012));
		books.add(new Book("C# Book", 640, "Ayseg�l Durmaz", 2020));
		books.add(new Book("Ruby Book", 320, "Hasan Ay", 2014));
		books.add(new Book("Go Book", 420, "Selvi G�k", 2017));
		
		System.out.println("Alfabetik isim s�ralamas�na g�re");
		printsortedBooksbyName(books);
		
		BookComparatorByPageCount comparatorByPageCount = new BookComparatorByPageCount();	
		Set<Book> sortedBooks = new TreeSet<Book>(comparatorByPageCount);
		sortedBooks.addAll(books);
		
		System.out.println("Sayfa say�s�na g�re");
		printsortedBooksbyPage(books);
		 
     
	}

	private static<Book> void printsortedBooksbyName(Set<Book> sortedBooksbyBookName) {

		for(Book book : sortedBooksbyBookName) {
			System.out.println(book);
		}
		System.out.println("-----------------------\n");
	}
	
	private static<Book> void printsortedBooksbyPage(Set<Book> sortedBooksbyPageCount) {

		for(Book book : sortedBooksbyPageCount) {
			System.out.println(book);
		}
		System.out.println("-----------------------\n");
	}

}
