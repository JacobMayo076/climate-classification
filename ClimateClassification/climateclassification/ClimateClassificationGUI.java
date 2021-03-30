package climateclassification;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Image;

public class ClimateClassificationGUI extends JFrame
{
	private Image ccIcon;
	
	
	public ClimateClassificationGUI()
	{
		//Set up window
		this.setTitle("Climate Classification");
		ccIcon = new ImageIcon(this.getClass().getResource("/resources/CC Icon.png")).getImage();
		this.setIconImage(ccIcon);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		MainPanel panel = new MainPanel();
		this.getContentPane().add(panel);
		this.pack();
	}
	
	public static void main(String[] args)
	{
		new ClimateClassificationGUI();
	}
}
