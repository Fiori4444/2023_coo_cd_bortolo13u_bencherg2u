package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import donnees.*;
import XML.ChargeurMagasin;

/**
 * permet de charger un magasin de test
 */
public class MainChargeurMagasin {

	/**
	 * methode principale
	 * 
	 * @param args
	 *            inutilise
	 * @throws IOException
	 *             en cas de probleme de lecture entree/sortie
	 */
	public static void main(String args[]) throws IOException {
		
		String repertoire = "musicbrainzSimple/";
		ChargeurMagasin charge = new ChargeurMagasin(repertoire);
		Magasin resultat = charge.chargerMagasin();
		//System.out.println(resultat);

		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		sc.close();



		resultat.trier(new ComparateurArtiste());
		System.out.println(resultat);
		resultat.trier(new ComparateurAlbum());
		System.out.println(resultat);
		resultat.trier(new ComparateurNbPistes());
		System.out.println(resultat);
		ArrayList<CD> lstCd= resultat.chercherArtiste(new SelecteurArtiste("Justin Bieber"));
		for (CD cd : lstCd) {
			System.out.println(cd);
		}




	}

}
