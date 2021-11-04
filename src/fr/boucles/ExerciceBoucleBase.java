package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {

			int count = i + 1;
			System.out.println(count);

		}

		for (int k = 0; k < 20; k++) {
			// calcul du num de i;
			int num = k + 1;
			String chaine = "Fredric LOPES " + num;
			System.out.println(chaine);

		}

		for (int pairs = 1; pairs <= 99; pairs += 2) {
			int num = pairs + 1;
			System.out.println(num);
		}

		for (int impairs = 2; impairs <= 99; impairs += 2) {
			int num = impairs + 1;
			System.out.println(num);
		}

	}

}
