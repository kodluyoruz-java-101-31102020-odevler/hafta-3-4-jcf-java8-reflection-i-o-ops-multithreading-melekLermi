package com.Hafta3ve4Odevi.Soru2;

import java.util.Comparator;

public class BookComparatorByPageCount implements Comparator<Book> {

	public int compare(Book book1Name, Book book2Name) {

		int book1PageCount = book1Name.getPageCount();
		int book2PageCount = book2Name.getPageCount(); 
		
		if(book2PageCount > book2PageCount) {
			return -1;
		}
		else if(book1PageCount > book2PageCount) {
			return 1;
		}
		else {
			return 0;
		}
	}	

}
