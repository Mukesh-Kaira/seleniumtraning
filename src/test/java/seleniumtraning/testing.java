package seleniumtraning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testing {
	
	Properties prop;
	WebDriver driver;
	FileInputStream fileinput;
	@BeforeSuite
	public void setup() throws IOException
	{
		File file=new File("C:\\Users\\mukesh.kaira\\workspace\\seleniumtraning\\src\\config\\env.properties");
		fileinput= new FileInputStream(file);
		 prop=new Properties();
		prop.load(fileinput);
				
	}
	@BeforeTest
	public void browser()
	{
		String br=prop.getProperty("Browser");
		if(br=="firefox")
		{
		;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mukesh.kaira\\workspace\\seleniumtraning\\src\\executable\\geckodriver.exe");
		
		driver= new FirefoxDriver();
		}
		else if (br=="chrome")
		{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mukesh.kaira\\workspace\\seleniumtraning\\src\\executable\\chromedriver.exe");
		
		driver= new ChromeDriver();
		}
		
		
		
	}
	
	

}
