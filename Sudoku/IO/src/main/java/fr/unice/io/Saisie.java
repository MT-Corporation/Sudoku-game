package fr.unice.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;



public class Saisie {
	
	/* Methode pour lire un fichier de grille  et stocker dans une ArrayList */
	public ArrayList<String> readFromFile() {
		ArrayList<String> lesLignes = new ArrayList<>();
		
	    try {
	    	//getResourceAsStream
	    	//Saisie.class.getResourceAsStream("");
	    	
	    	/*File f = new File(filename);
            FileReader reader = new FileReader(f);
            BufferedReader bufferedReader = new BufferedReader(reader);*/ 
	    	
	    	/* la methode getRessourceAsStream permet de recherche le fichier text dans le repertoire ressource */
	    	
	    	InputStream inputStream = Saisie.class.getClassLoader().getResourceAsStream("firstGrid.txt");
	    	InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8 );
	    	BufferedReader bufferedReader = new BufferedReader(streamReader);
            String line ;
            while ((line = bufferedReader.readLine()) != null) {
                	lesLignes.add(line);
            } 
            bufferedReader.close();
	    }
             catch (IOException e) {
                e.printStackTrace();
         }
	   
	    return lesLignes;
	    }
	
	/* Methode pour écrire la saisie de l'utilisateur dans un ArrayList */
	
	public void writeFromArray(ArrayList<String> lesCoups) {
		System.out.println("Veuillez renseigner trois chiffres compris entre 1 et 9 :");
			String saisie ="";
			Scanner sc = new Scanner(System.in);
			saisie = sc.nextLine();
			char row = saisie.charAt(0);
			char col = saisie.charAt(1);
			char value = saisie.charAt(2);
			
			int l = Character.getNumericValue(row) - 1;
			int c = Character.getNumericValue(col) - 1;
			
			String laLigne = lesCoups.get(l);
			StringBuilder sb = new StringBuilder(laLigne);
			sb.setCharAt(c, value);
			lesCoups.remove(l);
			lesCoups.add(l, sb.toString());
	}
	
	/* methode qui verifier et affiche un message  si la valeur rentrée est incorrect  */
	    	
}


	
