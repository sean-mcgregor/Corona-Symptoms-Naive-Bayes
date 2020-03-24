package coronaVirusSymptomsNaiveBayers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessing {
	
	String fileName;
	File selectedFile;
	Scanner fileScanner;
	
	//instantiating a FileProcessing object
	public FileProcessing(String fileName) {
		
		this.fileName = fileName;
	}
	
	//opening the file
	void openFile() {
		
		selectedFile = new File(fileName);
	}
	
	//reading file contents
	String readFile() {
		
		String token = "";
		
		try {
			
			fileScanner = new Scanner(selectedFile);
			fileScanner.useDelimiter(",");
			
			while (fileScanner.hasNext()){
				
				token = fileScanner.next();
				//token = token.replaceAll(",", "");
				System.out.println(token);
			}
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return "File reading finished";
	}

}
