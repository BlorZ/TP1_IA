//TP R�alis� par Valentin MORIN et Dahavid DUPONT
// Etudiants en MASTER TNSI � l'UVHC

package tp1;

import java.util.logging.Logger;

public class Main {
	private static final Logger LOGGER= Logger.getLogger(Main.class.getName());
	
		public static void main(String [] args)
		{
			final Taquin t=new Taquin();
			final Taquin taquinFinal = new Taquin();
			t.initialisation();
			taquinFinal.initialisationEtatFinal();
			t.toString();
			taquinFinal.toString();
			int nbMP = t.nbPiecesMalPlacee();
			LOGGER.info(nbMP + " pi�ces ne sont pas correctement plac�es");
			int dM = t.distanceManhattan();
			LOGGER.info("La somme des distances de Manhattan est " + dM);
			
			//r�solution taquin
			//Interdire les �tats r�p�t�s
			//faire une fonction d�placer=> faire un tableau de possibilit�
			//pour retenir les possibilit�s
			//faire un arbre de recherche pour trouver la solution
			//comparer a chaque boucle a la solution finale
		}
}
