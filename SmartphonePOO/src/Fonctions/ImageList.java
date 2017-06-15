package Fonctions;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;

import graphismes.MainFrame;



/**
 * Panel de gestion de la liste des images: utilis� pour la gallerie 
 * et pour la s�lection de l'image dans les contacts (Image)
 */
public abstract class ImageList extends PanGalerieTop{
	private static final long serialVersionUID = 1L;
	public PanGalerieTop mpl = new PanGalerieTop();
	public JScrollPane sp = new JScrollPane(mpl);
	public BoutonImg[] tblButtonIMG;
	public BoutonImg btnLBLZoom = new BoutonImg();

	public static int nbColonne = 5;
	public static int gap = 3;
	public static Dimension dim;
	public static int size;

	/**
	 * Constructeur avec un tableau de bouton vide 
	 * qui est rempli ici
	 */
	public ImageList(BoutonImg tblButtonIMG[]){
		super();
		this.tblButtonIMG=tblButtonIMG;
		this.add(sp);
		setAscenseurSP();
		setSizeGUI();
	}
	private void setAscenseurSP() {
		sp.setViewportView(mpl);
		sp.setVisible(true);
		sp.setBorder(BorderFactory.createEmptyBorder());
		sp.setWheelScrollingEnabled(true);
//		sp.getVerticalScrollBar().setUI(new MyScrollBarUI());	
//		sp.getHorizontalScrollBar().setUI(new MyScrollBarUI());
		sp.setPreferredSize(new Dimension(420,555));
	}
	public void setSizeGUI(){
		mpl.removeAll();
		nbColonne = 3;
		size =400/nbColonne;
		dim = new Dimension(size,size-0);

		// Ajout les images aux boutons
		for (int i=0; i<tblButtonIMG.length; i++){
			MainFrame.galerie.picture.setDimIcon(dim);
			MainFrame.galerie.setPicture(i);
			tblButtonIMG[i] = new BoutonImg(MainFrame.galerie.picture.getImgIcon(),dim);
		}
		// ajout les boutons � la grille mpl
		setGUI();	
	}

	public void setGUI(){
		mpl.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(gap, gap, gap, gap);

		int c = 0, l = -1;
		for (int i=0; i<tblButtonIMG.length; i++){
			if(i % nbColonne == 0){
				l++; c=0;
			}
			else
				c++;
			
			gbc.gridx = c; gbc.gridy = l;
			mpl.add(tblButtonIMG[i], gbc);
		}
	}

}
