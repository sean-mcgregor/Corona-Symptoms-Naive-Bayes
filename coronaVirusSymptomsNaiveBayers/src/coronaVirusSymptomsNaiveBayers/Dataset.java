package coronaVirusSymptomsNaiveBayers;

import java.util.ArrayList;

public class Dataset {
	
	ArrayList<String> arrayOfTokens;
	
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
	
	
	public Dataset(ArrayList<String> arrayOfTokens) {
		
		this.setArrayOfTokens(arrayOfTokens);
		
		for(String element: arrayOfTokens)
			System.out.println(element);
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
}
