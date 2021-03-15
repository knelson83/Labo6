# Labo6
package com.mycompany.lab06;

public class MainClass {
	
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(5, 8);
		r1.draw();
		
		Rectangle r2 = new Rectangle(8,5);
		r2.draw();
	}
	
}
package com.mycompany.lab06;

public class Rectangle {
	
	int width;
	int height;
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	public void draw(){
		for (int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				System.out.print("*");
				
			} 
			System.out.println("");
		}
	}
	
}
