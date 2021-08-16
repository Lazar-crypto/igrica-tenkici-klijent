package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;


public class Player2Bullet {
	private double x, y;

	public Player2Bullet(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void move(String face)
	{
		if(face.equals("right"))
			x += 20;
		else if(face.equals("left"))
			x -= 20;
		else if(face.equals("up"))
			y -= 20;
		else
			y +=20;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval((int) x, (int) y, 10, 10);
	}
	
	public int getX()
	{
		return (int)x;
	}
	public int getY()
	{
		return (int)y;
	}

}
