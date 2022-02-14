
package org.TestNgRevision.Testngrevision;

import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SkipTestCase {
	
	// we can skip test cases using of exclude method from pom.xml
	// and enabled false 
	// throw new skip exception
	//@ignore annotation
	
	
	
	@Test(enabled = false)
	public void skipTestcase() {
		
		
		System.out.println("this method won't exicuite");
		
	}
	
	
	@Test
	@Ignore
	public void SkipTestCase2() {
		
		
		System.out.println("this is method also will not exicuite");
	}
	
	@Test
	public void testCase() {
		
		
		System.out.println("this is throw new skipexception method");
		throw new SkipException("this will not exxcite");
		}
	

	public void excludemethod() {
		
		System.out.println("this is exclude method ");
		
	}
	
}
