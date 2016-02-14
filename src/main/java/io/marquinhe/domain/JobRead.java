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

	private String papertype;
	private boolean singleSided;
	private int quantity;
	private boolean colour;

	public JobRead(String papertype, boolean singleSided, int quantity, boolean colour) {
		super();
		this.papertype = papertype;
		this.singleSided = singleSided;
		this.quantity = quantity;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isColour() {
		return colour;
	}

	public void setColour(boolean colour) {
		this.colour = colour;
	}

	
	
}
