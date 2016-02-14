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

		availableJob = new AvailableJob("A4", true, 10, false);
		assertTrue(availableJob.isSingleSided());
		assertEquals(10, availableJob.getCents());
		assertEquals("A4", availableJob.getPapertype());
		assertFalse(availableJob.isColour());

		availableJob.setCents(20);
		availableJob.setPapertype("A3");
		availableJob.setSingleSided(false);
		availableJob.setColour(true);

		assertFalse(availableJob.isSingleSided());
		assertEquals(20, availableJob.getCents());
		assertEquals("A3", availableJob.getPapertype());
		assertTrue(availableJob.isColour());
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
