package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		for (int i = 0; i <= 10; i += 2) {
			System.out.println(i);
		}
		
		for (int i = 0; i <= 9; i += 3) {
			System.out.println(i);
		}
		//affiche les entiers de 1 a 10
		int i = 1 ;
		while (i <= 10) {
			int num = i++;
			System.out.println(num);

		}
		//affiche les entiers pairs de 0 a 10
		int j = 0 ;
		while (j < 10) {
			int num = j += 2;
			System.out.println(num);
		}
		//affiche les entiers impairs de 0 a 9
		int k = 0 ;
		while (k < 9) {
			int num = k += 3;
			System.out.println(num);
		}

	}

}
