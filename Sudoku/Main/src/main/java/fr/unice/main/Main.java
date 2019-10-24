package fr.unice.main;

import java.util.ArrayList;
import fr.unice.gui.Grille;
import fr.unice.io.Saisie;

//import fr.unice.gui

/* Classe main qui  */
public class Main {
	
	private Grille grille;
	private Saisie saisie;
	private ArrayList<String> mesCoups;
	private boolean estTermine = false;
	
	/* Constructeur qui créer une instance  de grille et de saisie */
	
	public Main() {
		grille = new Grille();
		saisie = new Saisie();
		init();
	}
	
	/* chargement d'un fichier de grille et affiche la grille */
	
	public void init() {
		mesCoups = saisie.readFromFile();
		grille.afficheGrille(mesCoups);
	}
	
	/* La boucle de jeu : tans que c'est pas la fin , ecrit et affiche la grille après chaque coup */
	
	public void jouer() {
		do {
			saisie.writeFromArray(mesCoups);
			grille.afficheGrille(mesCoups);
		} while (!estTermine);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.jouer();
	}

}
