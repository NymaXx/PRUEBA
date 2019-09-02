package view;
import processing.core.PApplet;

public class LoginScreen {
	private Input userNameInput;
	
	public LoginScreen(PApplet p) {
		setUserNameInput(new Input(p,200,250));
	}
	
	public void paint() {
		//rect();
		getUserNameInput().paint();
	}
	
	public void focusInputs(float mouseX, float mouseY) {
		if(mouseX >= getUserNameInput().getPosX() && 
				mouseX <= getUserNameInput().getPosX()+200 &&
				mouseY >= getUserNameInput().getPosY() && 
				mouseY <= getUserNameInput().getPosY()+30 
		) {
			getUserNameInput().setFocus(true);
		}else {

			getUserNameInput().setFocus(false);
		}	
	}
	
	public void writeTextInput(char key) {
		if(getUserNameInput().isFocus()) {
			getUserNameInput().setText(getUserNameInput().getText()+key);
			
		}
	}

	public Input getUserNameInput() {
		return userNameInput;
	}

	public void setUserNameInput(Input userNameInput) {
		this.userNameInput = userNameInput;
	}
}
