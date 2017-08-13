import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class JavaTutorial28 extends JFrame{
	
	JButton button1, button2, button3, button4, button5;
	String outputString = "";
	
	public static void main(String[] args) {
		new JavaTutorial28();
	}
	
	public JavaTutorial28() {
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Sixth Frame");
		
		/* Flow Layout
		 //Create a flow layout (Default)
		  
		 JPanel thePanel = new JPanel();
		  
		 //define the flow layout alignment
		 //FlowLayout.RIGHT, FlowLayout.CENTER
		  
		 thePanel.setLayout(new FLowLayout(FlowLayout.LEFT));
		  
		  //You can also define the pixels that separate the components 
		  //FlowLayout(alignment, horizontal gap, vertical gap)
		 
		 butoon1 = new JButton("Button 1");
		 thePanel.add(button1);
		 
		 End Flow Layout*/
		
		/*Border Layout*/
		
		JPanel thePanel = new JPanel();
		thePanel.setLayout(new BorderLayout());
		
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");
		button4 = new JButton("Button 4");
		
		/*
		 * if you put components in the same space the
		 * last one in stays and everything else goes
		 * EX.
		 * thePannel.add(button1, BorderLayout.NORTH);
		 * thePanel.add(button2, BorderLayout.NORTH);
		 * only button2 shows
		 */
		
//		thePanel.add(button1, BorderLayout.NORTH);
//		thePanel.add(button2, BorderLayout.SOUTH);
//		thePanel.add(button3, BorderLayout.EAST);
//		thePanel.add(button4, BorderLayout.WEST);
//		thePanel.add(button5, BorderLayout.CENTER);
		
		/*
		 * If you want more than one component to show
		 * up in the same part of a border layout put
		 * them in a panel and then add the panel to
		 * the border layout panel
		 */
		
//		JPanel thePanel2 = new JPanel();
//		
//		thePanel2.add(button1);
//		thePanel2.add(button2);
//		
//		thePanel.add(thePanel2,  BorderLayout.NORTH);
		
		/*Box Layout*/
		Box theBox = Box.createHorizontalBox();
		
		/*You can also use Box theBox = Box.createVertialBox();
		 * theBox.add(button1);
		 * theBox.add(button2);
		 * theBox.add(button3);
		 * theBox.add(button4);
		 */
		
		/*You can also separate the components with struts
		 * theBox.add(button1);
		 * theBox.add(Box.createHorizontalStrut(4));
		 * theBox.add(button2);
		 * theBox.add(Box.createHorizontalStrut(4));
		 * theBox.add(button3);
		 * theBox.add(Box.horizontalStrut(4));
		 * theBox.add(button4);
		 */
		
		//A rigid area gives you the option to space using
		//horizontal and vertical spacing 
		
		theBox.add(button1);
		theBox.add(button2);
		//theBox.add(Box.createRigidArea(new Dimension(30,20)));
		
		//When you use a glue you position the components as
		//far apart as possible while remaining on the screen
		//There is also a createVerticalGlue
		
		theBox.add(Box.createHorizontalGlue());
		theBox.add(button3);
		
		this.add(theBox);
		
		//this.add(thePanel); //Don't use for BOX LAYOUT
		
		this.setVisible(true);
	}
}
