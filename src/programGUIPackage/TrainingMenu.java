package programGUIPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JMenuBar;

import exercicesPackage.ShoulderExercises;

/**
 * Represent a Menu bar with 7 JButton on it
 * @author Guillaume Leclaire
 *
 */
public class TrainingMenu extends JMenuBar{

	// Attributes 
	JButton b0;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton[] arrayButton;	// Array that contains all buttons
	String[] muscleGroups;	// Array that contains all button's names
	TrainingProgramFrame frame;
	
	/**
	 * Constructor(default)
	 */
	public TrainingMenu(TrainingProgramFrame frame) {
		
		this.frame = frame;
		initMenu();
		initListener();
	}
	
	
	/**
	 * Initialize the Menu Bar
	 */
	public void initMenu() {
		
		arrayButton = new JButton[] {b0, b1, b2, b3, b4, b5, b6};
		muscleGroups = new String[] {"Chest", "Back", "Arms", "Shoulders",
									 "Core", "Legs", "Calves"};
		initButtons();
		addAllButton();
	}
	
	/**
	 * Create all buttons with a specific font
	 */
	public void initButtons() {
		
		int size = arrayButton.length;
		
		// Creating a new Font
		Font newFont = new Font("Times New Roman", Font.BOLD, 17);
		
		// For each button adding it to the Menu
		for(int i = 0; i < size; i++) {
			
			arrayButton[i] = new JButton(muscleGroups[i]);
			arrayButton[i].setFont(newFont);
			arrayButton[i].setBackground(Color.LIGHT_GRAY);
		}
	}
	
	/**
	 * Add all buttons to the Menu
	 */
	public void addAllButton() {
		
		int size = arrayButton.length;
		
		// For each button adding it to the Menu
		for(int i = 0; i < size; i++) {
			
			add(arrayButton[i]);
		}
	}
	
	/**
	 * Add to each Button a listener that change the view 
	 */
	public void initListener() {
		
		int size = arrayButton.length;
		
		// Adding a listener to each button
		for(int i = 0; i < size; i++) {
			
			arrayButton[i].addActionListener(new ActionListener() {
				
				/**
				 * This methode will change the view
				 */
				public void actionPerformed(ActionEvent arg0) {
					
					frame.getContentPane().removeAll();
					frame.setContentPane(new ShoulderExercises());
					//frame.revalidate();
					frame.setVisible(true);
				}
			});
		}
	}
}
