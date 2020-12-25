package com.Hafta3ve4Odevi.Soru2;

import java.util.HashSet;
import java.util.Set;

public class Book implements Comparable<Book>{

	private String bookName;
	private int pageCount;
	private String publisher;
	private int publishYear;
	
	public Book(String bookName, int pageCount, String publisher, int publishYear) {
		this.bookName = bookName;
		this.pageCount = pageCount;
		this.publisher = publisher;
		this.publishYear = publishYear;

		}
	
	public String getbookName() {
		return bookName;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public int getPublishYear() {
		return publishYear;
	}
	
	
	@Override
	public int compareTo(Book book) {

		return this.getbookName().compareTo(book.getbookName());
	}
	
	@Override
	public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("[");
			builder.append(this.getbookName());
			builder.append(" - ");
			builder.append(this.getPageCount());
			builder.append(" - ");
			builder.append(this.getPublisher());
			builder.append(" - ");
			builder.append(this.getPublishYear());
			builder.append(" ] ");

			return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + pageCount;
		result = prime * result + publishYear;
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (pageCount != other.pageCount)
			return false;
		if (publishYear != other.publishYear)
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		return true;
	}
	
	
}
