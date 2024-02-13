package arraysDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		String ogrenci1 = "Engin";
		String ogrenci2 = "Metin";
		String ogrenci3 = "Abuzer";
		String ogrenci4 = "Salih";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("--------------------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Metin";
		ogrenciler[2] = "Abuzer";
		ogrenciler[3] = "Salih";
		//ogrenciler[4]= "Ali";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("--------------------------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
