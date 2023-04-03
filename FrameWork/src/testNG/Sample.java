package testNG;

import org.testng.annotations.Test;

public class Sample {
	
	@Test(priority=0)
	public void firstTestCase() {
		System.out.println("This is the first testcase");
	}

	@Test(priority=1)
	public void secondTestCase() {
		System.out.println("This is the second test case");
	}
		
	
		
	@Test(priority=2)
	public void thirdTestCase() {
		System.out.println("this is the third test case");
		
	}
	
	@Test(priority=3, enabled=false)
	public void fourthTestCase() {
		System.out.println("This is the fourth test case");
	}
	
	@Test(priority=4)
	public void fifthTestCase() {
		System.out.println("this is the fifth tese case");
	}
	
	
	
	
	
	
	
	
	
	
	
}