package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		int[] arrayCopy = new int[array.length];

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);

			System.out.println();

		}
		// affiche le tableau inverse

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		// affiche une copie du 1er tableau

		for (int i = 0; i < arrayCopy.length; i++) {
			arrayCopy[i] = array[i];

			System.out.println("2e tableau : " + arrayCopy[i] + "  1er tableau : " + array[i]);
		}

	}

}
