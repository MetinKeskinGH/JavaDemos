package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'A';
		
		switch (grade) {
		case 'A':
			System.out.println("MÜKEMMEL GEÇTİNİZ!");
			break;
		case'B':
			System.out.println("İYİ GEÇTİNİZ!");
			break;
		case'C':
			System.out.println("ORTA GEÇTİNİZ");
			break;
		case'D':
			System.out.println("FENA DEĞİL GEÇTİNİZ!");
			break;
		case'F':
			System.out.println("KALDIN SINIF TEKRARI");
			break;
			
		default:
			System.out.println("GEÇERSİZ DEĞER GİRDİNİZ!");
		}
	}

}
