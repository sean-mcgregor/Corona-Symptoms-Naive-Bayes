package coronaVirusSymptomsNaiveBayers;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 *
 * @author seanm
 * 
 * @since 19-03-2020
 *
 */

public class Screen extends JFrame implements ActionListener {
	
	//creating screen elements
	JButton button1;
	JFileChooser fileSelector;
	JPanel northPanel, southPanel, eastPanel, westPanel, centerPanel;
	
	public Screen(String title) {
		
		super("title");
		setSize(750, 400);
		BorderLayout bl1 = new BorderLayout();
		fileSelector = new JFileChooser();
		button1 = new JButton("Seahawk Button");
		setLayout(bl1);
		
		centerPanel = new JPanel();
		northPanel = new JPanel();
		southPanel = new JPanel();
		eastPanel = new JPanel();
		westPanel = new JPanel();
		
		centerPanel.add(fileSelector);
		
		add(centerPanel, BorderLayout.CENTER);
		add(northPanel, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		add(eastPanel, BorderLayout.EAST);
		add(westPanel, BorderLayout.WEST);
		setVisible(true);
	}
	 
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
