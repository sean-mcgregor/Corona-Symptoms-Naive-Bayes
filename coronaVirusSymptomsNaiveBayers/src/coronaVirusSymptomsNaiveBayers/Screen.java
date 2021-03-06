package coronaVirusSymptomsNaiveBayers;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sean-mcgregor
 * 
 * @since 19-03-2020
 *
 */
public class Screen extends JFrame implements ActionListener {
	
	//creating screen elements
	JButton fcOpen, diagnoseButton;
	JFileChooser fc;
	JPanel northPanel, southPanel, eastPanel, westPanel, centerPanel;
	JComboBox<String> temperatureDropdown, achesDropdown, coughDropdown, soreThroatDropdown, dangerZoneDropdown, hasCovidDropdown;
	JLabel l1, l2, l3, l4 ,l5;
	Dataset fileData;
	JFrame message;
	
	public Screen(String title) {
		
		//organising screen elements
		super("CoronaVirus Diagnostic Tool");
		setSize(750, 600);
		BorderLayout bl1 = new BorderLayout();
		
		fcOpen = new JButton("Select Dataset File");
		fcOpen.addActionListener(this);
		
		diagnoseButton = new JButton("Diagnose a patient");
		diagnoseButton.addActionListener(this);
		
		String yesNo[] = {"yes", "no"};
		String temperatures[] = {"hot", "normal", "cool", "cold"};
		
		temperatureDropdown = new JComboBox<String>(temperatures);
		achesDropdown = new JComboBox<String>(yesNo);
		coughDropdown = new JComboBox<String>(yesNo);
		soreThroatDropdown = new JComboBox<String>(yesNo);
		dangerZoneDropdown = new JComboBox<String>(yesNo);
		hasCovidDropdown = new JComboBox<String>(yesNo);
		
		message = new JFrame();
		
		l1 = new JLabel("Enter Patient Temperature : ");
		l2 = new JLabel("Patient has aches? : ");
		l3 = new JLabel("Patient has cough? : ");
		l4 = new JLabel("Patient has sore throat? : ");
		l5 = new JLabel("Patient recently visited danger zone? : ");
		
		setLayout(bl1);
		
		centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(5, 2));
		northPanel = new JPanel();
		southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1,1));
		eastPanel = new JPanel();
		westPanel = new JPanel();
		
		westPanel.add(fcOpen);
		southPanel.add(diagnoseButton);
		
		centerPanel.add(l1);
		centerPanel.add(temperatureDropdown);
		centerPanel.add(l2);
		centerPanel.add(achesDropdown);
		centerPanel.add(l3);
		centerPanel.add(coughDropdown);
		centerPanel.add(l4);
		centerPanel.add(soreThroatDropdown);
		centerPanel.add(l5);
		centerPanel.add(dangerZoneDropdown);
		
		add(centerPanel, BorderLayout.CENTER);
		add(northPanel, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		add(eastPanel, BorderLayout.EAST);
		add(westPanel, BorderLayout.WEST);
		setVisible(true);
	}
	
	/**
	 * A method to launch JFileChooser and select the file to be processed.
	 * 
	 * @return filePath
	 */
	public String chooseFile() {
		
		String filePath = "";
		
		//configuring file chooser window
		fc = new JFileChooser();
		FileFilter csvFilter = new FileNameExtensionFilter("CSV Files", "csv");
		fc.setFileFilter(csvFilter);
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
			
			FileProcessing chosenFile = new FileProcessing(chooseFile());
			chosenFile.openFile();
			fileData = new Dataset(chosenFile.readFile());
		}
		else if (e.getSource() == diagnoseButton) {
			
			//diagnosing patient using symptoms
			
			try {
				
				JOptionPane.showMessageDialog(message, fileData.diagnosePatient(	(String)temperatureDropdown.getSelectedItem(),
											(String)achesDropdown.getSelectedItem(),
											(String)coughDropdown.getSelectedItem(),
											(String)soreThroatDropdown.getSelectedItem(),
											(String)dangerZoneDropdown.getSelectedItem()));
			}
			catch (Exception DatasetNotExistent){
				
				JOptionPane.showMessageDialog(message, "You have not yet trained the program using an appropriately formatted CSV file.");
			}
		}
	}
}
