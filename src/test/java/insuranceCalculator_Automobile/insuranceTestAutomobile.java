package insuranceCalculator_Automobile;

import org.testng.annotations.Test;

import testBase.TestBase;

public class insuranceTestAutomobile extends TestBase {
	@Test
	public void testAutoMobileAudiInsurance() throws Exception
	{
		HomePage.clickOnAutomobileLink();
		autoMobile.clickOnMake();
	}
}
