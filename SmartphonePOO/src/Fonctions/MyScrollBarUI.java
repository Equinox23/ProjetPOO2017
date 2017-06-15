package Fonctions;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class MyScrollBarUI extends BasicScrollBarUI {
	private Image imageThumb, imageTrack;
	public MyScrollBarUI(){
		imageThumb = WrapImage .create(45, 45, new Color(220,220,220));
		imageTrack = WrapImage .create(32, 32, new Color(90,90,90));
	}
	
	 @Override
     protected JButton createDecreaseButton(int orientation) {
         return createZeroButton();
     }

     @Override    
     protected JButton createIncreaseButton(int orientation) {
         return createZeroButton();
     }
     private JButton createZeroButton() {
         JButton b = new JButton();
         b.setPreferredSize(new Dimension(0, 0));
         b.setMinimumSize(new Dimension(0, 0));
         b.setMaximumSize(new Dimension(0, 0));
         return b;
     }
	@Override
	protected void paintTrack(Graphics g, JComponent c, Rectangle r) {
		g.setColor(Color.blue);
        ((Graphics2D) g).drawImage(imageThumb,
                r.x, r.y, r.width, r.height, null);

	}

	@Override
	protected void paintThumb(Graphics g, JComponent c, Rectangle r) {
		 ((Graphics2D) g).drawImage(imageTrack,
	                r.x+2, r.y+2, r.width-4, r.height-9, null);
	}
	private static class WrapImage {

	    static public Image create(int w, int h, Color c) {
	        BufferedImage bi = new BufferedImage(
	                w, h, BufferedImage.TYPE_INT_ARGB);
	        Graphics2D g2d = bi.createGraphics();
	        g2d.setPaint(c);
	        g2d.fillRect(0, 0, w, h);
	        g2d.dispose();
	        return bi;}
	}
}
