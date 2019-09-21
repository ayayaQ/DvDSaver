package com.github.ayayaQ;

public class Symbol {
	
	private int posX;
	private int posY;
	private int vX;
	private int vY;
	private int bX;
	private int bY;
	private int iX;
	private int iY;
	
	public Symbol(int boundX, int boundY, int imageX, int imageY) {
		posX = 0;
		posY = 0;
		vX = 1;
		vY = 1;
		bX = boundX;
		bY = boundY;
		iX = imageX;
		iY = imageY;
	}
	
	public int getPosX() {
		return posX;
	}
	
	public int getPosY() {
		return posY;
	}
	
	public int getvX() {
		return vX;
	}
	
	public int getvY() {
		return vY;
	}
	
	public void setPosX(int newPos) {
		posX = newPos;
	}
	public void setPosY(int newPos) {
		posY = newPos;
	}
	
	public void setvX(int newV) {
		vX = newV;
	}
	
	public void setvY(int newV) {
		vY = newV;
	}
	
	public void move() {
		posX += vX;
		posY += vY;
	}
	public void checkBounds() {
		if(posX<0 || (posX+bX)>iX)
			vX = -vX;
		
		if(posY<0 || (posY+bY)>iY)
			vY = -vY;
	}
	
}
