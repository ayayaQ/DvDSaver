package com.github.ayayaQ;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageIcon img = new ImageIcon("img/dvd.png");
		
		int resX = 640;
		int resY = 480;
		
		JFrame p = new JFrame(); 
		APanel o = new APanel(resX, resY);
		p.setSize(resX, resY);
		p.setVisible(true);
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setResizable(false);
		p.setTitle("DVD Screensaver");
		p.getContentPane().add(o);
		p.setIconImage(img.getImage());
		
	}

}
