package its.pbo.PlanetDefense;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Planet extends Rectangle{
	int id;
	int health;
	Image planetSkin;

	Planet(int x, int y, int radius, int id, String imagePath){
		super(x,y,radius,radius);
		this.id = id;
		this.health = 100;
		this.planetSkin = ImageLoader.loadImage(imagePath);
	}
	
	public void draw(Graphics g) {
		g.drawImage(planetSkin, x, y, width, height,null);
		g.setColor(Color.red); // hitbox draw
		g.drawRect(x, y, height, width);
	}
}
