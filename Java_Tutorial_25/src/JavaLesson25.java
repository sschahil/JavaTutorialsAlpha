import javax.swing.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class JavaLesson25 extends JFrame{
	
	JButton button1;
	String infoOnComponent = "";
	@SuppressWarnings("rawtypes")
	JList favoriteMovies, favoriteColors;
	@SuppressWarnings("rawtypes")
	DefaultListModel  defListModel = new DefaultListModel();
	JScrollPane scroller;
	
	static public void main(String[] args) {
		
		new JavaLesson25();
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public JavaLesson25() {
		
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Fifth Frame");
		
		JPanel thePanel = new JPanel();
		
		button1 = new JButton("Get Answer");
		
		ListenForButton lForButton = new ListenForButton();
		button1.addActionListener(lForButton);
		thePanel.add(button1);
		
		String[] movies = {"Matrix", "Minority Report", "Big"};
		
		favoriteMovies = new JList(movies);
		favoriteMovies.setFixedCellHeight(30);
		favoriteMovies.setFixedCellWidth(150);
		favoriteMovies.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		String[] colors = { "Black", "Blue", "White", "Green", "Orange", "Gray", "Pink" };
		
		for(String color : colors)
		{
			defListModel.addElement(color);
			
		}
		defListModel.add(2, "Purple");
		
		favoriteColors = new JList(defListModel);
		favoriteColors.setVisibleRowCount(4);
		scroller = new JScrollPane(favoriteColors, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		favoriteColors.setFixedCellHeight(30);
		favoriteColors.setFixedCellWidth(150);
		
		thePanel.add(favoriteMovies);
		thePanel.add(scroller);
		
		this.add(thePanel);
		this.setVisible(true);
	}
	
	private class ListenForButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource() == button1)
			{
				
				if(defListModel.contains("Black")) infoOnComponent += "Black is Here\n";
				if(!defListModel.isEmpty()) infoOnComponent += "Isn't Empty\n";
				
				infoOnComponent += "Elements in the List " + defListModel.size() + "\n";
				infoOnComponent += "Last Element in the List " + defListModel.lastElement() + "\n";
				infoOnComponent += "First Element in the List " + defListModel.firstElement() + "\n";
				infoOnComponent += "In index 1 " + defListModel.get(1) + "\n";
				
				defListModel.remove(0);
				defListModel.removeElement("Big");
				
				Object[] arrayOfList = defListModel.toArray();
				for(Object color : arrayOfList){
					infoOnComponent += color + "\n";
				}
 				
				JOptionPane.showMessageDialog(JavaLesson25.this, infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE);
				infoOnComponent = "";
			}
		}
		
	}
	
}
