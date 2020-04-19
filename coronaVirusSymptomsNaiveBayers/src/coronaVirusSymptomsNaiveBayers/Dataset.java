package coronaVirusSymptomsNaiveBayers;

import java.util.ArrayList;

public class Dataset {
	
	ArrayList<String> arrayOfTokens;
	
	private boolean hasCovid;
	private int peopleWithCovid = 0;
	private int peopleWithoutCovid = 0;
	
	private int temperatureHotAndCovid = 0;
	private int temperatureHotAndNoCovid = 0;
	private int temperatureNormalAndCovid = 0;
	private int temperatureNormalAndNoCovid = 0;
	private int temperatureCoolAndCovid = 0;
	private int temperatureCoolAndNoCovid = 0;
	private int temperatureColdAndCovid = 0;
	private int temperatureColdandNoCovid = 0;
	
	private int achesAndCovid = 0;
	private int achesAndNoCovid = 0;
	private int noAchesAndCovid = 0;
	private int noAchesAndNoCovid = 0;
	
	private int coughAndCovid = 0;
	private int coughAndNoCovid = 0;
	private int noCoughAndCovid = 0;
	private int noCoughAndNoCovid = 0;
	
	private int soreThroatAndCovid = 0;
	private int soreThroatAndNoCovid = 0;
	private int noSoreThroatAndCovid = 0;
	private int noSoreThroatAndNoCovid= 0;
	
	private int wasInDangerZoneAndCovid= 0;
	private int wasInDangerZoneAndNoCovid= 0;
	private int wasNotInDangerZoneAndCovid= 0;
	private int wasNotInDangerZoneAndNoCovid= 0;
	
	
	public Dataset(ArrayList <String> arrayOfTokens) {
		
		this.setArrayOfTokens(arrayOfTokens);
		this.calculateProbabilities(arrayOfTokens);
	}
	
	
	/**
	 * Calculates the probabilities to be used in Naive Bayes from the data set provided.
	 * 
	 * @param arrayOfTokens Each element in the array represents one patient and all of their symptoms.
	 */
	public void calculateProbabilities(ArrayList <String> arrayOfTokens) {
		
		for(int i = 0; i < arrayOfTokens.size(); i++) {
			
			String[] element = arrayOfTokens.get(i).split(" ");
			
			//checking if the patient has Covid
			if(element[5].equals("yes")) {
				
				setHasCovid(true);
				setPeopleWithCovid(getPeopleWithCovid() + 1);
			}
			else {
				
				setHasCovid(false);
				setPeopleWithoutCovid(getPeopleWithoutCovid() + 1);
			}
			
				
			if (hasCovid()) {
				
				if(element[0].equals("hot")) {
					
					setTemperatureHotAndCovid(getTemperatureHotAndCovid() + 1);
				}
				else if(element[0].equals("normal")) {
					
					setTemperatureNormalAndCovid(getTemperatureNormalAndCovid() + 1);
				}
				else if(element[0].equals("cool")) {
					
					setTemperatureCoolAndCovid(getTemperatureCoolAndCovid() + 1);
				}
				else if(element[0].equals("cold")) {
					
					setTemperatureColdAndCovid(getTemperatureColdAndCovid() + 1);
				}
				
				if(element[1].equals("yes")) {
					
					setAchesAndCovid(getAchesAndCovid() + 1);
				}
				else {
					
					setNoAchesAndCovid(getNoAchesAndCovid() + 1);
				}
				
				if(element[2].equals("yes")) {
					
					setCoughAndCovid(getCoughAndCovid() + 1);
				}
				else {
					
					setNoCoughAndCovid(getNoCoughAndCovid() + 1);
				}
				
				if(element[3].equals("yes")) {
					
					setSoreThroatAndCovid(getSoreThroatAndCovid() + 1);
				}
				else {
					
					setNoSoreThroatAndCovid(getNoSoreThroatAndCovid() + 1);
				}
				
				if(element[4].equals("yes")) {
					
					setWasInDangerZoneAndCovid(getWasInDangerZoneAndCovid() + 1);
				}
				else {
					
					setWasNotInDangerZoneAndCovid(getWasNotInDangerZoneAndCovid() + 1);
				}
			}
			else if(hasCovid() == false) {
				
				if(element[0].equals("hot")) {
					
					setTemperatureHotAndNoCovid(getTemperatureHotAndNoCovid() + 1);
				}
				else if(element[0].equals("normal")) {
					
					setTemperatureNormalAndNoCovid(getTemperatureNormalAndNoCovid() + 1);
				}
				else if(element[0].equals("cool")) {
					
					setTemperatureCoolAndNoCovid(getTemperatureCoolAndNoCovid() + 1);
				}
				else if(element[0].equals("cold")) {
					
					setTemperatureColdandNoCovid(getTemperatureColdandNoCovid() + 1);
				}
				
				if(element[1].equals("yes")) {
					
					setAchesAndNoCovid(getAchesAndNoCovid() + 1);
				}
				else {
					
					setNoAchesAndNoCovid(getNoAchesAndNoCovid() + 1);
				}
				
				if(element[2].equals("yes")) {
					
					setCoughAndNoCovid(getCoughAndNoCovid() + 1);
				}
				else {
					
					setNoCoughAndNoCovid(getNoCoughAndNoCovid() + 1);
				}
				
				if(element[3].equals("yes")) {
					
					setSoreThroatAndNoCovid(getSoreThroatAndNoCovid() + 1);
				}
				else {
					
					setNoSoreThroatAndNoCovid(getNoSoreThroatAndNoCovid() + 1);
				}
				
				if(element[4].equals("yes")) {
					
					setWasInDangerZoneAndNoCovid(getWasInDangerZoneAndNoCovid() + 1);
				}
				else {
					
					setWasNotInDangerZoneAndNoCovid(getWasNotInDangerZoneAndNoCovid() + 1);
				}
			}
		}
	}
	
