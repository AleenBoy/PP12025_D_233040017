package Pertemuan6;

import Pertemuan6.strukturList;


public class strukturListTest {
	//Main program latihan 2
//	public static void main(String[]args) {
//		strukturList list = new strukturList();
//		list.addTail(5);
//		list.addTail(4);
//		list.addTail(6);
//		
//		list.displayElement();
//	
//		System.out.println(list.find(6));
//	}
	
	//Main Program latihan 4
	 public static void main(String[] args) {
	        strukturList list = new strukturList();

	        // Tambah elemen(7, 6, 4, 2, 3)
	        list.addTail(7);
	        list.addTail(6);
	        list.addTail(4);
	        list.addTail(2);
	        list.addTail(3);

	        // Tampilkan elemen list
	        list.displayElement();

	        // Tampilkan size elemen list
	        System.out.println(list.size());
	    }
}

