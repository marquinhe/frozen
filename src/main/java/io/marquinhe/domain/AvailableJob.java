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

	public AvailableJob(String papertype, boolean singleSided, int cost) {
		super();
		this.papertype = papertype;
		this.singleSided = singleSided;
		this.cents = cost;
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

}
