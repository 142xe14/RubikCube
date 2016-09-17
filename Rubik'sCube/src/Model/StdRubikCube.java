package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class StdRubikCube implements RubikCube{

	//Etudier la possibilit� de cr�e tempo cube dans init
	//Et de rajoute une m�thode updateTempoCube
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
		//Fin de la boucle, on m�lange l'arrayList
		//Collections.shuffle(tabCube);
		//updateTempoCube();
	}
	@Override
	public void chooseMovement(char c) {
		switch(c){
			case 'l':
				rotateLeft();
				break;
			case 'r':
				rotateRight();
				break;
			case 'u':
				rotateUp();
				break;
			case 'd':
				rotateDown();
				break;
			case 'f':
				rotateFrontRight();
				break;
			case 'h':
				rotateFrontLeft();
				break;
			case 'e':
				rotateRearRight();
				break;
			case 'j':
				rotateRearLeft();
				break;
			case 'a':
				rotateLeftOver();
				break;
			case 'b':
				rotateRightOver();
				break;
			case 'c':
				rotateUpOver();
				break;
			case 'g':
				rotateDownOver();
				break;
			default:
				System.out.println("error");
				break;
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
		//Pour test, � supprimer
		else{
			return java.awt.Color.ORANGE;
		}
	}*/
	
	public boolean isFinished(ArrayList<StdCube> myTestingCube){
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
			if(startList.get(i).getColor() == myTestingCube.get(i).getColor())
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
					System.out.println("Erreur lors de la r�soution");
					break;
			}
		}
	}

	/** This Function check if the game is finished **/
	public boolean checkVictory(ArrayList<StdCube> myTestingCube) {
		int check0 = 0;
		int check1 = 1;
		int totalCube = 0;
		while (totalCube < 6 && totalCube >= 0) {
			//si 0 = 1
			if (myTestingCube.get(check0).getColor() == myTestingCube.get(check1).getColor()) {
				check0++;
				check1++;
				//Si 1 = 2
				if (myTestingCube.get(check0).getColor() == myTestingCube.get(check1).getColor()) {
					check0++;
					check1++;
					//si 2 = 3
					if (myTestingCube.get(check0).getColor() == myTestingCube.get(check1).getColor()) {
						check0= check0 + 2;
						check1 = check1 + 2;
						totalCube++;
					}
					else
						totalCube = -1;
				}
				else
					totalCube = -1;
			} else
				totalCube = -1;
		}
		if (totalCube != -1)
			return true;
		else
			return false;
	}

	//Un algorithme ressemblant � celui de Belmann-Ford. Peut �tre optimis�
	public void superIa(){
		
		ArrayList<ArrayList<StdCube>> list1= new ArrayList<>();
		ArrayList<StdCube> toAdd= new ArrayList<>();
		ArrayList<Character> movementList = new ArrayList<>();
		HashMap<ArrayList<StdCube>, ArrayList<Character>> myConnected = new HashMap<>();
		ArrayList<ArrayList<Character>> connected = new ArrayList<>();
		ArrayList<Character> tempo = new ArrayList<>();
		StdCube c;
		int size;
		int oldSize = 0;
		char movement;
		boolean isSolution = false;
		if(checkVictory(tabCube) == true){
			System.out.println("Le pocket cube est d�j� fini!");
			isSolution = true;
		}
		boolean otherType = false;
		while(isSolution == false){
			if (otherType == false){
				for(int j = 0; j <=11; j++){
					toAdd = new ArrayList<>();
					movementList = new ArrayList<>();
					switch(j){
						case 0:
							rotateLeft();
							for(int i = 0; i <=23; i++){
								c = new StdCube();
								toAdd.add(c);
								toAdd.get(i).setColor(tabCube.get(i).getColor());
							}
							movement = 'l';
							movementList.add(movement);
							connected.add(movementList);
							rotateLeftOver(); //Annule le rotateLeft
							list1.add(toAdd);
							myConnected.put(toAdd, movementList);
							break;
						case 1:
							rotateRight();
							for(int i = 0; i <= 23; i++){
								c = new StdCube();
								toAdd.add(c);
								toAdd.get(i).setColor(tabCube.get(i).getColor());
							}
							movement = 'r';
							movementList.add(movement);
							connected.add(movementList);
							rotateRightOver();
							list1.add(toAdd);
							myConnected.put(toAdd, movementList);
							break;
						case 2:
							rotateUp();
							for(int i = 0; i <= 23; i++){
								c = new StdCube();
								toAdd.add(c);
								toAdd.get(i).setColor(tabCube.get(i).getColor());
							}
							movement = 'u';
							movementList.add(movement);
							connected.add(movementList);
							rotateUpOver();
							list1.add(toAdd);
							myConnected.put(toAdd, movementList);
							break;	
						case 3:
							rotateDown();
							for(int i = 0; i <= 23; i++){
								c = new StdCube();
								toAdd.add(c);
								toAdd.get(i).setColor(tabCube.get(i).getColor());
							}
							movement = 'd';
							movementList.add(movement);
							connected.add(movementList);
							rotateDownOver();
							list1.add(toAdd);
							myConnected.put(toAdd, movementList);
							break;
						case 4:
							rotateLeftOver();
							for(int i = 0; i <= 23; i++){
								c = new StdCube();
								toAdd.add(c);
								toAdd.get(i).setColor(tabCube.get(i).getColor());
							}
							movement = 'a';
							movementList.add(movement);
							connected.add(movementList);
							rotateLeft();
							list1.add(toAdd);
							myConnected.put(toAdd, movementList);
							break;	
						case 5:
							rotateRightOver();
							for(int i = 0; i <= 23; i++){
								c = new StdCube();
								toAdd.add(c);
								toAdd.get(i).setColor(tabCube.get(i).getColor());
							}
							movement = 'b';
							movementList.add(movement);
							connected.add(movementList);
							rotateRight();
							list1.add(toAdd);
							myConnected.put(toAdd, movementList);
							break;
						case 6:
							rotateUpOver();
							for(int i = 0; i <= 23; i++){
								c = new StdCube();
								toAdd.add(c);
								toAdd.get(i).setColor(tabCube.get(i).getColor());
							}
							movement = 'c';
							movementList.add(movement);
							connected.add(movementList);
							rotateUp();
							list1.add(toAdd);
							myConnected.put(toAdd, movementList);
							break;
						case 7:
							rotateDownOver();
							for(int i = 0; i <= 23; i++){
								c = new StdCube();
								toAdd.add(c);
								toAdd.get(i).setColor(tabCube.get(i).getColor());
							}
							movement = 'g';
							movementList.add(movement);
							connected.add(movementList);
							rotateDown();
							list1.add(toAdd);
							myConnected.put(toAdd, movementList);
							break;	
						case 8:
							rotateFrontRight();
							for(int i = 0; i <= 23; i++){
								c = new StdCube();
								toAdd.add(c);
								toAdd.get(i).setColor(tabCube.get(i).getColor());
							}
							movement = 'f';
							movementList.add(movement);
							connected.add(movementList);
							rotateFrontLeft();
							list1.add(toAdd);
							myConnected.put(toAdd, movementList);
							break;	
						case 9:
							rotateFrontLeft();
							for(int i = 0; i <= 23; i++){
								c = new StdCube();
								toAdd.add(c);
								toAdd.get(i).setColor(tabCube.get(i).getColor());
							}
							movement = 'h';
							movementList.add(movement);
							connected.add(movementList);
							rotateFrontRight();
							list1.add(toAdd);
							myConnected.put(toAdd, movementList);
							break;	
						case 10:
							rotateRearRight();
							for(int i = 0; i <= 23; i++){
								c = new StdCube();
								toAdd.add(c);
								toAdd.get(i).setColor(tabCube.get(i).getColor());
							}
							movement = 'e';
							movementList.add(movement);
							connected.add(movementList);
							rotateRearLeft();
							list1.add(toAdd);
							myConnected.put(toAdd, movementList);
							break;
						case 11:
							rotateRearLeft();
							for(int i = 0; i <= 23; i++){
								c = new StdCube();
								toAdd.add(c);
								toAdd.get(i).setColor(tabCube.get(i).getColor());
							}
							movement = 'j';
							movementList.add(movement);
							connected.add(movementList);
							rotateRearRight();
							list1.add(toAdd);
							myConnected.put(toAdd, movementList);
							break;	
						default:
							System.out.println("Vous �tes dans la matrice");
					}	
				}	
			}
			else{
				size = list1.size();
				for(int i = oldSize; i < size; i++){
					for(int j = 0; j<=11; j++){
						toAdd = new ArrayList<>();
						tempo = new ArrayList<>(connected.get(i));
						switch(j){
							case 0:
								rotateLeft(list1.get(i));
								for(int k = 0; k <=23; k++){
									c = new StdCube();
									c.setColor(list1.get(i).get(k).getColor());
									toAdd.add(c);
								}
								movement = 'l';
								tempo.add(movement);
								connected.add(tempo);
								rotateLeftOver(list1.get(i)); //Annule le rotateLeft
								list1.add(toAdd);
								break;
							case 1:
								rotateRight(list1.get(i));
								for(int k = 0; k <= 23; k++){
									c = new StdCube();
									c.setColor(list1.get(i).get(k).getColor());
									toAdd.add(c);
								}
								movement = 'r';
								tempo.add(movement);
								connected.add(tempo);
								rotateRightOver(list1.get(i));
								list1.add(toAdd);
								break;
							case 2:
								rotateUp(list1.get(i));
								for(int k = 0; k <= 23; k++){
									c = new StdCube();
									c.setColor(list1.get(i).get(k).getColor());
									toAdd.add(c);
								}
								movement = 'u';
								tempo.add(movement);
								connected.add(tempo);
								rotateUpOver(list1.get(i));
								list1.add(toAdd);
								break;	
							case 3:
								rotateDown(list1.get(i));
								for(int k = 0; k <= 23; k++){
									c = new StdCube();
									c.setColor(list1.get(i).get(k).getColor());
									toAdd.add(c);
								}
								movement = 'd';
								tempo.add(movement);
								connected.add(tempo);
								rotateDownOver(list1.get(i));
								list1.add(toAdd);
								break;
							case 4:
								rotateLeftOver(list1.get(i));
								for(int k = 0; k <= 23; k++){
									c = new StdCube();
									c.setColor(list1.get(i).get(k).getColor());
									toAdd.add(c);
								}
								movement = 'a';
								tempo.add(movement);
								connected.add(tempo);
								rotateLeft(list1.get(i));
								list1.add(toAdd);
								break;	
							case 5:
								rotateRightOver(list1.get(i));
								for(int k = 0; k <= 23; k++){
									c = new StdCube();
									c.setColor(list1.get(i).get(k).getColor());
									toAdd.add(c);
								}
								movement = 'b';
								tempo.add(movement);
								connected.add(tempo);
								rotateRight(list1.get(i));
								list1.add(toAdd);
								break;
							case 6:
								rotateUpOver(list1.get(i));
								for(int k = 0; k <= 23; k++){
									c = new StdCube();
									c.setColor(list1.get(i).get(k).getColor());
									toAdd.add(c);
								}
								movement = 'c';
								tempo.add(movement);
								connected.add(tempo);
								rotateUp(list1.get(i));
								list1.add(toAdd);
								break;
							case 7:
								rotateDownOver(list1.get(i));
								for(int k = 0; k <= 23; k++){
									c = new StdCube();
									c.setColor(list1.get(i).get(k).getColor());
									toAdd.add(c);
								}
								movement = 'g';
								tempo.add(movement);
								connected.add(tempo);
								rotateDown(list1.get(i));
								list1.add(toAdd);
								break;	
							case 8:
								rotateFrontRight(list1.get(i));
								for(int k = 0; k <= 23; k++){
									c = new StdCube();
									c.setColor(list1.get(i).get(k).getColor());
									toAdd.add(c);
								}
								movement = 'f';
								tempo.add(movement);
								connected.add(tempo);
								rotateFrontLeft(list1.get(i));
								list1.add(toAdd);
								break;	
							case 9:
								rotateFrontLeft(list1.get(i));
								for(int k = 0; k <= 23; k++){
									c = new StdCube();
									c.setColor(list1.get(i).get(k).getColor());
									toAdd.add(c);
								}
								movement = 'h';
								tempo.add(movement);
								connected.add(tempo);
								rotateFrontRight(list1.get(i));
								list1.add(toAdd);
								break;	
							case 10:
								rotateRearRight(list1.get(i));
								for(int k = 0; k <= 23; k++){
									c = new StdCube();
									toAdd.add(c);
									c.setColor(list1.get(i).get(k).getColor());

								}
								movement = 'e';
								tempo.add(movement);
								connected.add(tempo);
								rotateRearLeft(list1.get(i));
								list1.add(toAdd);
								break;
							case 11:
								rotateRearLeft(list1.get(i));
								for(int k = 0; k <= 23; k++){
									c = new StdCube();
									c.setColor(list1.get(i).get(k).getColor());
									toAdd.add(c);
								}
								movement = 'j';
								tempo.add(movement);
								connected.add(tempo);
								rotateRearRight(list1.get(i));
								list1.add(toAdd);
								break;	
							default:
								System.out.println("Vous �tes dans la matrice");
								break;
						}	
					}
				}
				oldSize = size;
			}
			for(int i = oldSize; i < list1.size(); i++){
				if(checkVictory(list1.get(i)) == true && isSolution == false){
					for(int j = 0; j < connected.get(i).size(); j++){
						System.out.println(connected.get(i));
						chooseMovement(connected.get(i).get(j));
					}
					isSolution = true;
				}
			}
			otherType = true;
			System.out.println(list1.size());
	}	
	System.out.println("Solution trouv�");	
}

	public void rotateLeft(ArrayList<StdCube> myTestingCube) {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(myTestingCube.get(i).getColor());
		}
		myTestingCube.get(0).setColor(tempoCube.get(16).getColor());
		myTestingCube.get(2).setColor(tempoCube.get(18).getColor());
		myTestingCube.get(16).setColor(tempoCube.get(11).getColor());
		myTestingCube.get(18).setColor(tempoCube.get(9).getColor());
		myTestingCube.get(11).setColor(tempoCube.get(20).getColor());
		myTestingCube.get(9).setColor(tempoCube.get(22).getColor());
		myTestingCube.get(22).setColor(tempoCube.get(2).getColor());
		myTestingCube.get(20).setColor(tempoCube.get(0).getColor());
		myTestingCube.get(12).setColor(tempoCube.get(14).getColor());
		myTestingCube.get(14).setColor(tempoCube.get(15).getColor());
		myTestingCube.get(15).setColor(tempoCube.get(13).getColor());
		myTestingCube.get(13).setColor(tempoCube.get(12).getColor());	
	}
	
	public void rotateLeftOver(ArrayList<StdCube> myTestingCube) {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(myTestingCube.get(i).getColor());
		}
		myTestingCube.get(16).setColor(tempoCube.get(0).getColor());
		myTestingCube.get(18).setColor(tempoCube.get(2).getColor());
		myTestingCube.get(11).setColor(tempoCube.get(16).getColor());
		myTestingCube.get(9).setColor(tempoCube.get(18).getColor());
		myTestingCube.get(20).setColor(tempoCube.get(11).getColor());
		myTestingCube.get(22).setColor(tempoCube.get(9).getColor());
		myTestingCube.get(2).setColor(tempoCube.get(22).getColor());
		myTestingCube.get(0).setColor(tempoCube.get(20).getColor());
		myTestingCube.get(14).setColor(tempoCube.get(12).getColor());
		myTestingCube.get(15).setColor(tempoCube.get(14).getColor());
		myTestingCube.get(13).setColor(tempoCube.get(15).getColor());
		myTestingCube.get(12).setColor(tempoCube.get(13).getColor());	
	}

	public void rotateRight(ArrayList<StdCube> myTestingCube) {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(myTestingCube.get(i).getColor());
		}
		myTestingCube.get(1).setColor(tempoCube.get(17).getColor());
		myTestingCube.get(3).setColor(tempoCube.get(19).getColor());
		//tabCube.get(17).setColor(tempoCube.get(8).getColor());
		//tabCube.get(19).setColor(tempoCube.get(10).getColor());
		myTestingCube.get(17).setColor(tempoCube.get(10).getColor());
		myTestingCube.get(19).setColor(tempoCube.get(8).getColor());
		myTestingCube.get(8).setColor(tempoCube.get(23).getColor());
		myTestingCube.get(10).setColor(tempoCube.get(21).getColor());
		myTestingCube.get(21).setColor(tempoCube.get(1).getColor());
		myTestingCube.get(23).setColor(tempoCube.get(3).getColor());
		//Valide
		myTestingCube.get(4).setColor(tempoCube.get(5).getColor());
		myTestingCube.get(5).setColor(tempoCube.get(7).getColor());
		myTestingCube.get(7).setColor(tempoCube.get(6).getColor());
		myTestingCube.get(6).setColor(tempoCube.get(4).getColor());
	}
	
	public void rotateRightOver(ArrayList<StdCube> myTestingCube) {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(myTestingCube.get(i).getColor());
		}
		myTestingCube.get(17).setColor(tempoCube.get(1).getColor());
		myTestingCube.get(19).setColor(tempoCube.get(3).getColor());
		//tabCube.get(17).setColor(tempoCube.get(8).getColor());
		//tabCube.get(19).setColor(tempoCube.get(10).getColor());
		myTestingCube.get(10).setColor(tempoCube.get(17).getColor());
		myTestingCube.get(8).setColor(tempoCube.get(19).getColor());
		myTestingCube.get(23).setColor(tempoCube.get(8).getColor());
		myTestingCube.get(21).setColor(tempoCube.get(10).getColor());
		myTestingCube.get(1).setColor(tempoCube.get(21).getColor());
		myTestingCube.get(3).setColor(tempoCube.get(23).getColor());
		//Valide
		myTestingCube.get(5).setColor(tempoCube.get(4).getColor());
		myTestingCube.get(7).setColor(tempoCube.get(5).getColor());
		myTestingCube.get(6).setColor(tempoCube.get(7).getColor());
		myTestingCube.get(4).setColor(tempoCube.get(6).getColor());
	}

	public void rotateUp(ArrayList<StdCube> myTestingCube) {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(myTestingCube.get(i).getColor());
		}
		myTestingCube.get(0).setColor(tempoCube.get(4).getColor());
		myTestingCube.get(1).setColor(tempoCube.get(5).getColor());
		myTestingCube.get(4).setColor(tempoCube.get(8).getColor());
		myTestingCube.get(5).setColor(tempoCube.get(9).getColor());
		myTestingCube.get(8).setColor(tempoCube.get(12).getColor());
		myTestingCube.get(9).setColor(tempoCube.get(13).getColor());
		myTestingCube.get(12).setColor(tempoCube.get(0).getColor());
		myTestingCube.get(13).setColor(tempoCube.get(1).getColor());
		myTestingCube.get(16).setColor(tempoCube.get(18).getColor());
		myTestingCube.get(18).setColor(tempoCube.get(19).getColor());
		myTestingCube.get(19).setColor(tempoCube.get(17).getColor());
		myTestingCube.get(17).setColor(tempoCube.get(16).getColor());
	}
	
	public void rotateUpOver(ArrayList <StdCube> myTestingCube) {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(myTestingCube.get(i).getColor());
		}
		myTestingCube.get(4).setColor(tempoCube.get(0).getColor());
		myTestingCube.get(5).setColor(tempoCube.get(1).getColor());
		myTestingCube.get(8).setColor(tempoCube.get(4).getColor());
		myTestingCube.get(9).setColor(tempoCube.get(5).getColor());
		myTestingCube.get(12).setColor(tempoCube.get(8).getColor());
		myTestingCube.get(13).setColor(tempoCube.get(9).getColor());
		myTestingCube.get(0).setColor(tempoCube.get(12).getColor());
		myTestingCube.get(1).setColor(tempoCube.get(13).getColor());
		myTestingCube.get(18).setColor(tempoCube.get(16).getColor());
		myTestingCube.get(19).setColor(tempoCube.get(18).getColor());
		myTestingCube.get(17).setColor(tempoCube.get(19).getColor());
		myTestingCube.get(16).setColor(tempoCube.get(17).getColor());
	}

	public void rotateDown(ArrayList<StdCube> myTestingCube) {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(myTestingCube.get(i).getColor());
		}
		myTestingCube.get(2).setColor(tempoCube.get(6).getColor());
		myTestingCube.get(3).setColor(tempoCube.get(7).getColor());
		myTestingCube.get(6).setColor(tempoCube.get(10).getColor());
		myTestingCube.get(7).setColor(tempoCube.get(11).getColor());
		myTestingCube.get(10).setColor(tempoCube.get(14).getColor());
		myTestingCube.get(11).setColor(tempoCube.get(15).getColor());
		myTestingCube.get(14).setColor(tempoCube.get(2).getColor());
		myTestingCube.get(15).setColor(tempoCube.get(3).getColor());
		myTestingCube.get(20).setColor(tempoCube.get(21).getColor());
		myTestingCube.get(21).setColor(tempoCube.get(23).getColor());
		myTestingCube.get(23).setColor(tempoCube.get(22).getColor());
		myTestingCube.get(22).setColor(tempoCube.get(20).getColor());
	}
	
	public void rotateDownOver(ArrayList<StdCube> myTestingCube) {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(myTestingCube.get(i).getColor());
		}
		myTestingCube.get(6).setColor(tempoCube.get(2).getColor());
		myTestingCube.get(7).setColor(tempoCube.get(3).getColor());
		myTestingCube.get(10).setColor(tempoCube.get(6).getColor());
		myTestingCube.get(11).setColor(tempoCube.get(7).getColor());
		myTestingCube.get(14).setColor(tempoCube.get(10).getColor());
		myTestingCube.get(15).setColor(tempoCube.get(11).getColor());
		myTestingCube.get(2).setColor(tempoCube.get(14).getColor());
		myTestingCube.get(3).setColor(tempoCube.get(15).getColor());
		myTestingCube.get(21).setColor(tempoCube.get(20).getColor());
		myTestingCube.get(23).setColor(tempoCube.get(21).getColor());
		myTestingCube.get(22).setColor(tempoCube.get(23).getColor());
		myTestingCube.get(20).setColor(tempoCube.get(22).getColor());
	}

	public void rotateFrontRight(ArrayList<StdCube> myTestingCube) {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(myTestingCube.get(i).getColor());
		}
		myTestingCube.get(18).setColor(tempoCube.get(6).getColor());
		myTestingCube.get(19).setColor(tempoCube.get(7).getColor());
		myTestingCube.get(6).setColor(tempoCube.get(22).getColor());
		myTestingCube.get(7).setColor(tempoCube.get(23).getColor());
		myTestingCube.get(22).setColor(tempoCube.get(14).getColor());
		myTestingCube.get(23).setColor(tempoCube.get(15).getColor());
		myTestingCube.get(14).setColor(tempoCube.get(18).getColor());
		myTestingCube.get(15).setColor(tempoCube.get(19).getColor());
		myTestingCube.get(0).setColor(tempoCube.get(1).getColor());
		myTestingCube.get(1).setColor(tempoCube.get(3).getColor());
		myTestingCube.get(3).setColor(tempoCube.get(2).getColor());
		myTestingCube.get(2).setColor(tempoCube.get(0).getColor());
	}
	
	public void rotateFrontLeft(ArrayList<StdCube> myTestingCube) {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(myTestingCube.get(i).getColor());
		}
		myTestingCube.get(6).setColor(tempoCube.get(18).getColor());
		myTestingCube.get(7).setColor(tempoCube.get(19).getColor());
		myTestingCube.get(22).setColor(tempoCube.get(6).getColor());
		myTestingCube.get(23).setColor(tempoCube.get(7).getColor());
		myTestingCube.get(14).setColor(tempoCube.get(22).getColor());
		myTestingCube.get(15).setColor(tempoCube.get(23).getColor());
		myTestingCube.get(18).setColor(tempoCube.get(14).getColor());
		myTestingCube.get(19).setColor(tempoCube.get(15).getColor());
		myTestingCube.get(1).setColor(tempoCube.get(0).getColor());
		myTestingCube.get(3).setColor(tempoCube.get(1).getColor());
		myTestingCube.get(2).setColor(tempoCube.get(3).getColor());
		myTestingCube.get(0).setColor(tempoCube.get(2).getColor());
	}

	public void rotateRearRight(ArrayList<StdCube> myTestingCube) {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(myTestingCube.get(i).getColor());
		}
		myTestingCube.get(16).setColor(tempoCube.get(4).getColor());
		myTestingCube.get(17).setColor(tempoCube.get(5).getColor());
		myTestingCube.get(4).setColor(tempoCube.get(20).getColor());
		myTestingCube.get(5).setColor(tempoCube.get(21).getColor());
		myTestingCube.get(20).setColor(tempoCube.get(12).getColor());
		myTestingCube.get(21).setColor(tempoCube.get(13).getColor());
		myTestingCube.get(12).setColor(tempoCube.get(16).getColor());
		myTestingCube.get(13).setColor(tempoCube.get(17).getColor());
		myTestingCube.get(8).setColor(tempoCube.get(9).getColor());
		myTestingCube.get(9).setColor(tempoCube.get(11).getColor());
		myTestingCube.get(11).setColor(tempoCube.get(10).getColor());
		myTestingCube.get(10).setColor(tempoCube.get(8).getColor());
	}
	
	public void rotateRearLeft(ArrayList<StdCube> myTestingCube) {
		ArrayList<StdCube> tempoCube = new ArrayList<StdCube>();
		StdCube c;
		for(int i = 0; i <=23; i++){
			c = new StdCube();
			tempoCube.add(c);
			tempoCube.get(i).setColor(myTestingCube.get(i).getColor());
		}
		myTestingCube.get(4).setColor(tempoCube.get(16).getColor());
		myTestingCube.get(5).setColor(tempoCube.get(17).getColor());
		myTestingCube.get(20).setColor(tempoCube.get(4).getColor());
		myTestingCube.get(21).setColor(tempoCube.get(5).getColor());
		myTestingCube.get(12).setColor(tempoCube.get(20).getColor());
		myTestingCube.get(13).setColor(tempoCube.get(21).getColor());
		myTestingCube.get(16).setColor(tempoCube.get(12).getColor());
		myTestingCube.get(17).setColor(tempoCube.get(13).getColor());
		myTestingCube.get(9).setColor(tempoCube.get(8).getColor());
		myTestingCube.get(11).setColor(tempoCube.get(9).getColor());
		myTestingCube.get(10).setColor(tempoCube.get(11).getColor());
		myTestingCube.get(8).setColor(tempoCube.get(10).getColor());
	}
}	
