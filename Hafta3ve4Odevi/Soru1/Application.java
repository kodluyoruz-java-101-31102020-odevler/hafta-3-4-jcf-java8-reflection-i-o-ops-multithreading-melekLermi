package com.Hafta3ve4Odevi.Soru1;

public class Application {

	public static void main(String[] args) {
		
		CiftYonluListe<Integer> list = new CiftYonluListe<Integer>();

		list.addBeginning(19);
		list.addBeginning(96);
		list.addBeginning(47);
		
		list.addEnd(72); 
		list.addEnd(81);
		list.addEnd(61);

		list.print(); 

		list.deleteBeginning(); 
		list.deleteEnd(); 
		list.deleteSelected(96); 
		list.print(); 
		list.addEnd(19, 20); 
		list.addEnd(81, 80); 

		list.print(); 
		
		CiftYonluListe<String> list2 = new CiftYonluListe<String>();

		list2.addBeginning("m"); 
		list2.addBeginning("e");
		list2.addBeginning("l");

		list2.addEnd("L"); 
		list2.addEnd("R");
		list2.addEnd("I");

		list2.print(); 

		list2.deleteBeginning(); 
		list2.deleteEnd(); 
		list2.deleteSelected("m"); 

		list2.print(); 

		list2.addEnd("e", "k"); 
		list2.addEnd("L", "M"); 
		list2.print(); 
	} 
		

	}