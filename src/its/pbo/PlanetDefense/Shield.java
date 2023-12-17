package its.pbo.PlanetDefense;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.*;
import javax.swing.*;

public class Shield extends Rectangle{
	
	int id;
	int ySpeed;
	int speed = 10;
	Image shieldSkin;
	
	Shield(int x, int y, int SHIELD_WIDTH, int SHIELD_HEIGHT, int id, String imagePath){
		super(x,y,SHIELD_WIDTH, SHIELD_HEIGHT);
		this.id = id;

		this.shieldSkin = ImageLoader.loadImage(imagePath);
	}

	public void keyPressed(KeyEvent e) {
		switch(id) {
		case 1 : 
			if (e.getKeyCode() == KeyEvent.VK_W) {
				setYDirection(-speed);
				//System.out.println("w pressed");
			}
			if (e.getKeyCode() == KeyEvent.VK_S) {
				setYDirection(speed);
				//System.out.println("s pressed");
			}
			break;
		case 2 : 
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				setYDirection(-speed);
				//System.out.println("up pressed");
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				setYDirection(speed);
				//System.out.println("down pressed");
			}
			break;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		switch(id) {
		case 1 : 
			if (e.getKeyCode() == KeyEvent.VK_W) {
				// hacky way to fix freezing on counter strafe
				if (ySpeed != speed) 
				// NOTE : gave another bug but gameplay much smoother imo
				setYDirection(0);
				//move();
			}
			if (e.getKeyCode() == KeyEvent.VK_S) {
				if (ySpeed != -speed)
				setYDirection(0);
				//move();
			}
			break;
		case 2 : 
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				if (ySpeed != speed) 
				setYDirection(0);
				//move();
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				if (ySpeed != -speed) 
				setYDirection(0);
				//move();
			}
			break;
		}
	}
	
	public void setYDirection(int yDirection) {
		ySpeed = yDirection;
	}
	
	public void move() {
		y = y+ySpeed;
	}
	
	public void draw(Graphics g) {

		g.drawImage(shieldSkin, x, y, width, height, null);
		if (id == 1) {
			g.setColor(Color.cyan);
		}
		else {
			g.setColor(Color.yellow);
		}
		g.drawRect(x, y, width, height);
	}
}
