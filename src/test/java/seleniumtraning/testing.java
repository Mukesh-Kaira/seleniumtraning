package seleniumtraning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testing {
	@Test
	public static void main()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mukesh.kaira\\workspace\\seleniumtraning\\src\\executable\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		
		abc
	}
	
	

}
