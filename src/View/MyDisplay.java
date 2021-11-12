package View;

import java.awt.*;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * QST 6: AWT et Swing sont deux outils permettant de créer des interfaces utilisateur graphiques riches.
 * La principale différence entre AWT et Swing en Java réside dans le fait qu'AWT est la boîte à outils de widgets dépendant de la plate-forme,
 * l'interface graphique et l'interface utilisateur de Java.
 * Tandis que Swing est une boîte à outils de widgets d'interface graphique pour Java qui est une extension d'AWT.. 
 * @author chirazy
 *
 */

public class MyDisplay extends JPanel{
	/**
	 * QST 5 : La méthode paintComponent est appelée à chaque fois que le composant nécessite d'être redessiné
	 * @param g
	 */
	protected void paintComponent (Graphics2D g) {
		super.paintComponent(g); 
		//super.paintComponent(g); : il est toujours ainsi nécessaire quand on redéfinit la méthode paintComponent de faire appel au début de la méthode à super.paintComponent(g);
		//la méthode paintComponent de la superclasse pour qu'elle effectue son propre travail et en particulier le coloriage du fond.
		Graphics2D g2D= (Graphics2D) g;
		g.drawLine(10, 60, 60, 60);
	}
	
	public static void main(String []args){
		/**
		 * Création de JFrame sous titre "Java Avancé - Graphic Display"
		 */
		JFrame frame = new JFrame("Java Avancé - Graphic Display"); 
		/**
		 * Pour redimensionner un frame (largeur, Hauteur)
		 */
		frame.setSize(new Dimension(500,500));
		/**
		 * Afficher la fenêtre 
		 */
		frame.setVisible(true);
		/**
		 * Permet de fermer la fenetre. Et l'utilisation de "JFrame.EXIT_ON_CLOSE" permet de
		 * quitter l’application(JFrame) et libèrer de la mémoire.
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 MyDisplay d = new MyDisplay();
		 frame.add(d);
		 //Model m;
		 }

	

}
