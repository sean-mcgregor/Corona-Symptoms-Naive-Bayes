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
	JButton fcOpen;
	JFileChooser fc;
	JPanel northPanel, southPanel, eastPanel, westPanel, centerPanel;
	
	public Screen(String title) {
		
		super("title");
		setSize(750, 400);
		BorderLayout bl1 = new BorderLayout();
		fcOpen = new JButton("Select File");
		fcOpen.addActionListener(this);
		setLayout(bl1);
		
		centerPanel = new JPanel();
		northPanel = new JPanel();
		southPanel = new JPanel();
		eastPanel = new JPanel();
		westPanel = new JPanel();
		
		centerPanel.add(fcOpen);
		
		add(centerPanel, BorderLayout.CENTER);
		add(northPanel, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		add(eastPanel, BorderLayout.EAST);
		add(westPanel, BorderLayout.WEST);
		setVisible(true);
	}
	
	public String chooseFile() {
		
		String filePath = "";
		
		//configuring file chooser window
		fc = new JFileChooser();
		fc.setCurrentDirectory(new java.io.File("C:\\Users"));
		fc.setDialogTitle("Choose File for Dataset Training");

		if (fc.showOpenDialog(fcOpen) == JFileChooser.APPROVE_OPTION) {
			
			filePath = fc.getSelectedFile().getAbsolutePath();
		}
		
		return filePath;
	}
	 
	public void actionPerformed(ActionEvent e) {
		
		//launching file chooser window
		if (e.getSource() == fcOpen) {
			
			System.out.println(chooseFile());
		}
	}
}
