package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Seleniumpagetest {
WebDriver driver;
@Test
public void method() {
	String Title= driver.getTitle();
	if(Title.equals("Selenium"))
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	{
		//System.out.println("print Title");
		System.out.println("Title is matched and Tc Passes");
		 System.out.println("Page title is : " + driver.getTitle());
		
	}
	else
	{
		System.out.println("Tc is Failed");
	}
	
}
 @BeforeClass
 public void launchurl() {
 driver =new ChromeDriver();
 driver.get("https://www.selenium.dev/");
 }
 @AfterClass
 public void afterclass() {
	 driver.close();
 }
 
}