	/**
	 * Diagnoses a patient based on the symptoms read from user input through the GUI.
	 * 
	 * @param temperatureStatus Patient temperature: hot/normal/cool/cold
	 * 
	 * @param achesStatus Patient has aches: yes/no
	 * 
	 * @param coughStatus Patient has cough: yes/no
	 * 
	 * @param soreThroatStatus Patient has sore throat: yes/no
	 * 
	 * @param recentlyInDangerZoneStatus Patient was recently in a danger zone: yes/no
	 * 
	 * @return A string containing the % chance of the patient having Covid-19 reflective of the symptoms input
	 */
	public String diagnosePatient(String temperatureStatus, String achesStatus, String coughStatus, String soreThroatStatus, String recentlyInDangerZoneStatus) {
		
		int temperatureGivenYes = 0;
		int temperatureGivenNo = 0;
		int achesGivenYes = 0;
		int achesGivenNo = 0;
		int coughGivenYes = 0;
		int coughGivenNo = 0;
		int soreThroatGivenYes = 0;
		int soreThroatGivenNo = 0;
		int dangerZoneGivenYes = 0;
		int dangerZoneGivenNo = 0;
		
		float probabilityOfHavingCovid;
		float probabilityOfHavingNoCovid;
		
		if (temperatureStatus.equals("hot")) {
			
			temperatureGivenYes = getTemperatureHotAndCovid();
			temperatureGivenNo = getTemperatureHotAndNoCovid();
		}
		else if (temperatureStatus.equals("normal")) {
			
			temperatureGivenYes = getTemperatureNormalAndCovid();
			temperatureGivenNo = getTemperatureNormalAndNoCovid();
		}
		else if (temperatureStatus.equals("cool")) {
			
			temperatureGivenYes = getTemperatureCoolAndCovid();
			temperatureGivenNo = getTemperatureCoolAndNoCovid();
		}
		else if (temperatureStatus.equals("cold")) {
			
			temperatureGivenYes = getTemperatureColdAndCovid();
			temperatureGivenNo = getTemperatureColdandNoCovid();
		}
		
		if (achesStatus.equals("yes")) {
			
			achesGivenYes = getAchesAndCovid();
			achesGivenNo = getAchesAndNoCovid();
		}
		else if (achesStatus.equals("no")) {
			
			achesGivenYes = getNoAchesAndCovid();
			achesGivenNo = getNoAchesAndNoCovid();
		}
		
		if (coughStatus.equals("yes")) {
			
			coughGivenYes = getCoughAndCovid();
			coughGivenNo = getCoughAndNoCovid();
		}
		else if (coughStatus.equals("no")) {
			
			coughGivenYes = getNoCoughAndCovid();
			coughGivenNo = getNoCoughAndNoCovid();
		}
		
		if (soreThroatStatus.equals("yes")) {
			
			soreThroatGivenYes = getSoreThroatAndCovid();
			soreThroatGivenNo = getSoreThroatAndNoCovid();
		}
		else if (soreThroatStatus.equals("no")) {
			
			soreThroatGivenYes = getNoSoreThroatAndCovid();
			soreThroatGivenNo = getNoSoreThroatAndNoCovid();
		}
		
		if (recentlyInDangerZoneStatus.equals("yes")) {
			
			dangerZoneGivenYes = getWasInDangerZoneAndCovid();
			dangerZoneGivenNo = getWasInDangerZoneAndNoCovid();
		}
		else if (recentlyInDangerZoneStatus.equals("no")) {
			
			dangerZoneGivenYes = getWasNotInDangerZoneAndCovid();
			dangerZoneGivenNo = getWasNotInDangerZoneAndNoCovid();
		}
		
		float temp1 = naiveBayes(temperatureGivenYes, achesGivenYes, coughGivenYes,
								soreThroatGivenYes, dangerZoneGivenYes, getPeopleWithCovid());
		
		float temp2 = naiveBayes(temperatureGivenNo, achesGivenNo, coughGivenNo,
								soreThroatGivenNo, dangerZoneGivenNo, getPeopleWithoutCovid());

		probabilityOfHavingCovid = 	normalisation(temp1, temp2);
		probabilityOfHavingNoCovid = normalisation(temp2, temp1);
		
		probabilityOfHavingCovid = (int)(probabilityOfHavingCovid * 100);
		probabilityOfHavingNoCovid = (int)(probabilityOfHavingNoCovid * 100);
		
		if (probabilityOfHavingCovid > probabilityOfHavingNoCovid) {
			
			return "There is a " + probabilityOfHavingCovid + "% chance of the patient having Covid-19.";
		}
		else {
			
			return "There is only a " + probabilityOfHavingCovid + "% chance of the patient having Covid-19.";
		}
	}
	
