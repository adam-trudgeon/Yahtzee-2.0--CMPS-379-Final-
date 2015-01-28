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
		//This member will display the logo and offer the player two buttons to continue
		yahtzee = this.getImage(this.getCodeBase(), "yahtzee.jpg");
		btnStart.setLocation(300, 200); btnStart.setSize(50, 30); add(btnStart); //Button start will take the player to the setup screen
		btnSettings.setLocation(300, 250); btnSettings.setSize(50, 30); add(btnSettings); //Button settings will take the player to the settings menu
		
		btnStart.addActionListener(this);
		btnSettings.addActionListener(this);
	}

	//Right now I have only thought to add a resolution bar, probably add some other stuff later
	Choice
			Resolution = new Choice();
	Label
			lblResolution = new Label("Resolution");
	//Displays the settings menu
	public void settings() {
		//This member will offer a resolution
		
	}
	
	Scrollbar
			scbNoPlayers = new Scrollbar(0, 400, 100, 0, 4);
	Label
			lblNoPlayers = new Label("Number of Players");
	TextField
			txtfPlayerName = new TextField();
	TextArea
			txtaPlayerName = new TextArea();
	Button
			btnPlay = new Button("Play"),
			btnAdd = new Button("Add Name");
	
	//Displays the setup Screen
	public void setup() {
		//In this function the player will decide the number of players and give them names
		lblNoPlayers.setLocation(10, 40); lblNoPlayers.setSize(100,30); add(lblNoPlayers);
		scbNoPlayers.setLocation(150, 40); scbNoPlayers.setSize(100, 20); add(scbNoPlayers);
		txtfPlayerName.setLocation(10, 100); txtfPlayerName.setSize(200, 20); add(txtfPlayerName);
		
		
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
