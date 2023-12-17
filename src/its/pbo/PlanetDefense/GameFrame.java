package its.pbo.PlanetDefense;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame{
	
	//GameStatePanel panel;
	GamePanel panel;
	Image backgroundImage;
	
	GameFrame() {
		panel = new GamePanel();
		//panel = new GameStatePanel();
		this.add(panel);
		this.setTitle("Planet Defense");
		this.setResizable(false);

		// this.setBackground(Color.gray);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		//add(new GameStatePanel());
	}
}