	/**
	 * The naive bayes algorithm used to calculate the % chance of the patient having Covid-19
	 * 
	 * @param temperatureCount Headcount of patients with provided temperature status given yes/no
	 * 
	 * @param achesCount Headcount of patients with provided aches status given yes/no
	 * 
	 * @param coughCount Headcount of patients with provided cough status given yes/no
	 * 
	 * @param soreThroatCount Headcount of patients with provided sore throat status given yes/no
	 * 
	 * @param dangerZoneCount Headcount of patients with provided danger zone status given yes/no
	 * 
	 * @param peopleCount Headcount of patients
	 * 
	 * @return The probability of yes/no given the symptoms
	 */
	public float naiveBayes(int temperatureCount, int achesCount, int coughCount, int soreThroatCount, int dangerZoneCount, int peopleCount) {
		
		float probability = 	( (float)temperatureCount / (float)peopleCount ) *
								( (float)achesCount / (float)peopleCount ) *
								( (float)coughCount / (float)peopleCount ) *
								( (float)soreThroatCount / (float)peopleCount ) *
								( (float)dangerZoneCount / (float)peopleCount ) *
								( (float)peopleCount / (float)(getPeopleWithCovid() + getPeopleWithoutCovid() ) );
		
		return probability;
	}
	
	/**
	 * Normalises the percentages of p(yes) and p(no)
	 * 
	 * @param value1 The value to be normalised as a %
	 * 
	 * @param value2 The value used to normalise value1
	 * 
	 * @return The normalised probability
	 */
	public float normalisation(float value1, float value2) {
		
		float probability = value1 / (value1 + value2);
		return probability;
	}
	
