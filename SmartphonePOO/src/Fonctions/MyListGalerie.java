package Fonctions;
import java.io.File;
import java.util.ArrayList;
/**
 * <b>La classe MyListGalerie permet la gestion d'une gallerie d'image.</b>
 * <p>
 * Membres de Gallery :
 * <ul>
 * <li>directoryGalerie</li>
 * <li>arrayImage</li>
 * <li>nombreImg</li>
 * <li>ndxEnCours</li>
 * <li>picture</li>
 * </ul>
 * </p>
 *  */
public class MyListGalerie {
	private String directoryGalerie = "";
	private ArrayList<String> arrayImage = new ArrayList<String>();
	private int nombreImg=0;
	private int ndxEnCours = 0;
	public ImageGalerie picture = new ImageGalerie();

	/**
	 * Un param�tre est yn�cessaire lors de sa contruction:  
	 * le r�pertoire de la gallerie.
	 * @param dir R�pertoire des images qui vont composer la gallerie.
	 */
	public MyListGalerie(String dir) {
		setDirectoryGalerie(dir);
		this.lireImages(dir);
	}
	//------ GET and SET
	/**
	 * @return directoryGalerie : le r�pertoire de la gallerie
	 */
	public String getDirectoryGalerie() {
		return directoryGalerie;
	}
	/**
	 * Modifier le r�pertoire de la gallerie.
	 * @param directoryGalerie le nouveau r�pertoire de la gallerie.
	 */
	public void setDirectoryGalerie(String directoryGalerie) {
		this.directoryGalerie = directoryGalerie;
	}
	/**
	 * Lire la liste des noms des images de la gallerie
	 * @return arrayImage : la liste des noms des images de la gallerie
	 */
	public ArrayList<String> getArrayImage() {
		return arrayImage;
	}
	/**
	 * Recalcul et retourne le nombre d'images  de la gallerie 
	 * @return nombreImg le nombre d'images
	 */
	public int getNombreImg() {
		setNombreImg();
		return nombreImg;
	}
	/**
	 *  Recalcul le nombre d'images selon le tableau arrayImage
	 */
	private void setNombreImg() {
		this.nombreImg = this.arrayImage.size();
	}
	/**
	 * @return ndxEnCours : l'index de la Picture en cours
	 */
	public int getNdxEnCours() {
		return ndxEnCours;
	}
	/**
	 * Modifier l'index de la Picture en cours
	 * @param ndxEnCours : nouveau index de la Picture
	 */
	private void setNdxEnCours(int ndxEnCours) {
		this.ndxEnCours = ndxEnCours;
	}

	/**
	 * Synchroniser Gallery et Picture selon l'index en cours 
	 * et charger la Picture dans la Gallery
	 * @param ndxEncours : nouveau index de la Picture
	 */
	public void setPicture(int ndxEncours) {
		if (ndxEncours >= this.getNombreImg())
			ndxEncours = 0;	// recommence � 0 
		this.setNdxEnCours(ndxEncours);
		try {
			String nom = arrayImage.get(ndxEncours);
			this.picture.setNomIcon(nom,this.picture.getDimIcon());
		} catch (IndexOutOfBoundsException e) {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//------ M�thodes 
	/**
	 * Scanner le r�pertoire des images
	 * et charger la liste des images trouv�es
	 * @param dir : r�pertoire des images de la gallerie
	 */
	private void lireImages(String dir){
		setDirectoryGalerie(dir);
		arrayImage = new ArrayList<String>();
		try {
			File f = new File(getDirectoryGalerie()); 
			if (f.isDirectory()==true){
				File files [] = f.listFiles();
				for (int i =0; i<files.length; i++){
					if (isImage(files[i])){
						arrayImage.add(files[i].getAbsolutePath());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		setNombreImg();
	}
	/**
	 * Test si f est un fichier image (.jpg) 
	 * @param f File � tester
	 * @return true si f est un jpg
	 */
	private boolean isImage(File f) {
		if (f.getName().toLowerCase().endsWith(".jpg"))
			return true;
		else
			return false;
	}

}


