/**
 * 
 */
package io.marquinhe.domain;

/**
 * @author marcosalinas
 *
 *         Simple DTO for configuration file.
 *
 */

public class AvailableJob {

	private String papertype;
	private boolean singleSided;
	private int centsBlack;
	private int centsColour;

	public AvailableJob(String papertype, int centsBlack, int centsColour, boolean singleSided) {
		super();
		this.papertype = papertype;
		this.singleSided = singleSided;
		this.centsBlack = centsBlack;
		this.centsColour = centsColour;
	}

	
	public String getPapertype() {
		return papertype;
	}

	public void setPapertype(String papertype) {
		this.papertype = papertype;
	}

	public boolean isSingleSided() {
		return singleSided;
	}

	public void setSingleSided(boolean singleSided) {
		this.singleSided = singleSided;
	}

	public int getCentsBlack() {
		return centsBlack;
	}

	public void setCentsBlack(int centsBlack) {
		this.centsBlack = centsBlack;
	}

	public int getCentsColour() {
		return centsColour;
	}

	public void setCentsColour(int centsColour) {
		this.centsColour = centsColour;
	}
	
	

}
