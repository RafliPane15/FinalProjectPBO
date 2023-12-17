package its.pbo.PlanetDefense;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Score extends Rectangle{
	static int GAME_WIDTH;
	static int GAME_HEIGHT;
	int player1;
	int player2;
	Planet planet1;
	Planet planet2;
	
	Score(int GAME_WIDTH, int GAME_HEIGHT, Planet planet1, Planet planet2){
		Score.GAME_WIDTH = GAME_WIDTH;
		Score.GAME_HEIGHT = GAME_HEIGHT;
		this.planet1 = planet1;
		this.planet2 = planet2;
	}
	
	public void draw(Graphics g) {
		g.setFont(new Font("Consolas", Font.PLAIN, 50));
		
		g.setColor(Color.red);
		g.drawString(String.valueOf(player1), GAME_WIDTH/2 - 80, 50);
		
		g.setColor(Color.red);
		g.drawString(String.valueOf(player2), GAME_WIDTH/2 + 40, 50);
		
		g.setColor(Color.black);
		g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
		
		g.setFont(new Font("Consolas", Font.PLAIN, 20));
		g.setColor(Color.green);
		String p1health = "Planet 1 Health : " + String.valueOf(planet1.health) + "/100";
		g.drawString(p1health, 20 , 20 );
	
		String p2health = "Planet 2 Health : " + String.valueOf(planet2.health) + "/100";
		g.drawString(p2health, GAME_WIDTH - 300 , 20 );
	}
	
	public void showEndGameScore() {
		// TODO : draw scores at the end of game
	}
}
