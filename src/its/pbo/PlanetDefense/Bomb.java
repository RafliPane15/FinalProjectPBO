package its.pbo.PlanetDefense;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Bomb extends Rectangle{
	Random random;
	int xSpeed;
	int ySpeed;
	Image bombSkin;
	
	int initialSpeed = 4;
	
	Bomb(int x, int y, int width, int height, String imagePath){
		super(x,y,width,height);
		random = new Random();
		this.bombSkin = ImageLoader.loadImage(imagePath);
		
		int randomXDirection = random.nextInt(2);
		if (randomXDirection == 0)
			randomXDirection -= 1;
		setXDirection(randomXDirection * initialSpeed);
		
		int randomYDirection = random.nextInt(2);
		if (randomYDirection == 0)
			randomYDirection -= 1;
		setYDirection(randomYDirection * initialSpeed);
	}
	
	public void setXDirection(int randomXDirection) {
		xSpeed = randomXDirection;
	}
	
	public void setYDirection(int randomYDirection) {
		ySpeed = randomYDirection;
	}
	
	public void move() {
		x += xSpeed;
		y += ySpeed;
	}
	
	public void draw(Graphics g) {
		g.drawImage(bombSkin,x,y,width,height,null);
		g.setColor(Color.pink);
		g.drawOval(x, y, height, width);
	}
}
