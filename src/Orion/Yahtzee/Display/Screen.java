package Orion.Yahtzee.Display;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Screen extends Applet implements ActionListener{
	Image yahtzee;
	Button
			btnStart = new Button("Start"),
			btnSettings = new Button("Settings");
	
	//Displays the title menu
	public void menu() {
		yahtzee = this.getImage(this.getCodeBase(), "yahtzee.jpg");
		btnStart.setLocation(300, 200); btnStart.setSize(50, 30); add(btnStart);
		btnSettings.setLocation(300, 250); btnSettings.setSize(50, 30); add(btnSettings);
		
		btnStart.addActionListener(this);
		btnSettings.addActionListener(this);
	}

	Choice
			Resolution = new Choice();
	Label
			lblResolution = new Label("Resolution");
	public void settings() {
		
	}
	//I think I should put this somewhere else
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnStart) {
			
		}
	}
	
	public void paint(Graphics g) {
		g.drawImage(yahtzee, 250, 50, 300, 100, this);
		repaint();
	}

}
