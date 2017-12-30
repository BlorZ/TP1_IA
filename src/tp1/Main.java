//TP R�alis� par Valentin MORIN et surtout par Dahavid DUPONT
// Etudiants en MASTER TNSI � l'UVHC

package tp1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
	private static final Logger LOGGER= Logger.getLogger(Main.class.getName());
	
		public static void main(String [] args) throws Exception
		{
			final Taquin t=new Taquin();
			final Taquin taquinFinal = new Taquin();
			//t.initialisation();
			
			taquinFinal.initialisationEtatFinal();
			t.toString();
			taquinFinal.toString();
			int nbMP = t.nbPiecesMalPlacee();
			LOGGER.info(nbMP + " pi�ces ne sont pas correctement plac�es");
			int dM = t.distanceManhattan();
			LOGGER.info("La somme des distances de Manhattan est " + dM);
			
			List<Integer> dist = new ArrayList<>();
			for(int i=0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					if(t.taquin[i][j]!= 0) {
						int distance = t.distanceManhattanUnique(i, j);
						dist.add(distance);
					}
				}
			}
			
			List<int[][]> etats = new ArrayList<>();
			
			int[]coordonnesCase0 = t.trouve0();
			int[]coordonnesPieceADeplacer = t.trouvePieceADeplacer();
			
			for(int i = 0; i<5 ;i++) {
				t.deplacer(etats, coordonnesCase0, coordonnesPieceADeplacer);
				t.toString();
			}
		
			//fonction pour interdire les etats r�p�t�s : si etat pr�sent dans la liste "etats" faire la fonction d�placer avec une autre piece
			// comment faire? �a y�ss�po
		}
}
