package its.pbo.PlanetDefense;

import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class ImageLoader {
    public static Image loadImage(String imagePath) {
		URL imageURL = ImageLoader.class.getResource(imagePath);
	
		if (imageURL == null) {
			// Print an error message and return null or throw an exception
			System.err.println("Error loading image: " + imagePath);
			return null; // or throw new RuntimeException("Error loading image: " + imagePath);
		}
	
		System.out.println("Loaded image from: " + imageURL.toExternalForm());
	
		ImageIcon icon = new ImageIcon(imageURL);
		return icon.getImage();
	}
}
