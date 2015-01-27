package Orion.Yahtzee;

import java.applet.*;
import java.awt.*;

import Orion.Yahtzee.Display.Screen;


public class Main_Game_Class extends Applet {
	Label label = new Label();
	
	Screen screen = new Screen();
	public void main(String[] args) {
		screen.menu();
	}

}
