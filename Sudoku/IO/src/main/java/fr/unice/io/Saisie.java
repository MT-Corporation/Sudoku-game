package fr.unice.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Saisie {
	
	/* Methode pour lire un fichier de grille  et stocker dans une ArrayList */
	public ArrayList<String> readFromFile(String filename) {
		ArrayList<String> lesLignes = new ArrayList<>();
		
	    try {
	    	//getResourceAsStream
	    	//Saisie.class.getResourceAsStream("");
	    	
	    	File f = new File(filename);
            FileReader reader = new FileReader(f);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line ;
            while ((line = bufferedReader.readLine()) != null) {
                	lesLignes.add(line);
            } 
            reader.close();
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
	    	
}
	
