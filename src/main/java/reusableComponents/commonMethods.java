package reusableComponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class commonMethods {
	public  void selectDropDownOption(WebElement element, String valueToBeSelected) throws Exception {
		Select objselect = new Select(element);
		try {
			objselect.selectByVisibleText(valueToBeSelected);
		} catch (Exception e) {
		  throw new Exception(valueToBeSelected + "is Not present in drop down"+ element );
			
		}
	}
  
}
