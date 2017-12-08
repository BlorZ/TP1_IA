package tp1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Taquin {
	private  static final Logger LOGGER = Logger.getLogger(Taquin.class.getName());
	int taille = 3;
	public int taquin[][] = new int[taille][taille];
	
	
	public Taquin() {
		super();
	}
	
	public void initialisation() {
		int i;
		int j;
		int k;
		int l;
		List<Integer> list = new ArrayList<>();
		for(i=0; i<this.taille*this.taille; i++) {
			list.add(i);
		}
		for (i=0;i<this.taille;i++) {
			for(j=0;j<this.taille;j++) {
				k=(int) (Math.random()*list.size());
				l=list.get(k);
				taquin[i][j]=l;
				list.remove(k);
			}
		}
	}
	
	public void initialisationEtatFinal() {
		int i,j,k;
		k=0;
		for (i=0;i<this.taille;i++) {
			for(j=0;j<this.taille;j++) {
				taquin[i][j]=k;
				k++;
			}
		}
	}
	
	public String toString() {
		int i,j;
		for (i=0;i<this.taille;i++) {
			System.out.println("");
			for(j=0;j<this.taille;j++) {
				System.out.print("|");
				System.out.print(taquin[i][j]);
			}
			System.out.print("|");
		}
		System.out.println("");
		return null;
	}
	
	public int nbPiecesMalPlacee() {
		int nbPM=0;
		int i;
		int j;
		int k;
		for (i=0;i<this.taille;i++) {
			for(j=0;j<taille;j++) {
				switch(i) {
					case 0 : 
						k = 0;
						break;
					case 1 : 
						k = 3;
						break; 
					case 2 : 
						k = 6;
						break;
					default : k=0;
				}
				if(this.taquin[i][j] != j+k)
					nbPM++;
			}
		}
		return nbPM;
	}
	
	public int distanceManhattan() {
		int dM = 0;
		int x, y;
		for (int i=0;i<this.taille;i++) {
			for(int j=0;j<this.taille;j++) {
				x= trouveX(this.taquin[i][j]);
				y = trouveY(this.taquin[i][j]);
				dM+=calculX(x, i);
				dM+=calculY(y, j);
			}
		}
		return dM;
	}

	public int calculX(int x, int x1) {
		int dM = 0;
		if(x1>x) {
			dM += x1-x;
			return dM;
		}
		if(x1<x) {
			dM += x-x1;
			return dM;
		}
		return dM;
	}
	
	public int calculY(int y, int y1) {
		int dM= 0;
		if(y1>y) {
			dM = y1-y;
			return dM;
		}
		if(y1<y) {
			dM = y-y1;
			return dM;
		}
		return dM;
	}
	
	public int trouveX(int valeur) {
		switch(valeur) {
			case 0 : return 0;
			case 1 : return 0;
			case 2 : return 0;
			case 3 : return 1;
			case 4 : return 1;
			case 5 : return 1;
			case 6 : return 2;
			case 7 : return 2;
			case 8 : return 2;
			default : {
				LOGGER.warning("Warning : Il y a eu un incident avec les valeurs, X= -1");
				return -1;
			}
		}
	}
	
	public int trouveY(int valeur) {
		switch(valeur) {
			case 0 : return 0;
			case 1 : return 1;
			case 2 : return 2;
			case 3 : return 0;
			case 4 : return 1;
			case 5 : return 2;
			case 6 : return 0;
			case 7 : return 1;
			case 8 : return 2;
			default : {
				LOGGER.warning("Warning : Il y a eu un incident avec les valeurs, Y= -1");
				return -1;
			}
		}
	}
}
