package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// affiche l'ensemble des elements du tableau

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}

		// affiche les elements inverse du tableau

		for (int i = array.length - 1; i >= 0; i--) {

			System.out.println(array[i]);

		}
		// affiche les entiers superieur a 3 du tableau

		for (int i = 0; i < array.length; i++) {

			if (array[i] >= 3) {
				System.out.println(array[i]);
			}
		}

		// affiche les entiers pairs
		for (int i = 0; i <= array.length - 1; i++) {

			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}

		}
		// affiche les entiers impairs

		for (int i = 0; i < 2; i++) {
			if (array[i] % 2 == 1) {
				System.out.println(array[i]);

			}

		}
		// affiche les valeurs de l'index pairs du tableau

		for (int i = 0; i <= array.length - 1; i = i + 2) {

			System.out.println(array[i]);

		}
		// affiche les valeurs de l'index impairs du tableau

		for (int i = 1; i <= array.length - 1; i = i + 2) {

			System.out.println(array[i]);

		}

	}

}
