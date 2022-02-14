package org.TestNgRevision.Testngrevision;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

public class RetryAnalyzertestCase {
	
	
	@Test(retryAnalyzer = RetryanalyzerExample.class)
	public void testCase() {
		
		assertTrue(false);
		
	}

}
