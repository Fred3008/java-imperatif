package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {

			int count = i + 1;
			System.out.println(count);

		}

		for (int k = 0; k < 20; k++) {
			// affiche le nom et prenom 20 fois
			int num = k + 1;
			String chaine = "Fredric LOPES " + num;
			System.out.println(chaine);

		}
		// affiches les entiers pairs de 1 a 99
		for (int pairs = 1; pairs <= 99; pairs += 2) {
			int num = pairs + 1;
			System.out.println(num);
		}
		// affiches les entiers impairs de 3 A 99

		for (int impairs = 2; impairs <= 99; impairs += 2) {
			int num = impairs + 1;
			System.out.println(num);
		}

	}

}
