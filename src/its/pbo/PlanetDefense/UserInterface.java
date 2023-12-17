package its.pbo.PlanetDefense;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;

public class UserInterface {
	
	GamePanel panel;
	int gWidth, gHeight;
	int y;
	
	//public Image playbutton;
	
	public UserInterface(GamePanel panel, int gWidth, int gHeight) {
		this.panel = panel;
		this.gWidth = gWidth;
		this.gHeight = gHeight;
	}
	
	public void titleScreen(Graphics g) {
        
		g.drawImage(panel.mainscreenrevisi, 0, 0, panel);
		
		g.drawImage(panel.playbutton, (gWidth / 2) - (162 / 2), 325, 162, 90, panel);
		g.drawImage(panel.infobutton, (gWidth / 2) - (158 / 2), 405, 158, 90, panel);
		g.drawImage(panel.exitbutton, (gWidth / 2) - (158 / 2), 485, 158, 90, panel);
		
        //String score = "Press 'Enter' to select!";
//        Font sfont = new Font("Helvetica", Font.BOLD, 14);
//        FontMetrics metr2 = g.getFontMetrics(sfont);
//
//        g.setFont(sfont);
//        g.setColor(Color.GRAY);
//        g.drawString(score, ((gWidth - metr2.stringWidth(score)) / 2) + 2, gHeight - 29);
//        g.setColor(Color.WHITE);        
//        g.drawString(score, (gWidth - metr2.stringWidth(score)) / 2, gHeight - 30);
        
        // draw selection
        g.setColor(Color.WHITE);
        if(panel.optionNum == 0) {
        	g.drawRoundRect(((gWidth / 2) - (162 / 2)) - 5, 325, 172, 76, 20, 20);
        }
        else if(panel.optionNum == 1) {
        	g.drawRoundRect(((gWidth / 2) - (158 / 2)) - 5, 405, 168, 76, 20, 20);
        }
        else if(panel.optionNum == 2) {
        	g.drawRoundRect(((gWidth / 2) - (158 / 2)) - 5, 485, 168, 76, 20, 20);
        }
        
    }
	
	public void guideScreen(Graphics g) {
		g.drawImage(panel.infocontent, 0, 0, gWidth, gHeight, panel);
	}

//	public void alterScreen(Graphics g) {
//        
//		g.drawImage(panel.themescreen, 0, 0, panel);
//
//        String score = "Press 'Enter' to select!";
//        Font sfont = new Font("Helvetica", Font.BOLD, 14);
//        FontMetrics metr2 = g.getFontMetrics(sfont);
//
//        g.setFont(sfont);
//        g.setColor(Color.GRAY);
//        g.drawString(score, ((gWidth - metr2.stringWidth(score)) / 2) + 2, gHeight - 29);
//        g.setColor(Color.WHITE);        
//        g.drawString(score, (gWidth - metr2.stringWidth(score)) / 2, gHeight - 30);
//        
//        // draw selection
//        g.setColor(Color.WHITE);
//        if(panel.optionNum == 0) {
//        	g.drawRoundRect(48, 258, 372, 228, 20, 20);
//        }
//        else if(panel.optionNum == 1) {
//        	g.drawRoundRect(449, 258, 372, 228, 20, 20);
//        }
//        else if(panel.optionNum == 2) {
//        	g.drawRoundRect(850, 258, 372, 228, 20, 20);
//        }
//        
//    }
//	
//	public void pauseScreen(Graphics g) {
//		
//		g.setColor(new Color(0, 0, 0, 10));
//		g.fillRect(0, 0, gWidth, gHeight);
//		
//        String msg = "Paused";
//        Font mfont = new Font("Eras Demi ITC", Font.BOLD, 55);
//        FontMetrics metr1 = g.getFontMetrics(mfont);
//
//        g.setFont(mfont);
//        g.setColor(Color.GRAY);
//        g.drawString(msg, ((gWidth - metr1.stringWidth(msg)) / 2) + 3, 155);
//        g.setColor(Color.WHITE);        
//        g.drawString(msg, (gWidth - metr1.stringWidth(msg)) / 2, 153);
//
//        g.drawImage(panel.resumebutt, (gWidth / 2) - (170 / 2), 325, 170, 90, panel);
//		g.drawImage(panel.retrybutt, (gWidth / 2) - (158 / 2), 415, 158, 90, panel);
//		g.drawImage(panel.menubutt, (gWidth / 2) - (158 / 2), 505, 158, 90, panel);
//		
//        String score = "Press 'Enter' to select!";
//        Font sfont = new Font("Helvetica", Font.BOLD, 14);
//        FontMetrics metr2 = g.getFontMetrics(sfont);
//
//        g.setFont(sfont);
//        g.setColor(Color.GRAY);
//        g.drawString(score, ((gWidth - metr2.stringWidth(score)) / 2) + 2, gHeight - 29);
//        g.setColor(Color.WHITE);        
//        g.drawString(score, (gWidth - metr2.stringWidth(score)) / 2, gHeight - 30);
//        
//        // draw selection
//        g.setColor(Color.WHITE);
//        if(panel.optionNum == 0) {
//        	g.drawRoundRect(((gWidth / 2) - (170 / 2)) - 3, 320, 174, 85, 20, 20);
//        }
//        else if(panel.optionNum == 1) {
//        	g.drawRoundRect(((gWidth / 2) - (158 / 2)) - 5, 414, 168, 80, 20, 20);
//        }
//        else if(panel.optionNum == 2) {
//        	g.drawRoundRect(((gWidth / 2) - (158 / 2)) - 5, 504, 168, 80, 20, 20);
//        }
//        
//    }
	
//	public void gOverScreen(Graphics g) {
//		
//		g.drawImage(panel.gameover, 0, 0, panel);
//		
//		String msg = "Player " + panel.playerWon + " Won!";
//        Font mfont = new Font("Consolas", Font.PLAIN, 25);
//        FontMetrics metr1 = g.getFontMetrics(mfont);
//
//        g.setFont(mfont);
//        g.setColor(Color.GRAY);
//        g.drawString(msg, ((gWidth - metr1.stringWidth(msg)) / 2) + 2, 342);
//        g.setColor(Color.WHITE);        
//        g.drawString(msg, (gWidth - metr1.stringWidth(msg)) / 2, 340);
//
//        String score = "Press 'Enter' to select!";
//        Font sfont = new Font("Helvetica", Font.BOLD, 14);
//        FontMetrics metr2 = g.getFontMetrics(sfont);
//
//        g.setFont(sfont);
//        g.setColor(Color.GRAY);
//        g.drawString(score, ((gWidth - metr2.stringWidth(score)) / 2) + 2, gHeight - 29);
//        g.setColor(Color.WHITE);        
//        g.drawString(score, (gWidth - metr2.stringWidth(score)) / 2, gHeight - 30);
//        
//        // draw option
//        g.drawImage(panel.retrybutt, (gWidth / 2) - (158 / 2), 415, 158, 90, panel);
//		g.drawImage(panel.menubutt, (gWidth / 2) - (158 / 2), 505, 158, 90, panel);
//        
//        // draw selection
//        g.setColor(Color.WHITE);
//        if(panel.optionNum == 0) {
//        	g.drawRoundRect(((gWidth / 2) - (158 / 2)) - 5, 414, 168, 80, 20, 20);
//        }
//        else if(panel.optionNum == 1) {
//        	g.drawRoundRect(((gWidth / 2) - (158 / 2)) - 5, 504, 168, 80, 20, 20);
//        }
//        
//    }

}
