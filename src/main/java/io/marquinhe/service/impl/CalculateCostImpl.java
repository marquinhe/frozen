/**
 * 
 */
package io.marquinhe.service.impl;

import java.util.HashMap;

import io.marquinhe.domain.AvailableJob;
import io.marquinhe.domain.JobRead;
import io.marquinhe.service.CalculateCost;
import io.marquinhe.service.Jobs;

/**
 * @author marcosalinas
 *
 */
public class CalculateCostImpl extends Jobs implements CalculateCost {

	public CalculateCostImpl(HashMap<String, AvailableJob> availableJobs) {
		super(availableJobs);
	}

	@Override
	public int getJobCost(JobRead job) {

		String type = job.getPapertype();
		int blackCount = job.getBlack();
		int colourCount = job.getColour();
		boolean isSingleSided = job.isSingleSided();

		String key = type + "-s-" + isSingleSided;

		int centsBlack = availableJobs.get(key).getCentsBlack();
		int centsColour = availableJobs.get(key).getCentsColour();

		System.out.println(type+"-"+blackCount+"-"+ colourCount+"-"+ centsBlack+"-"+ centsColour+"-"+ isSingleSided);
		return calculate(type, blackCount, colourCount, centsBlack, centsColour, isSingleSided);

	}

	private int calculate(String type, int blackCount, int colourCount, int centsBlack,
			int centsColour, boolean isSingleSided) {
		
		int jobCost = 0; 
		
			if (isSingleSided) {
				jobCost += blackCount * centsBlack;
				jobCost += colourCount * centsColour;
				return jobCost;

			} else {

				// Case we are costing double but there one last single
				if (blackCount % 2 == 0){
					jobCost += blackCount * centsBlack;
				}else{
					
					String key = type + "-s-" + true;
					int singleSidedBlackCost = availableJobs.get(key).getCentsBlack();
					jobCost += (blackCount-1) * centsBlack;
					jobCost += 1 * singleSidedBlackCost;
				}
				
				// same with colour 
				if (colourCount % 2 == 0){
					jobCost += colourCount * centsColour;
				}else{
					
					String key = type + "-s-" + true;
					int singleSidedColourCost = availableJobs.get(key).getCentsColour();
					jobCost += (colourCount-1) * centsColour;
					jobCost += 1 * singleSidedColourCost;
				}
				
			}
		
		return jobCost;
	}


	
	public String printDetail(JobRead job){
		
		//TODO 
		
		return "Print job: " + job.getBlack() + "blacks"; 
	}
	

}
