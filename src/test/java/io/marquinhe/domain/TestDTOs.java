/**
 * 
 */
package io.marquinhe.domain;

import junit.framework.TestCase;

import io.marquinhe.domain.AvailableJob;
import io.marquinhe.domain.JobRead;

/**
 * @author marcosalinas
 *
 */

public class TestDTOs extends TestCase {

	private AvailableJob availableJob;
	private JobRead jobRead;

	public void testAvailableJobDTO() {

		availableJob = new AvailableJob("A4", 10, 20, true);
		assertTrue(availableJob.isSingleSided());
		assertEquals(10, availableJob.getCentsBlack());
		assertEquals(20, availableJob.getCentsColour());

		availableJob.setCentsBlack(20);
		availableJob.setPapertype("A3");
		availableJob.setSingleSided(false);
		availableJob.setCentsColour(25);

		assertFalse(availableJob.isSingleSided());
		assertEquals(20, availableJob.getCentsBlack());
		assertEquals("A3", availableJob.getPapertype());
		assertEquals(25, availableJob.getCentsColour());
	}
	
	
	public void testReadJobDTO() {

		jobRead = new JobRead(10, 20, true);
		assertTrue(jobRead.isSingleSided());
		assertEquals(10, jobRead.getBlack());
		assertEquals(20, jobRead.getColour());

		jobRead.setBlack(20);
		jobRead.setColour(10);
		jobRead.setSingleSided(false);

		assertFalse(jobRead.isSingleSided());
		assertEquals(20, jobRead.getBlack());
		assertEquals(10, jobRead.getColour());
	}

}
