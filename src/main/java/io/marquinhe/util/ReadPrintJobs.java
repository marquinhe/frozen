package io.marquinhe.util;

import io.marquinhe.domain.JobRead;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class ReadPrintJobs {

	public HashSet<JobRead> readJobSet() {

		HashSet<JobRead> jobSet = new HashSet<JobRead>();

		String fileName = "printjob.csv";
		try (Scanner scanner = new Scanner(new File(fileName))) {

			while (scanner.hasNext()) {
				String line = scanner.nextLine();

				String[] tempStr = line.split("\\s*,\\s*");

				if (tempStr.length == 3) {
					int black = Integer.parseInt(tempStr[0].trim());
					int colour = Integer.parseInt(tempStr[1].trim());
					boolean singleSided = !Boolean.parseBoolean(tempStr[2]
							.trim()); // ! as document shows doubleSided not
										// singleSided

					JobRead job = new JobRead(black, colour, singleSided);

					//System.out.println(black + "-" + colour + "- "+ singleSided);

					jobSet.add(job);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return jobSet;

	}

}
