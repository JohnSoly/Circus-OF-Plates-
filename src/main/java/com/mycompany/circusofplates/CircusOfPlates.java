package com.mycompany.circusofplates;

import View.CircusWorld;
import Controller.GameController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CircusOfPlates {

    public static void main(String[] args) {
        /*JMenuBar  menuBar = new JMenuBar();;
	JMenu menu = new JMenu("File");
	JMenuItem newMenuItem = new JMenuItem("New");
	JMenuItem pauseMenuItem = new JMenuItem("Pause");
	JMenuItem resumeMenuItem = new JMenuItem("Resume");
	menu.add(newMenuItem);
	menu.addSeparator();
	menu.add(pauseMenuItem);
	menu.add(resumeMenuItem);
	menuBar.add(menu);*/
	//final GameController gameController = GameEngine.start("Very Simple Game in 99 Line of Code", new CircusWorld(1800, 900), menuBar, Color.BLACK);
	GameController gameController = new GameController(() -> new CircusWorld(1800, 900)) {};
        gameController.start();
        /*newMenuItem.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e) {
		gameController.changeWorld(new CircusWorld(1800, 900));
            }
	});
	pauseMenuItem.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e) {
		gameController.pause();
            }
	});
	resumeMenuItem.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e) {
		gameController.resume();
            }
	});*/
    }
}
