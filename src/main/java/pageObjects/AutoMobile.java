package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class AutoMobile extends TestBase {
 @FindBy(xpath="//select[@id='make']")
 WebElement dd_make;
 
 @FindBy(id="engineperformance")
 WebElement txt_enginePerfomance;
 
 @FindBy(xpath="//input[@id='dateofmanufacture']")
 WebElement cal_dateOfManufacture ;
 
 @FindBy(xpath="//select[@id='numberofseats']")
 WebElement dd_noOfSeats;
 
 
 @FindBy(xpath= "//select[@id='fuel']")
 WebElement dd_fuelType;
 
 @FindBy(xpath="//input[@id='listprice']")
 WebElement txt_listPrice;
 
 @FindBy(xpath="//input[@id='licenseplatenumber']" )
 WebElement txt_licensePlateNumber;
 
 public void enterAutomobileDataPageObjects() {
	 PageFactory.initElements(driver, this);
 }
 public void clickOnMake() throws Exception {
	 cM.selectDropDownOption(dd_make, "Audi");
	 }
 }
