import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.util.Enumeration;
import javax.swing.tree.*;

@SuppressWarnings("serial")
public class JavaTutorial27 extends JFrame{
	JButton button1;
	String outputString = "";
	
	JTree theTree;
	
	DefaultMutableTreeNode documents, work, games, emails;
	
	DefaultMutableTreeNode fileSystem = new DefaultMutableTreeNode("C Drive");
	
	public static void main(String[] args) {
		new JavaTutorial27();
	}
	
	public JavaTutorial27() {
		this.setSize(400, 400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Sixth Frame");
		
		JPanel thePanel = new JPanel();
		
		button1 = new JButton("Get Answer");
		
		ListenForButton lForButton = new ListenForButton();
		
		button1.addActionListener(lForButton);
		
		thePanel.add(button1);
		
		theTree = new JTree(fileSystem);
		
		theTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		
		theTree.setVisibleRowCount(8);
		
		documents = addFile("Docs", fileSystem);
		
		addFile("Taxes.exl", documents);
		emails = addFile("Emails", documents);
		addFile("Story.txt", documents);
		addFile("Schedule.txt", documents);
		
		addFile("CallBob.txt", emails);
		
		work = addFile("Work Applications", fileSystem);
		addFile("Spreadsheet.exe", work);
		addFile("Wordprocessor.exe", work);
		addFile("Presentation.exe", work);
		
		games = addFile("Games", fileSystem);
		addFile("SpaceInvaders.exe", games);
		addFile("PacMan.exe", games);
		
		JScrollPane scrollBox = new JScrollPane(theTree);
		
		Dimension d = scrollBox.getPreferredSize();
		d.width = 200;
		scrollBox.setPreferredSize(d);
		
		thePanel.add(scrollBox);
		
		this.add(thePanel);
		
		this.setVisible(true);
	}
	
	private DefaultMutableTreeNode addFile(String fileName, DefaultMutableTreeNode parentFolder) {
		DefaultMutableTreeNode newFile = new DefaultMutableTreeNode(fileName);
		
		parentFolder.add(newFile);
		
		return newFile;
	}
	
	private class ListenForButton implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1) {
				Object treeObject = theTree.getLastSelectedPathComponent();
				
				DefaultMutableTreeNode theFile = (DefaultMutableTreeNode) treeObject;
				
				String treeNode = (String) theFile.getUserObject();
				
				outputString = "The Selected Node: " + treeNode + "\n";
				
				outputString += "Number of Children: " + theFile.getChildCount() + "\n";
				
				outputString += "Number of Siblings: " + theFile.getSiblingCount() + "\n";
				
				outputString += "The parent: " + theFile.getParent() + "\n";
				
				outputString += "Next Node: " + theFile.getNextNode() + "\n";
				
				outputString += "Next Node: " + theFile.getPreviousNode() + "\n";
				
				outputString += "\nChildrend of Node\n";
				
				for(@SuppressWarnings("rawtypes")
				Enumeration enumValue = theFile.children(); enumValue.hasMoreElements(); ) {
					outputString += enumValue.nextElement() + "\n";
				}
				
				outputString += "\nPath From Root\n";
				
				TreeNode[] pathNodes = theFile.getPath();
				
				for(TreeNode indivNodes: pathNodes) {
					outputString += indivNodes + "\n";
				}
				
				JOptionPane.showMessageDialog(JavaTutorial27.this, outputString, "Information", JOptionPane.INFORMATION_MESSAGE);
				
				outputString = "";
			}
		}
	}
	
}
