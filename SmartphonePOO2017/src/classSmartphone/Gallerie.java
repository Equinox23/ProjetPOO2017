package classSmartphone;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Gallerie extends Smartphone {
	
private Image _image;
	private int _x;
	private int _y;
	private boolean _autoSize; 
	private boolean _keepAspect;
	
	public Gallerie(File file, int x, int y, boolean autoSize, boolean keepAspect) throws IOException {
		super();
		
		setImage(ImageIO.read(file));
		setX(x);
		setY(y);
		setAutoSize(autoSize);
		setKeepAspect(keepAspect);
	}
	
	public Gallerie(File file, int x, int y, boolean autoSize) throws IOException {
		this(file, x, y, true, false);
	}
	
	public Gallerie(File file, int x, int y) throws IOException {
		this(file, x, y, true);
	}

	public Gallerie(File file) throws IOException {
		this(file, 0, 0, true);
	}
	
	public Gallerie(Image image, int x, int y, boolean autoSize, boolean keepAspect) {
		super();
		
		setImage(image);
		setX(x);
		setY(y);
		setAutoSize(autoSize);
		setKeepAspect(keepAspect);
	}
	
	public Gallerie(Image image, int x, int y, boolean autoSize) {
		this(image, x, y, true, false);
	}
	
	public Gallerie(Image image, int x, int y) {
		this(image, x, y, true);
	}
	
	public Gallerie(Image image) {
		this(image, 0, 0, true);
	}
	
	public Gallerie() {
		super();
		setX(0);
		setY(0);
		setImage(null);
		setAutoSize(false);
	}
	
	public void setImage(Image image) {
		_image = image;
	}
	
	public void setX(int x) {
		_x = x;
	}
	
	public void setY(int y) {
		_y = y;
	}
	
	public void setAutoSize(boolean autoSize) {
		_autoSize = autoSize;
	}
	
	public void setKeepAspect(boolean keepAspect) {
		_keepAspect = keepAspect;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		
		if (_image != null) {
			if (!_autoSize) {
				g.drawImage(_image, _x, _y, _image.getWidth(null), _image.getHeight(null), null);
			}
			else {
				Graphics2D g2d = (Graphics2D) g;
				Double scaleWidth = new Double(getWidth()) / new Double(_image.getWidth(null));
				Double scaleHeight = new Double(getHeight()) / new Double(_image.getHeight(null));
				if (_keepAspect) {
					if (scaleWidth > scaleHeight) {
						scaleWidth = scaleHeight;
					}
					else {
						scaleHeight = scaleWidth;
					}
				}
				g2d.scale(scaleWidth, scaleHeight);
				g2d.drawImage(_image, _x, _y, null);
			}
		}
	}


}
