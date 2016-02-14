/**
 * 
 */
package io.marquinhe.util;

import io.marquinhe.domain.AvailableJob;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * @author marcosalinas
 *
 *
 *         File setup available classes of print costs.
 *
 */

public class ReadConfigurationFile {

	@SuppressWarnings("unchecked")
	public HashMap<String, AvailableJob> setup() {

		JSONParser parser = new JSONParser();
		HashMap<String, AvailableJob> dictionary = new HashMap<String, AvailableJob>(); 

		try {

			Object obj = parser.parse(new FileReader("config.json"));

			JSONObject jsonObject = (JSONObject) obj;
			JSONArray availableJobs = (JSONArray) jsonObject
					.get("availableJobs");

			Iterator<JSONObject> iterator = availableJobs.iterator();
			while (iterator.hasNext()) {
				try {
					JSONObject entry = (JSONObject) iterator.next();
					String type = (String) entry.get("type");
					int cents = Integer.parseInt((String) entry.get("cents"));
					boolean colour = (Boolean) entry.get("colour");
					boolean singleSided = (Boolean) entry.get("singleSided");

					// generate entry for every type of job
					
					//System.out.println("");
					AvailableJob availableJob = new AvailableJob(type, singleSided, cents, colour);
					dictionary.put(type+"-"+singleSided+"-"+colour, availableJob);
					

				} catch (Exception e) {
					// ToDo badFormat Exception
					System.out
							.println("BadFormatException: Check configuration file:"
									+ e);
					return null; 
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return dictionary;
	}

}
