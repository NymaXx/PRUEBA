package view;
import processing.core.PApplet;

public class Input {

	private int posX,posY;
	private boolean focus;
	private String text;
	private PApplet parent;

	public Input(PApplet p,int posX,int posY) {
		this.focus = false;
		this.text = "";
		this.parent = p;
		this.posX = posX;
		this.posY = posY;
	}
	
	public void paint() {
		if(focus) {
			parent.stroke(255,0,0);
			
		}else {
			parent.stroke(0);
		}
		parent.fill(255);
		parent.rect(posX,posY,200,30);
		
		parent.fill(0);
		parent.textSize(16);
		parent.text(text,posX+10,posY+20);
	}
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public boolean isFocus() {
		return focus;
	}

	public void setFocus(boolean focus) {
		this.focus = focus;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
