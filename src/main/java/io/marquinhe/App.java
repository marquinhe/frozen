package io.marquinhe;

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
        conf.setup(); 
        
        // Read jobs
        ReadPrintJobs jobs = new ReadPrintJobs(); 
        jobs.readJobSet();
        
    }
}
