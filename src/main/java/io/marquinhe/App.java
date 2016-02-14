package io.marquinhe;

import java.util.HashMap;
import java.util.HashSet;

import io.marquinhe.domain.AvailableJob;
import io.marquinhe.domain.JobRead;
import io.marquinhe.service.CalculateCost;
import io.marquinhe.service.impl.CalculateCostImpl;
import io.marquinhe.util.ReadConfigurationFile;
import io.marquinhe.util.ReadPrintJobs;

/**
 * @author marcosalinas
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Setup fees
        ReadConfigurationFile conf = new ReadConfigurationFile(); 
        HashMap<String, AvailableJob> dictionary = conf.setup(); 
        
        // Read printing jobs
        ReadPrintJobs jobs = new ReadPrintJobs(); 
        HashSet<JobRead> jobSet = jobs.readJobSet();
        
        CalculateCost costCalculus = new CalculateCostImpl(dictionary);
        
        for (JobRead job:jobSet){
        	
        	System.out.println("This cost in cents:" + costCalculus.getJobCost(job));
        }
        
    }
}
