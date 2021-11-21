package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePageObjects extends TestBase {

	@FindBy(xpath="//div[@class='main-navigation']//a[@id='nav_automobile']")
	WebElement link_Automobile;
	
	@FindBy(xpath="//div[@class='main-navigation']//a[@id='nav_truck']")
	WebElement link_Truck;
	
	@FindBy(xpath="//div[@class='main-navigation']//a[@id='nav_motorcycle']")
	WebElement link_MotorCycle;
	
	@FindBy(xpath="//div[@class='main-navigation']//a[@id='nav_camper']")
	WebElement link_Camper;
	
	//creating a constructor for initiElemntMethod 
	public  HomePageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAutomobileLink()
	{
		link_Automobile.click();
	}
	
	public void clickOnTruckLink()
	{
		link_Truck.click();
	}
	
	public void clickOnMotorCycleLink()
	{
		link_MotorCycle.click();
	}
	public void clickOnCamperLink()
	{
		link_Camper.click();
	}
}
