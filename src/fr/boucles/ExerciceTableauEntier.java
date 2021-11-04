package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// affiche le 1er elements du tableau

		System.out.println(tab[0]);

		// affiche tous les elements du tableau
		System.out.println(tab.length);

		// affiche le dernier elements du tableau
		System.out.println(tab[9]);

		for (int i = 0; i < tab.length; i++) {

			System.out.println(tab[i]);
		}

		// remplace l'index 4 par le nombre 8
		System.out.println(tab[4]);
		tab[4] = 8;

		// tab = Arrays.copyOf(tab, tab.length);
		// tab[tab.length - 5] = 8;
		System.out.println(tab[4]);

	}

}