	/**
	 * @return the arrayOfTokens
	 */
	public ArrayList<String> getArrayOfTokens() {
		return arrayOfTokens;
	}


	/**
	 * @param arrayOfTokens the arrayOfTokens to set
	 */
	public void setArrayOfTokens(ArrayList<String> arrayOfTokens) {
		this.arrayOfTokens = arrayOfTokens;
	}


	/**
	 * @return the temperatureHotAndCovid
	 */
	public int getTemperatureHotAndCovid() {
		return temperatureHotAndCovid;
	}


	/**
	 * @param temperatureHotAndCovid the temperatureHotAndCovid to set
	 */
	public void setTemperatureHotAndCovid(int temperatureHotAndCovid) {
		this.temperatureHotAndCovid = temperatureHotAndCovid;
	}


	/**
	 * @return the temperatureHotAndNoCovid
	 */
	public int getTemperatureHotAndNoCovid() {
		return temperatureHotAndNoCovid;
	}


	/**
	 * @param temperatureHotAndNoCovid the temperatureHotAndNoCovid to set
	 */
	public void setTemperatureHotAndNoCovid(int temperatureHotAndNoCovid) {
		this.temperatureHotAndNoCovid = temperatureHotAndNoCovid;
	}


	/**
	 * @return the temperatureNormalAndCovid
	 */
	public int getTemperatureNormalAndCovid() {
		return temperatureNormalAndCovid;
	}


	/**
	 * @param temperatureNormalAndCovid the temperatureNormalAndCovid to set
	 */
	public void setTemperatureNormalAndCovid(int temperatureNormalAndCovid) {
		this.temperatureNormalAndCovid = temperatureNormalAndCovid;
	}


	/**
	 * @return the temperatureNormalAndNoCovid
	 */
	public int getTemperatureNormalAndNoCovid() {
		return temperatureNormalAndNoCovid;
	}


	/**
	 * @param temperatureNormalAndNoCovid the temperatureNormalAndNoCovid to set
	 */
	public void setTemperatureNormalAndNoCovid(int temperatureNormalAndNoCovid) {
		this.temperatureNormalAndNoCovid = temperatureNormalAndNoCovid;
	}


	/**
	 * @return the temperatureCoolAndCovid
	 */
	public int getTemperatureCoolAndCovid() {
		return temperatureCoolAndCovid;
	}


	/**
	 * @param temperatureCoolAndCovid the temperatureCoolAndCovid to set
	 */
	public void setTemperatureCoolAndCovid(int temperatureCoolAndCovid) {
		this.temperatureCoolAndCovid = temperatureCoolAndCovid;
	}


	/**
	 * @return the temperatureCoolAndNoCovid
	 */
	public int getTemperatureCoolAndNoCovid() {
		return temperatureCoolAndNoCovid;
	}


	/**
	 * @param temperatureCoolAndNoCovid the temperatureCoolAndNoCovid to set
	 */
	public void setTemperatureCoolAndNoCovid(int temperatureCoolAndNoCovid) {
		this.temperatureCoolAndNoCovid = temperatureCoolAndNoCovid;
	}


	/**
	 * @return the temperatureColdAndCovid
	 */
	public int getTemperatureColdAndCovid() {
		return temperatureColdAndCovid;
	}


	/**
	 * @param temperatureColdAndCovid the temperatureColdAndCovid to set
	 */
	public void setTemperatureColdAndCovid(int temperatureColdAndCovid) {
		this.temperatureColdAndCovid = temperatureColdAndCovid;
	}


	/**
	 * @return the temperatureColdandNoCovid
	 */
	public int getTemperatureColdandNoCovid() {
		return temperatureColdandNoCovid;
	}


