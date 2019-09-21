package com.github.ayayaQ;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class APanel extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BufferedImage dvd;
	private File reader = new File("img/dvd_white.png");
	
	private int interval = 20;
	
	private int resX;
	private int resY;
	
	private int symbolX = 144;
	private int symbolY = (int)(symbolX*0.4375);
	
	private Symbol d;
	
	public APanel(int x, int y)
	{
		try {
            
            dvd = ImageIO.read(reader);
        } catch (IOException e) {
        	System.out.println("image not found");
        	e.getStackTrace();
        }
		
		Timer t = new Timer(interval,this);
		t.start();
		resX = x;
		resY = y;
		d = new Symbol((int)(symbolX*1.05), (int)(symbolY*1.46), resX,resY);
	}
	
	public void paint(Graphics g) {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, resX, resY);
			g.drawImage(dvd, d.getPosX(), d.getPosY(), symbolX, symbolY, null);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
		d.move();
		d.checkBounds();
	}

}
