package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class StdRubikCube implements RubikCube{

	//Etudier la possibilité de crée tempo cube dans init
	//Et de rajoute une méthode updateTempoCube
	private ArrayList<StdCube> startList = new ArrayList<StdCube>();
	private ArrayList<StdCube> iaList = new ArrayList<StdCube>();
	private char rotation[] = {'l', 'r','u','d','f','o'};
	public ArrayList<Character> solution = new ArrayList<Character>();
	@Override
	public void init() {
		StdCube c;

		//Boucle d'initialisation de l'arraylist contenant les cubes
		for(int i =0; i <= 23; i++){
			c = new StdCube();
			if(i <= 3){
				c.setColor(java.awt.Color.RED);
				tabCube.add(c);
			}
			else if(i > 3 && i <= 7){
				c.setColor(java.awt.Color.BLUE);
				tabCube.add(c);
			}
			else if(i > 7 && i <= 11){
				c.setColor(java.awt.Color.YELLOW);
				tabCube.add(c);
			}
			else if(i > 11 && i <= 15){
				c.setColor(java.awt.Color.WHITE);
				tabCube.add(c);
			}
			else if(i > 15 && i <= 19){
				c.setColor(java.awt.Color.BLACK);
				tabCube.add(c);
			}
			else{
				c.setColor(java.awt.Color.GREEN);
				tabCube.add(c);
			}
		}
		//Fin de la boucle, on mélange l'arrayList
		//Collections.shuffle(tabCube);
		//updateTempoCube();
	}
	@Override
	public void chooseMovement(char c) {
		switch(c){
			case 'l':
				rotateLeft();
			case 'r':
				rotateRight();
			case 'u':
				rotateUp();
			case 'd':
				rotateDown();
			case 'f':
				rotateFrontRight();
			case 'e':
				rotateRearRight();
			default:
				System.out.println("error");
		}
	}

	@Override
	public void rotateLeft() {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(tabCube.get(i).getColor());
		}
		tabCube.get(0).setColor(tempoCube.get(16).getColor());
		tabCube.get(2).setColor(tempoCube.get(18).getColor());
		tabCube.get(16).setColor(tempoCube.get(11).getColor());
		tabCube.get(18).setColor(tempoCube.get(9).getColor());
		tabCube.get(11).setColor(tempoCube.get(20).getColor());
		tabCube.get(9).setColor(tempoCube.get(22).getColor());
		tabCube.get(22).setColor(tempoCube.get(2).getColor());
		tabCube.get(20).setColor(tempoCube.get(0).getColor());
		tabCube.get(12).setColor(tempoCube.get(14).getColor());
		tabCube.get(14).setColor(tempoCube.get(15).getColor());
		tabCube.get(15).setColor(tempoCube.get(13).getColor());
		tabCube.get(13).setColor(tempoCube.get(12).getColor());	
	}
	
	public void rotateLeftOver() {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(tabCube.get(i).getColor());
		}
		tabCube.get(16).setColor(tempoCube.get(0).getColor());
		tabCube.get(18).setColor(tempoCube.get(2).getColor());
		tabCube.get(11).setColor(tempoCube.get(16).getColor());
		tabCube.get(9).setColor(tempoCube.get(18).getColor());
		tabCube.get(20).setColor(tempoCube.get(11).getColor());
		tabCube.get(22).setColor(tempoCube.get(9).getColor());
		tabCube.get(2).setColor(tempoCube.get(22).getColor());
		tabCube.get(0).setColor(tempoCube.get(20).getColor());
		tabCube.get(14).setColor(tempoCube.get(12).getColor());
		tabCube.get(15).setColor(tempoCube.get(14).getColor());
		tabCube.get(13).setColor(tempoCube.get(15).getColor());
		tabCube.get(12).setColor(tempoCube.get(13).getColor());	
	}

	@Override
	public void rotateRight() {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(tabCube.get(i).getColor());
		}
		tabCube.get(1).setColor(tempoCube.get(17).getColor());
		tabCube.get(3).setColor(tempoCube.get(19).getColor());
		//tabCube.get(17).setColor(tempoCube.get(8).getColor());
		//tabCube.get(19).setColor(tempoCube.get(10).getColor());
		tabCube.get(17).setColor(tempoCube.get(10).getColor());
		tabCube.get(19).setColor(tempoCube.get(8).getColor());
		tabCube.get(8).setColor(tempoCube.get(23).getColor());
		tabCube.get(10).setColor(tempoCube.get(21).getColor());
		tabCube.get(21).setColor(tempoCube.get(1).getColor());
		tabCube.get(23).setColor(tempoCube.get(3).getColor());
		//Valide
		tabCube.get(4).setColor(tempoCube.get(5).getColor());
		tabCube.get(5).setColor(tempoCube.get(7).getColor());
		tabCube.get(7).setColor(tempoCube.get(6).getColor());
		tabCube.get(6).setColor(tempoCube.get(4).getColor());
	}
	
	public void rotateRightOver() {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(tabCube.get(i).getColor());
		}
		tabCube.get(17).setColor(tempoCube.get(1).getColor());
		tabCube.get(19).setColor(tempoCube.get(3).getColor());
		//tabCube.get(17).setColor(tempoCube.get(8).getColor());
		//tabCube.get(19).setColor(tempoCube.get(10).getColor());
		tabCube.get(10).setColor(tempoCube.get(17).getColor());
		tabCube.get(8).setColor(tempoCube.get(19).getColor());
		tabCube.get(23).setColor(tempoCube.get(8).getColor());
		tabCube.get(21).setColor(tempoCube.get(10).getColor());
		tabCube.get(1).setColor(tempoCube.get(21).getColor());
		tabCube.get(3).setColor(tempoCube.get(23).getColor());
		//Valide
		tabCube.get(5).setColor(tempoCube.get(4).getColor());
		tabCube.get(7).setColor(tempoCube.get(5).getColor());
		tabCube.get(6).setColor(tempoCube.get(7).getColor());
		tabCube.get(4).setColor(tempoCube.get(6).getColor());
	}

	@Override
	public void rotateUp() {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(tabCube.get(i).getColor());
		}
		tabCube.get(0).setColor(tempoCube.get(4).getColor());
		tabCube.get(1).setColor(tempoCube.get(5).getColor());
		tabCube.get(4).setColor(tempoCube.get(8).getColor());
		tabCube.get(5).setColor(tempoCube.get(9).getColor());
		tabCube.get(8).setColor(tempoCube.get(12).getColor());
		tabCube.get(9).setColor(tempoCube.get(13).getColor());
		tabCube.get(12).setColor(tempoCube.get(0).getColor());
		tabCube.get(13).setColor(tempoCube.get(1).getColor());
		tabCube.get(16).setColor(tempoCube.get(18).getColor());
		tabCube.get(18).setColor(tempoCube.get(19).getColor());
		tabCube.get(19).setColor(tempoCube.get(17).getColor());
		tabCube.get(17).setColor(tempoCube.get(16).getColor());
	}
	
	public void rotateUpOver() {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(tabCube.get(i).getColor());
		}
		tabCube.get(4).setColor(tempoCube.get(0).getColor());
		tabCube.get(5).setColor(tempoCube.get(1).getColor());
		tabCube.get(8).setColor(tempoCube.get(4).getColor());
		tabCube.get(9).setColor(tempoCube.get(5).getColor());
		tabCube.get(12).setColor(tempoCube.get(8).getColor());
		tabCube.get(13).setColor(tempoCube.get(9).getColor());
		tabCube.get(0).setColor(tempoCube.get(12).getColor());
		tabCube.get(1).setColor(tempoCube.get(13).getColor());
		tabCube.get(18).setColor(tempoCube.get(16).getColor());
		tabCube.get(19).setColor(tempoCube.get(18).getColor());
		tabCube.get(17).setColor(tempoCube.get(19).getColor());
		tabCube.get(16).setColor(tempoCube.get(17).getColor());
	}

	@Override
	public void rotateDown() {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(tabCube.get(i).getColor());
		}
		tabCube.get(2).setColor(tempoCube.get(6).getColor());
		tabCube.get(3).setColor(tempoCube.get(7).getColor());
		tabCube.get(6).setColor(tempoCube.get(10).getColor());
		tabCube.get(7).setColor(tempoCube.get(11).getColor());
		tabCube.get(10).setColor(tempoCube.get(14).getColor());
		tabCube.get(11).setColor(tempoCube.get(15).getColor());
		tabCube.get(14).setColor(tempoCube.get(2).getColor());
		tabCube.get(15).setColor(tempoCube.get(3).getColor());
		tabCube.get(20).setColor(tempoCube.get(21).getColor());
		tabCube.get(21).setColor(tempoCube.get(23).getColor());
		tabCube.get(23).setColor(tempoCube.get(22).getColor());
		tabCube.get(22).setColor(tempoCube.get(20).getColor());
	}
	
	public void rotateDownOver() {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(tabCube.get(i).getColor());
		}
		tabCube.get(6).setColor(tempoCube.get(2).getColor());
		tabCube.get(7).setColor(tempoCube.get(3).getColor());
		tabCube.get(10).setColor(tempoCube.get(6).getColor());
		tabCube.get(11).setColor(tempoCube.get(7).getColor());
		tabCube.get(14).setColor(tempoCube.get(10).getColor());
		tabCube.get(15).setColor(tempoCube.get(11).getColor());
		tabCube.get(2).setColor(tempoCube.get(14).getColor());
		tabCube.get(3).setColor(tempoCube.get(15).getColor());
		tabCube.get(21).setColor(tempoCube.get(20).getColor());
		tabCube.get(23).setColor(tempoCube.get(21).getColor());
		tabCube.get(22).setColor(tempoCube.get(23).getColor());
		tabCube.get(20).setColor(tempoCube.get(22).getColor());
	}

	@Override
	public void rotateFrontRight() {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(tabCube.get(i).getColor());
		}
		tabCube.get(18).setColor(tempoCube.get(6).getColor());
		tabCube.get(19).setColor(tempoCube.get(7).getColor());
		tabCube.get(6).setColor(tempoCube.get(22).getColor());
		tabCube.get(7).setColor(tempoCube.get(23).getColor());
		tabCube.get(22).setColor(tempoCube.get(14).getColor());
		tabCube.get(23).setColor(tempoCube.get(15).getColor());
		tabCube.get(14).setColor(tempoCube.get(18).getColor());
		tabCube.get(15).setColor(tempoCube.get(19).getColor());
		tabCube.get(0).setColor(tempoCube.get(1).getColor());
		tabCube.get(1).setColor(tempoCube.get(3).getColor());
		tabCube.get(3).setColor(tempoCube.get(2).getColor());
		tabCube.get(2).setColor(tempoCube.get(0).getColor());
	}
	
	public void rotateFrontLeft() {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(tabCube.get(i).getColor());
		}
		tabCube.get(6).setColor(tempoCube.get(18).getColor());
		tabCube.get(7).setColor(tempoCube.get(19).getColor());
		tabCube.get(22).setColor(tempoCube.get(6).getColor());
		tabCube.get(23).setColor(tempoCube.get(7).getColor());
		tabCube.get(14).setColor(tempoCube.get(22).getColor());
		tabCube.get(15).setColor(tempoCube.get(23).getColor());
		tabCube.get(18).setColor(tempoCube.get(14).getColor());
		tabCube.get(19).setColor(tempoCube.get(15).getColor());
		tabCube.get(1).setColor(tempoCube.get(0).getColor());
		tabCube.get(3).setColor(tempoCube.get(1).getColor());
		tabCube.get(2).setColor(tempoCube.get(3).getColor());
		tabCube.get(0).setColor(tempoCube.get(2).getColor());
	}

	@Override
	public void rotateRearRight() {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(tabCube.get(i).getColor());
		}
		tabCube.get(16).setColor(tempoCube.get(4).getColor());
		tabCube.get(17).setColor(tempoCube.get(5).getColor());
		tabCube.get(4).setColor(tempoCube.get(20).getColor());
		tabCube.get(5).setColor(tempoCube.get(21).getColor());
		tabCube.get(20).setColor(tempoCube.get(12).getColor());
		tabCube.get(21).setColor(tempoCube.get(13).getColor());
		tabCube.get(12).setColor(tempoCube.get(16).getColor());
		tabCube.get(13).setColor(tempoCube.get(17).getColor());
		tabCube.get(8).setColor(tempoCube.get(9).getColor());
		tabCube.get(9).setColor(tempoCube.get(11).getColor());
		tabCube.get(11).setColor(tempoCube.get(10).getColor());
		tabCube.get(10).setColor(tempoCube.get(8).getColor());
	}
	
	public void rotateRearLeft() {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(tabCube.get(i).getColor());
		}
		tabCube.get(4).setColor(tempoCube.get(16).getColor());
		tabCube.get(5).setColor(tempoCube.get(17).getColor());
		tabCube.get(20).setColor(tempoCube.get(4).getColor());
		tabCube.get(21).setColor(tempoCube.get(5).getColor());
		tabCube.get(12).setColor(tempoCube.get(20).getColor());
		tabCube.get(13).setColor(tempoCube.get(21).getColor());
		tabCube.get(16).setColor(tempoCube.get(12).getColor());
		tabCube.get(17).setColor(tempoCube.get(13).getColor());
		tabCube.get(9).setColor(tempoCube.get(8).getColor());
		tabCube.get(11).setColor(tempoCube.get(9).getColor());
		tabCube.get(10).setColor(tempoCube.get(11).getColor());
		tabCube.get(8).setColor(tempoCube.get(10).getColor());
	}
	
	@Override
	public void printCube() {
		for(StdCube elem: tabCube)
	       {
	       	 System.out.print(elem.getColor());
	       }
		System.out.println();
		System.out.println(tabCube.get(0).getColor());
		System.out.println(tabCube.get(1).getColor());

	}
	
	/*public java.awt.Color getColor(int i){
		if(tabCube.get(i).getColor() == Color.RED){
			return java.awt.Color.RED;
		}
		else if(tabCube.get(i).getColor() == Color.BLUE){
			return java.awt.Color.BLUE;
		}
		else if(tabCube.get(i).getColor() == Color.GREEN){
			return java.awt.Color.GREEN;
		}
		else if(tabCube.get(i).getColor() == Color.WHITE){
			return java.awt.Color.WHITE;
		}
		else if(tabCube.get(i).getColor() == Color.YELLOW){
			return java.awt.Color.YELLOW;
		}
		else if(tabCube.get(i).getColor() == Color.BLACK){
			return java.awt.Color.BLACK;
		}
		//Pour test, à supprimer
		else{
			return java.awt.Color.ORANGE;
		}
	}*/
	
	public boolean isFinished(){
		StdCube c;
		int diff = 0;
		//Boucle d'initialisation de l'arraylist contenant les cubes
		for(int i =0; i <= 23; i++){
			c = new StdCube();
			if(i <= 3){
				c.setColor(java.awt.Color.RED);
				startList.add(c);
			}
			else if(i > 3 && i <= 7){
				c.setColor(java.awt.Color.BLUE);
				startList.add(c);
			}
			else if(i > 7 && i <= 11){
				c.setColor(java.awt.Color.YELLOW);
				startList.add(c);
			}
			else if(i > 11 && i <= 15){
				c.setColor(java.awt.Color.WHITE);
				startList.add(c);
			}
			else if(i > 15 && i <= 19){
				c.setColor(java.awt.Color.BLACK);
				startList.add(c);
			}
			else{
				c.setColor(java.awt.Color.GREEN);
				startList.add(c);
			}
		}
		for(int i = 0; i <= 23; i++){
			if(startList.get(i).getColor() == tabCube.get(i).getColor())
				i++;
			else{
				i++;
				diff = 1;
			}
		}
		if(diff == 0)
			return true;
		else 
			return false;
	}
	public void melange(){
		Random rand = new Random();
		int i;
		for(int c = 0; c <=11; c++){
			i = rand.nextInt(6);;
			switch(i){
				case 0:
					rotateLeft();
					solution.add('l');
					break;
				case 1:
					rotateRight();
					solution.add('r');
					break;
				case 2:
					rotateUp();
					solution.add('u');
					break;
				case 3:
					rotateDown();
					solution.add('d');
					break;
				case 4:
					rotateFrontRight();
					solution.add('f');
					break;
				case 5:
					rotateRearRight();
					solution.add('o');
					break;
				default:
					System.out.println("erreur random");
					break;
			}
		}
	}
	
	//IA basique
	public void IA(){
		for(int i = solution.size(); i > 0; i--){
			switch(solution.get(i -1 )){
				case 'l':
					solution.remove(i - 1);
					rotateLeft();
					rotateLeft();
					rotateLeft();
					break;
				case 'r':
					solution.remove(i - 1);
					rotateRight();
					rotateRight();
					rotateRight();
					break;
				case 'u':
					solution.remove(i - 1);
					rotateUp();
					rotateUp();
					rotateUp();
					break;
				case 'd':
					solution.remove(i - 1);
					rotateDown();
					rotateDown();
					rotateDown();
					break;
				case 'f':
					solution.remove(i - 1);
					rotateFrontRight();
					rotateFrontRight();
					rotateFrontRight();
					break;
				case 'o':
					solution.remove(i - 1);
					rotateRearRight();
					rotateRearRight();
					rotateRearRight();
					break;
				default:
					System.out.println("Erreur lors de la résoution");
					break;
			}
		}
	}
	
	public void superIa(){
		
	}
}