	/**
	 * @param temperatureColdandNoCovid the temperatureColdandNoCovid to set
	 */
	public void setTemperatureColdandNoCovid(int temperatureColdandNoCovid) {
		this.temperatureColdandNoCovid = temperatureColdandNoCovid;
	}


	/**
	 * @return the achesAndCovid
	 */
	public int getAchesAndCovid() {
		return achesAndCovid;
	}


	/**
	 * @param achesAndCovid the achesAndCovid to set
	 */
	public void setAchesAndCovid(int achesAndCovid) {
		this.achesAndCovid = achesAndCovid;
	}


	/**
	 * @return the achesAndNoCovid
	 */
	public int getAchesAndNoCovid() {
		return achesAndNoCovid;
	}


	/**
	 * @param achesAndNoCovid the achesAndNoCovid to set
	 */
	public void setAchesAndNoCovid(int achesAndNoCovid) {
		this.achesAndNoCovid = achesAndNoCovid;
	}


	/**
	 * @return the noAchesAndCovid
	 */
	public int getNoAchesAndCovid() {
		return noAchesAndCovid;
	}


	/**
	 * @param noAchesAndCovid the noAchesAndCovid to set
	 */
	public void setNoAchesAndCovid(int noAchesAndCovid) {
		this.noAchesAndCovid = noAchesAndCovid;
	}


	/**
	 * @return the noAchesAndNoCovid
	 */
	public int getNoAchesAndNoCovid() {
		return noAchesAndNoCovid;
	}


	/**
	 * @param noAchesAndNoCovid the noAchesAndNoCovid to set
	 */
	public void setNoAchesAndNoCovid(int noAchesAndNoCovid) {
		this.noAchesAndNoCovid = noAchesAndNoCovid;
	}


	/**
	 * @return the coughAndCovid
	 */
	public int getCoughAndCovid() {
		return coughAndCovid;
	}


	/**
	 * @param coughAndCovid the coughAndCovid to set
	 */
	public void setCoughAndCovid(int coughAndCovid) {
		this.coughAndCovid = coughAndCovid;
	}


	/**
	 * @return the coughAndNoCovid
	 */
	public int getCoughAndNoCovid() {
		return coughAndNoCovid;
	}


	/**
	 * @param coughAndNoCovid the coughAndNoCovid to set
	 */
	public void setCoughAndNoCovid(int coughAndNoCovid) {
		this.coughAndNoCovid = coughAndNoCovid;
	}


	/**
	 * @return the noCoughAndCovid
	 */
	public int getNoCoughAndCovid() {
		return noCoughAndCovid;
	}


	/**
	 * @param noCoughAndCovid the noCoughAndCovid to set
	 */
	public void setNoCoughAndCovid(int noCoughAndCovid) {
		this.noCoughAndCovid = noCoughAndCovid;
	}


	/**
	 * @return the noCoughAndNoCovid
	 */
	public int getNoCoughAndNoCovid() {
		return noCoughAndNoCovid;
	}


	/**
	 * @param noCoughAndNoCovid the noCoughAndNoCovid to set
	 */
	public void setNoCoughAndNoCovid(int noCoughAndNoCovid) {
		this.noCoughAndNoCovid = noCoughAndNoCovid;
	}


	/**
	 * @return the soreThroatAndCovid
	 */
	public int getSoreThroatAndCovid() {
		return soreThroatAndCovid;
	}


	/**
	 * @param soreThroatAndCovid the soreThroatAndCovid to set
	 */
	public void setSoreThroatAndCovid(int soreThroatAndCovid) {
		this.soreThroatAndCovid = soreThroatAndCovid;
	}


	/**
	 * @return the soreThroatAndNoCovid
	 */
	public int getSoreThroatAndNoCovid() {
		return soreThroatAndNoCovid;
	}


	/**
	 * @param soreThroatAndNoCovid the soreThroatAndNoCovid to set
	 */
	public void setSoreThroatAndNoCovid(int soreThroatAndNoCovid) {
		this.soreThroatAndNoCovid = soreThroatAndNoCovid;
	}


