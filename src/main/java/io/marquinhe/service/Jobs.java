package io.marquinhe.service;

import java.util.HashMap;

import io.marquinhe.domain.AvailableJob;

public abstract class Jobs {

	protected HashMap<String, AvailableJob> availableJobs;

	public Jobs(HashMap<String, AvailableJob> availableJobs) {
		super();
		this.availableJobs = availableJobs;
	}
	
	
}
