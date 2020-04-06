package coronaVirusSymptomsNaiveBayers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessing {
	
	private String fileName;
	File selectedFile;
	Scanner fileScanner;
	
	//instantiating a FileProcessing object
	public FileProcessing(String fileName) {
		
		this.setFileName(fileName);
	}
	
	
	/**
	 * Instantiates and opens the file.
	 */
	void openFile() {
		
		selectedFile = new File(getFileName());
	}
	
	
	/**
	 * Reads the file contents.
	 * 
	 * @param token The current token
	 * 
	 * @return arrayOfTokens An array containing all tokens in the file
	 * 
	 */
	ArrayList<String> readFile() {
		
		String token = "";
		ArrayList<String> arrayOfTokens= new ArrayList<String>();
		
		try {
			
			fileScanner = new Scanner(selectedFile);
			//fileScanner.useDelimiter(",");
			
			while (fileScanner.hasNext()){
				
				token = fileScanner.next();
				token = token.replaceAll(",", " ");
				
				//filtering out tokens that don't contain valid data
				if (token.contains("hot") || token.contains("normal") || token.contains("cool") || token.contains("cold")) {
					
					arrayOfTokens.add(token);
				}
			}
			
			fileScanner.close();
			Dataset fileData = new Dataset(arrayOfTokens);
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
			arrayOfTokens.add("No tokens added");
		}
		
		return arrayOfTokens;
	}

	/**
	 * @return the fileName
	 */
	private String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	private void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
