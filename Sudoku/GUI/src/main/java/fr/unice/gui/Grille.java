package fr.unice.gui;

import java.util.ArrayList;

import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.elements.Label;
import com.indvd00m.ascii.render.elements.Table;

/*
 * 
 */

/* Constructeur   de grille sudoko*/
public class Grille {
	
	private static Table table;
	private static IContextBuilder builder;
	private static IRender render;
	public Grille() {
		init();
	}
	
	/*
	 * 
	 */
	/* Initialisatiion de la grille sudoku */
	public void init() {
		 render = new Render();
		 builder = render.newBuilder();
		builder.width(70).height(30);
		 table = new Table(10, 9);
	}
	
	// Methode pour numéroter les lignes de la grille
	
	public void numeroterGrillle() {
		for(int i =1; i<10; i++) {
			table.setElement(1, i,  new Label("N°" + String.valueOf(i)), true);
		}
	}
	
	/* Methode qui prend en paramètre une ArrayList grille et l'affiche */
	
	public void afficheGrille (ArrayList<String> tabGrille) { 
	
		for (int i = 1; i < tabGrille.size()+1; i++) {
			//System.out.println("Haut :"+tabGrille.size());
			for (int j = 2; j < tabGrille.get(i-1).length()+2; j++) {
			//System.out.println("bas :"+tabGrille.get(i).length());
				String value = String.valueOf(tabGrille.get(i-1).charAt(j-2));
				table.setElement(j, i, new Label(value));
				
			}
		}
		numeroterGrillle();
		builder.element(table);
		ICanvas canvas = render.render(builder.build());
		String s = canvas.getText();
		System.out.println(s);
		
	}
}
