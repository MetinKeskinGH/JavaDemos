package loopDemo;

public class Main {

	public static void main(String[] args) {
		//for
		for (int i = 2; i<10; i+=2) {
			System.out.println(i);
		}
		System.out.println("FOR DÖNGÜSÜ BİTTİ");
		
		//while
		int i = 1;
		while (i<10) {
			System.out.println(i);
			i++;
			
		}
		System.out.println("WHILE DÖNGÜSÜ BİTTİ");
		
		
		//DO WHILE 
		int j = 1;
		do {
			System.out.println(j);
			j+=2;
		} while (j<10);
		System.out.println("DO WHILE DÖNGÜSÜ BİTTİ");
	}

}
