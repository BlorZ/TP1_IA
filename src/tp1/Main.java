//TP R�alis� par Valentin MORIN et Dahavid DUPONT
// Etudiants en MASTER TNSI � l'UVHC

package tp1;

import java.util.Scanner;

public class Main {

		public static void main(String [] args)
		{
			final Taquin t=new Taquin();
			Scanner sc = new Scanner(System.in);
			int taille = sc.nextInt();
			t.initialisation(taille);
			t.toString(taille);
			int nbMP = t.nbPiecesMalPlacee(t, taille);
			System.out.println("\n"+ nbMP + " pi�ces sont mal plac�es");
			sc.close();
			
			//r�solution taquin
			//Interdire les �tats r�p�t�s
			//faire une fonction d�placer=> faire un tableau de possibilit�
			//pour retenir les possibilit�s
			//faire un arbre de recherche pour trouver la solution
			//comparer a chaque boucle a la solution finale
		}
}
