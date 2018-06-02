package programGUIPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.SwingUtilities;

/**
 * Main window of TrainingProgram.
 * 
 * @author Guillaume Leclaire
 * 
 */
public class TrainingProgramFrame extends JFrame {

	// Attributes
	private TrainingProgramViewController trainingView;
	private TrainingMenu trainingMenu;
	
	/**
	 * Initialize GUI
	 */
	public void initGUI() {
		
		// Setting title
		setTitle("Training Program");
		
		// Setting size
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		setSize(width, height);
		
		// Setting Location
		setLocationRelativeTo(null);
		
		// Setting operation on closing
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/**
	 * Constructor(default)
	 */
	public TrainingProgramFrame() {
		
		// Initialize GUI
		initGUI();
		
		// Initialize the view and set it as the contentPane
		trainingView = new TrainingProgramViewController();
		setContentPane(trainingView);
		// Setting a menuBar
		trainingMenu = new TrainingMenu(trainingView);
		setJMenuBar(trainingMenu);
	}
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				
				// New Frame
				TrainingProgramFrame trainingFrame = new TrainingProgramFrame();
				trainingFrame.setVisible(true);
			}
		});
	}
}