	/**
	 * @return the noSoreThroatAndCovid
	 */
	public int getNoSoreThroatAndCovid() {
		return noSoreThroatAndCovid;
	}


	/**
	 * @param noSoreThroatAndCovid the noSoreThroatAndCovid to set
	 */
	public void setNoSoreThroatAndCovid(int noSoreThroatAndCovid) {
		this.noSoreThroatAndCovid = noSoreThroatAndCovid;
	}


	/**
	 * @return the noSoreThroatAndNoCovid
	 */
	public int getNoSoreThroatAndNoCovid() {
		return noSoreThroatAndNoCovid;
	}


	/**
	 * @param noSoreThroatAndNoCovid the noSoreThroatAndNoCovid to set
	 */
	public void setNoSoreThroatAndNoCovid(int noSoreThroatAndNoCovid) {
		this.noSoreThroatAndNoCovid = noSoreThroatAndNoCovid;
	}


	/**
	 * @return the wasInDangerZoneAndCovid
	 */
	public int getWasInDangerZoneAndCovid() {
		return wasInDangerZoneAndCovid;
	}


	/**
	 * @param wasInDangerZoneAndCovid the wasInDangerZoneAndCovid to set
	 */
	public void setWasInDangerZoneAndCovid(int wasInDangerZoneAndCovid) {
		this.wasInDangerZoneAndCovid = wasInDangerZoneAndCovid;
	}


	/**
	 * @return the wasInDangerZoneAndNoCovid
	 */
	public int getWasInDangerZoneAndNoCovid() {
		return wasInDangerZoneAndNoCovid;
	}


	/**
	 * @param wasInDangerZoneAndNoCovid the wasInDangerZoneAndNoCovid to set
	 */
	public void setWasInDangerZoneAndNoCovid(int wasInDangerZoneAndNoCovid) {
		this.wasInDangerZoneAndNoCovid = wasInDangerZoneAndNoCovid;
	}


	/**
	 * @return the wasNotInDangerZoneAndCovid
	 */
	public int getWasNotInDangerZoneAndCovid() {
		return wasNotInDangerZoneAndCovid;
	}


	/**
	 * @param wasNotInDangerZoneAndCovid the wasNotInDangerZoneAndCovid to set
	 */
	public void setWasNotInDangerZoneAndCovid(int wasNotInDangerZoneAndCovid) {
		this.wasNotInDangerZoneAndCovid = wasNotInDangerZoneAndCovid;
	}


	/**
	 * @return the wasNotInDangerZoneAndNoCovid
	 */
	public int getWasNotInDangerZoneAndNoCovid() {
		return wasNotInDangerZoneAndNoCovid;
	}


	/**
	 * @param wasNotInDangerZoneAndNoCovid the wasNotInDangerZoneAndNoCovid to set
	 */
	public void setWasNotInDangerZoneAndNoCovid(int wasNotInDangerZoneAndNoCovid) {
		this.wasNotInDangerZoneAndNoCovid = wasNotInDangerZoneAndNoCovid;
	}

	/**
	 * @return the hasCovid
	 */
	public boolean hasCovid() {
		return hasCovid;
	}

	/**
	 * @param hasCovid the hasCovid to set
	 */
	public void setHasCovid(boolean hasCovid) {
		this.hasCovid = hasCovid;
	}

	/**
	 * @return the peopleWithCovid
	 */
	public int getPeopleWithCovid() {
		return peopleWithCovid;
	}

	/**
	 * @param peopleWithCovid the peopleWithCovid to set
	 */
	public void setPeopleWithCovid(int peopleWithCovid) {
		this.peopleWithCovid = peopleWithCovid;
	}

	/**
	 * @return the peopleWithoutCovid
	 */
	public int getPeopleWithoutCovid() {
		return peopleWithoutCovid;
	}

	/**
	 * @param peopleWithoutCovid the peopleWithoutCovid to set
	 */
	public void setPeopleWithoutCovid(int peopleWithoutCovid) {
		this.peopleWithoutCovid = peopleWithoutCovid;
	}
}
