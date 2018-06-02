package exercicesPackage;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This class is a panel that contains different image of shoulder exercises
 * 
 * @author Guillaume Leclaire
 *
 */
public class ShoulderExercises extends JPanel{

	// Attributes
	// Images of exercises
	private ImageIcon exe1;
	private ImageIcon exe2;
	private ImageIcon exe3;
	private ImageIcon exe4;
	private ImageIcon[] imageExercises;	// Array of all images
	
	// Labels to contains Images
	private JLabel exe1L;
	private JLabel exe2L;
	private JLabel exe3L;
	private JLabel exe4L;
	private JLabel[] labelImages;	// Array of all Labels that will contain an Image
	
	private String[] imageNames; 

	/**
	 * Constructor(default)
	 */
	public ShoulderExercises() {
	
		setImageNames();
		initImage();
		addImages();
	}
	
	// Setters
	
	public void setImageNames() {
		
		imageNames = new String[] {"Image/ImageTest1.png", "Image/ImageTest2.png",
				   "Image/ImageTest3.png", "Image/ImageTest2.png"};
	}
	
	/**
	 * Create all images and all labels that contains these images
	 */
	public void initImage() {
		
		// Filling the image array with all images
		imageExercises = new ImageIcon[] {exe1, exe2, exe3, exe4};
		
		// Filling the label array with all labels
		labelImages = new JLabel[] {exe1L, exe2L, exe3L, exe4L};
		
		int size = imageExercises.length;
		
		// Creating an image and a label with that image
		for(int i = 0; i < size; i++) {
			
			imageExercises[i] = new ImageIcon(imageNames[i]);
			labelImages[i] = new JLabel("", imageExercises[i], JLabel.CENTER);
		}
	}
	
	/**
	 * Set the layout and add the labels to this panel
	 */
	public void addImages() {
		
		setLayout(new FlowLayout());
		
		int size = imageExercises.length;
		
		// Adding each label to this panel
		for(int i = 0; i < size; i++) {
		
			add(labelImages[i]);
		}
	}
}
