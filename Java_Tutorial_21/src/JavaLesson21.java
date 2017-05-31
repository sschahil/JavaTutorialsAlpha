import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

import java.awt.event.*;

public class JavaLesson21 extends JFrame{

	JButton button1;
	JTextField textfield1;
	JTextArea textArea1;
	int buttonClicked;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JavaLesson21();
		
	}

	public JavaLesson21() {
		
		this.setSize(400, 400);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		Dimension dim = tk.getScreenSize();
		
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight() / 2);
		
		this.setLocation(xPos, yPos);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Second Frame");
		
		JPanel thePanel = new JPanel();
		
		button1 = new JButton("Click Here");
		
		ListenForButton lForButton = new ListenForButton();
		
		button1.addActionListener(lForButton);
		
		thePanel.add(button1);
		
		textfield1 = new JTextField("Type Here", 15);
		
		ListenForKeys lForKeys = new ListenForKeys();
		
		textfield1.addKeyListener(lForKeys);
		
		thePanel.add(textfield1);
		
		textArea1 = new JTextArea(15, 20);
		
		textArea1.setText("Tracking Events\n");
		
		textArea1.setLineWrap(true);
		
		textArea1.setWrapStyleWord(true);
		
		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		thePanel.add(scrollbar1);
		
		this.add(thePanel);
		
		ListenForWindow lForWindow = new ListenForWindow();
		
		this.addWindowListener(lForWindow);
		
		this.setVisible(true);
		
		ListenForMouse lForMouse = new ListenForMouse();
		
		thePanel.addMouseListener(lForMouse);
		
	}
	
	//Implements Listeners
	private class ListenForButton implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
				
			if (e.getSource() == button1) {
				
				buttonClicked++;
				
				textArea1.append("Button Clicked " + buttonClicked + " times\n");
				
				e.getSource().toString();
				
			}
		}
	}
	
	private class ListenForKeys implements KeyListener {
		

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			textArea1.append("Key Hit: " + e.getKeyChar() + "\n");
		}
		
		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
				
		}
	
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
		
		}
}
	
	private class ListenForWindow implements WindowListener{
		
		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea1.append("Window Activated\n");
		}

		@Override
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			textArea1.append("Window Not Active\n");
		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			textArea1.append("Window in Normal State\n");
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			textArea1.append("Window is Minimized\n");
		}

		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			textArea1.append("Window Created\n");
		}
		
	}
	
	private class ListenForMouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			textArea1.append("Mouse Panel position: " + e.getX() + " " + e.getY() + "\n");
			textArea1.append("Mouse Screen position: " + e.getXOnScreen() + " " + e.getYOnScreen() + "\n");
			textArea1.append("Mouse Button: " + e.getButton() + "\n");
			textArea1.append("Mouse Clicks: " + e.getClickCount() + "\n");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
