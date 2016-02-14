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
	private int cents;
	private boolean colour;

	public AvailableJob(String papertype, boolean singleSided, int cost, boolean colour) {
		super();
		this.papertype = papertype;
		this.singleSided = singleSided;
		this.cents = cost;
		this.colour = colour;
	}

	
	public AvailableJob(boolean singleSided, int cost, boolean colour) {
		super();
		this.singleSided = singleSided;
		this.cents = cost;
		this.colour = colour;
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

	public int getCents() {
		return cents;
	}

	public void setCents(int cost) {
		this.cents = cost;
	}

	public boolean isColour() {
		return colour;
	}

	public void setColour(boolean colour) {
		this.colour = colour;
	}
	
	

}
