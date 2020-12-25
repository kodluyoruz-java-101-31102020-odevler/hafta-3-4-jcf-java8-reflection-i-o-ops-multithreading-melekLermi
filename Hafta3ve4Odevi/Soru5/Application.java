package com.Hafta3ve4Odevi.Soru5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.Hafta3ve4Odevi.Soru2.Book;

public class Application {

	public static void main(String[] args) {

		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Java Book",  50, "Murat �zdilek", 2019));
		books.add(new Book("Python Book",430 , "Seyfi Y�lmaz" ,  2012));
		books.add(new Book("C# Book", 640, "Ayseg�l Durmaz", 2020));
		books.add(new Book("Ruby Book", 20, "Hasan Ay", 2014));
		books.add(new Book("Go Book", 420, "Selvi G�k", 2017));
		books.add(new Book("Java8 Book",  100, "Murat Hasan �zdilek", 2011));
		books.add(new Book("Python Book for Beginner",130 , "Seyfi Ali Y�lmaz" ,  2015));
		books.add(new Book("C# Book for Beginner", 40, "Ayseg�l Buse Durmaz", 2003));
		books.add(new Book("Ruby Book for Beginner", 320, "Hasan Fethi Ay", 2018));
		books.add(new Book("Go Book for Beginner", 426, "Selvi Naz G�k", 2015));
		
		System.out.println("-------Kitap Listesi--------\n");	
		
		Stream<Book> stream = books.stream();
		
		Consumer<? super Book> printer = (book) -> {
			System.out.println(book);
		};
		stream.forEach(printer);
		
		Map<String, String> booksMap = new HashMap<String, String>();// books.getbookName(), book.getPublisher())));
		booksMap.put("Java Book","Murat �zdilek"); 
		booksMap.put("Python Book","Seyfi Y�lmaz");  // HashMap �ift de�erlere izin verir
		booksMap.put("C# Book","Ayseg�l Durmaz"); 
		booksMap.put("Go Book for Beginner","Hasan Fethi Ay");
		booksMap.put("Go Book for Beginner", "Selvi Naz G�k");
		
	        System.out.println("\n-----------Kitap Ad� : Yazar Ad� -----------"); 
	        for (Iterator<Entry<String, String>> iterator = booksMap.entrySet().iterator(); iterator.hasNext();) {
				Entry<String, String> m = iterator.next();
				System.out.println(m.getKey()+" "+m.getValue());
	        }
		
		
		System.out.println("\n-------Sayfa say�s� 100'den fazla olan kitaplar-------\n");

		Predicate<Book> greaterThan100 = (book) -> {

			if (book.getPageCount() > 100) {
				return true;
			}

			return false;
		};

		Set<Book> greaterThan100List = books.stream().filter(greaterThan100).collect(Collectors.toSet());

		Consumer<Book> bookPrinter = (book) -> System.out.println(book);

		greaterThan100List.stream().forEach(bookPrinter);
		
	}

	
}
