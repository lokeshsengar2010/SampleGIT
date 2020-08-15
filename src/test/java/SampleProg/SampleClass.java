package SampleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleClass {
	
	@Test
	public void sampletest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver  =new ChromeDriver();
		System.out.println("Welcome");
		//Launch Browser and maximize it
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/");
		Thread.sleep(15000);
		System.out.println("Welcome2");
		//driver.quit();

	}

}
