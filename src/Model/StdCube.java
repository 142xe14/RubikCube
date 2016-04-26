package Model;

import java.awt.Color;

public class StdCube implements Cube{

	Color color;
	Cube cube;
	public StdCube(){
		color = null;
	}
	@Override
	public java.awt.Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void setColor(java.awt.Color color) {
		this.color = color;
	}
}
