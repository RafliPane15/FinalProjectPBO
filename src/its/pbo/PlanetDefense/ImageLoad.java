package its.pbo.PlanetDefense;

import java.net.URL;

import javax.swing.*;

public class ImageLoad {
	
GamePanel panel;
	
	public ImageLoad(GamePanel panel) {
		this.panel = panel;
	}
	
	public void loadImages() {
		try {
            ImageIcon main = new ImageIcon("image/mainscreenrevisi.png");
            panel.title = main.getImage();
            System.out.println("Main screen image loaded successfully.");
            
            // Add similar print statements for other images

            ImageIcon st = new ImageIcon("image/playbutton.png");
            panel.playbutton = st.getImage();
            System.out.println("Play button image loaded successfully.");
            
            // Add similar print statements for other images

            // ...

        } catch (Exception e) {
            System.err.println("Error loading images: " + e.getMessage());
            e.printStackTrace();
        }
	}

}
