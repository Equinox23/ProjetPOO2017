package Fonctions;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 * <b>La class Picture permet la gestion d'une image.</b>
 * <p>
 * Membres de Picture :
 * <ul>
 * <li>nomIcon : nom de l'image</li>
 * <li>dimIcon : dimension de l'image</li>
 * <li>imgIcon : ImageIcon de l'image</li>
 * <li>hintsIcon : paramétrage pour setImgIconResized</li>
 * <li>stretch : paramétrage pour setImgIconResized</li>
 * <li>zoom : paramétrage pour setImgIconResized</li>
 * <li>zoomAuto : paramétrage pour setImgIconResized</li>
 * </ul>
 * </p>
 * @author Giuseppe
 * @category Gallery
 * @see Gallery
 * @see setImgIconResized
 */
public class ImageGalerie {
	private String nomIcon = new String("");
	private Dimension dimIcon = new Dimension(133, 100);
	private ImageIcon imgIcon;
	private int hintsIcon = Image.SCALE_DEFAULT; 
	private boolean stretch = true;
	private double zoom=1;
	private boolean zoomAuto=true;
	/**
	 * Constructeur de Pictures:
	 * 
	*/
	public ImageGalerie(){};
	/**
	 * Constructeur de Pictures:
	 * @param nomIcon : la nom de l'image à redimensionner.
	 * @param dimIcon : la nouvelle Dimension de l'image à redimensionner.
	 * 
	*/
	public ImageGalerie(String nomIcon, Dimension dimIcon){
		this.setNomIcon(nomIcon, dimIcon);
	}
	/**
	 * Constructeur de Pictures:
	 * @param imgIcon : l'ImageIcon à redimensionner.
	 * @param dimIcon : la nouvelle Dimension de l'ImageIcon à redimensionner.
	 * 
	*/
	public ImageGalerie(ImageIcon imgIcon, Dimension dimIcon){
		this.setImgIconResized(imgIcon, dimIcon);
	}
	
	public void setNomIcon(String nomIcon, Dimension dimIcon) {
		this.nomIcon = nomIcon;
		ImageIcon tmpImageIcon = new ImageIcon(nomIcon);
		this.setImgIconResized(tmpImageIcon,dimIcon);
	}

	/**
	 * <b>Crée une version redimensionnée de l'image.</b> 
	 *  <p>
	 * Un nouvel objet Image est retourné qui rendra l'image
	 * <ul>
	 * <li>Si le strecth est demandée: à la largeur et la hauteur spécifiées.</li>
	 * <li>Si le zoomAuto est demandée: l'image est retournée, en proportion, mais avec un zoom pour simuler un effect rognement</li>
	 * <li>Sinon l'image est retournée, en proportion, pour occuper le maximum de place (simuler un effet plein ecran)</li>
	 * </ul>
	 * Si la largeur ou la hauteur est un nombre négatif, alors une valeur est substitué à maintenir le ratio d'aspect des dimensions de l'image originale.
	 * Si la largeur et la hauteur sont négatifs, les dimensions de l'image d'origine sont utilisées.
	 * par defaut hintsIcon = Image.SCALE_DEFAULT (flags to indicate the type of algorithm to use for image resampling)
	 *  </p>
	 * @param tmpImageIcon : la ImageIcon à redimensionner
	 * @param dimIcon : la nouvelle Dimension de l'ImageIcon à redimensionner
	 * @return tmpResized : la nouvelle ImageIcon redimensionnée
	 */
	public ImageIcon setImgIconResized(ImageIcon tmpImageIcon, Dimension dimIcon) {
		this.setDimIcon(dimIcon) ;
		Image tmpImage = tmpImageIcon.getImage();
		int w,h;
		if(zoomAuto==true){
			double rapp = (double)tmpImageIcon.getIconWidth()/(double)tmpImageIcon.getIconHeight(); 
			if(rapp<1.0)
				zoom=1.0/rapp;
			else
				zoom=rapp;
			w = (int) (dimIcon.width*zoom);
			h = (int) (dimIcon.height*zoom);
		}
		else {
			w = (int) (dimIcon.width);//*zoom);
			h = (int) (dimIcon.height);//*zoom);
		}
		if (isStretch()==true){
			try {
				if(tmpImageIcon.getIconWidth()>tmpImageIcon.getIconHeight() 
						&& (tmpImageIcon.getIconWidth()/tmpImageIcon.getIconHeight())>(dimIcon.width/dimIcon.height)) 
					h = -1; // orientation paysage
				else
					w = -1;// orientation portrait
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		tmpImage = tmpImage.getScaledInstance(w, h,hintsIcon);
		ImageIcon tmpResized = new ImageIcon(tmpImage);
		this.setImgIcon(tmpResized);
		return  tmpResized;
	}
	/**
	 * @return the zoomAuto
	 */
	public boolean isZoomAuto() {
		return zoomAuto;
	}
	/**
	 * @param zoomAuto the zoomAuto to set
	 */
	public void setZoomAuto(boolean zoomAuto) {
		this.zoomAuto = zoomAuto;
	}
	/**
	 * @return the stretch
	 */
	public boolean isStretch() {
		return stretch;
	}
	/**
	 * @param stretch the stretch to set
	 */
	public void setStretch(boolean stretch) {
		this.stretch = stretch;
	}
	/**
	 * @return the zoom
	 */
	public double getZoom() {
		return zoom;
	}
	/**
	 * @param zoom the zoom to set
	 */
	public void setZoom(double zoom) {
		this.zoom = zoom;
	}
	/**
	 * @return the nomIcon
	 */
	public String getNomIcon() {
		return nomIcon;
	}
	/**
	 * @return the dimIcon
	 */
	public Dimension getDimIcon() {
		return dimIcon;
	}
	/**
	 * @param dimIcon the dimIcon to set
	 */
	public void setDimIcon(Dimension dimIcon) {
		this.dimIcon = dimIcon;
	}
	/**
	 * @return the imgIcon
	 */
	public ImageIcon getImgIcon() {
		return imgIcon;
	}
	/**
	 * @param imgIcon the imgIcon to set
	 */
	public void setImgIcon(ImageIcon imgIcon) {
		this.imgIcon = imgIcon;
	}

}
