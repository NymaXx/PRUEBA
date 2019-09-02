package view;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	
	int screen;
	//String result="";
	LoginScreen loginScreen;
	

	public void settings() {
		size(600,600);
		
	}

	public void setup() {
		screen = 0;
		loginScreen = new LoginScreen (this);
	}

	public void draw() {
		background(255);
		
		switch(screen) {
		case 0:
			loginScreen.paint();
			break;
		}
	}
	
	public void keyPressed() {
		loginScreen.writeTextInput(key);
	}
	
	public void mousePressed() {
		loginScreen.focusInputs(mouseX, mouseY);
	}

}
