package reusableComponents;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

import testBase.TestBase;

public class PropertiesOperations extends TestBase {
	static Properties prop = new Properties();
	//C:\SeleniumProject\Java\Tricentis.inaurance_calculator\src\test\resources\config.properties
	
    
    public static String getPropertyKey(String key) throws Exception 
    {
    	String propPath = "C:\\SeleniumProject\\Java\\Tricentis.inaurance_calculator\\src\\test\\resources\\config.properties";
        FileInputStream objprop = new FileInputStream(propPath);
        prop.load(objprop);
        String keyValue=prop.get(key).toString();
        if(StringUtils.isEmpty(keyValue))
        {
        	throw new Exception("Value is not specfied for the key in proprty file");
        }
        return keyValue;
        
    }
    
    
}
