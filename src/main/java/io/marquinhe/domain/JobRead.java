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

	public JobRead(String papertype, boolean singleSided, int quantity) {
		super();
		this.papertype = papertype;
		this.singleSided = singleSided;
		this.quantity = quantity;
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

	
}
