package Model;

import java.util.ArrayList;

public interface RubikCube {
	public ArrayList<StdCube> tabCube = new ArrayList<StdCube>();
	
	/**
	 * Initialise le RubikCube
	 */
	public void init();
	
	/**
	 * Permet de choisir le cube sur lequel va s'appliquer un mouvement
	 * @param i
	 */
	//public void chooseCube(int i);
	 
	/**
	  * Permet de choisir le mouvement à appliquer
	  * @param c
	  */
	public void chooseMovement(char c);
	
	/**
	 * Effectue une rotation a gauche
	 */
	public void rotateLeft();
	
	/**
	 * Effectue une rotation à droite
	 */
	public void rotateRight();
	
	/**
	 * Effectue un rotation en haut
	 */
	public void rotateUp();
	
	/**
	 * Effectue une rotation en bas
	 */
	public void rotateDown();
	
	/**
	 * Fait tourner la face avant sur la droite
	 */
	public void rotateFrontRight();
	
	/**
	 * Fait tourner la face arrière sur la droite
	 */
	public void rotateRearRight();
	/**
	 * Affiche le rubikCube sous forme de texte
	 */
	public void printCube();
}
