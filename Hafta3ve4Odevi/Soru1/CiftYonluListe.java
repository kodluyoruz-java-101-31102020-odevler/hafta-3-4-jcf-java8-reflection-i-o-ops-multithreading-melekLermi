package com.Hafta3ve4Odevi.Soru1;

public class  CiftYonluListe <T> {
	
	private Link <T> first;
	private Link <T> last;

	public CiftYonluListe() {
		this.first = null; 
		this.last = null;
	}
	
	public boolean IsEmpty() {
		return first == null;
	}

	public void addBeginning(T nn) {
		Link <T> newNode = new Link<T>(nn); 

		if (IsEmpty()) { 
			last = newNode;
		}
		else {
			first.previous = newNode; 
			newNode.next = first; 
			first = newNode; 
		}
	}
	
	public void addEnd(T nn) {
		
		Link <T> newNode = new Link<T>(nn); 
		if (IsEmpty()) {
			first = newNode; 
		}
		else {
			last.next = newNode; 
			newNode.previous = last;
		}
		last = newNode; 
	}

	public Link <T> deleteBeginning() {
		
		Link <T> backup = first;
		if (first.next == null) {
			last = null; 
		}
		else {
			first.next.previous = null; 
		}
		first = first.next; 
		return backup;
	}

	
	public Link <T> deleteEnd() {
		
		Link <T> backup = last;
		
		if (first.next == null) {
			first = null;
		}
		else {
			last.previous.next = null;
		}
		
		last = last.previous;
		
		return backup;
	}

	public boolean addEnd(T key, T nn) { 
		
		Link <T> active = first;
		while (active.data != key) {
			
			active = active.next;
			if (active == null)
				return false; 
		}
		
		Link <T> newNode = new Link <T>(nn); 

		if (active == last) {
			newNode.next = null; 
			last = newNode;
		}
		else {
			newNode.next = active.next; 		
			active.next.previous= newNode;
		}
		
		newNode.previous = active; 
		active.next= newNode;
		
		return true; 
	}

	public Link <T> deleteSelected(T key) { 
		Link <T> active = first; 
		
		while (active.data != key) {
			active = active.next; 
			if (active == null)
				return null; 
		}
		
		if(active == first) {
			first = active.next; 
		}
		else {				
			active.previous.next = active.next;
		}

		if(active == last) {
			last = active.previous;
		}
		else {
			active.next.previous = active.previous;
		}
		
		return active;
		
	}

	public void print() {
		
		System.out.print("List : ");
		Link <T> active = first; 
		
		while (active != null) {
			active.list(); 
			active = active.next; 
		}
		
		System.out.println("");
	}

}