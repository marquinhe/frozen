/**
 * 
 */
package io.marquinhe.domain;

/**
 * @author marcosalinas
 *
 *         Simple DTO for read jobs.
 *
 */

public class JobRead {

	private String papertype;			//Just in case of extending document type in the future ie A3
	private boolean singleSided;
	private int blackCount;
	private int colourCount;
	
	
	public JobRead(String papertype,int black, int colour,  boolean singleSided) {
		super();
		this.papertype = papertype;
		this.singleSided = singleSided;
		this.blackCount = black;
		this.colourCount = colour;
	}
	
	public JobRead(int black, int colour,  boolean singleSided) {
		super();
		this.singleSided = singleSided;
		this.blackCount = black;
		this.colourCount = colour;
		this.papertype = "A4";
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
	public int getBlack() {
		return blackCount;
	}
	public void setBlack(int black) {
		this.blackCount = black;
	}
	public int getColour() {
		return colourCount;
	}
	public void setColour(int colour) {
		this.colourCount = colour;
	}
	

	
	
}
