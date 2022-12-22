package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class amazomhomepage {

	
	WebDriver driver;
	SoftAssert softAssert;
	 @Test(priority=1)
	 public void checktitle()
	 {
		 String actualTitle = driver.getTitle();
		 
		 String ExecpetedTitle="Amazon.com. Spend less. Smile more.";
		 
		   softAssert.assertEquals(actualTitle,ExecpetedTitle);
		   System.out.println("Page title is : " + driver.getTitle());
		  // softAssert.assertNotEquals(ExecpetedTitle, ExecpetedTitle);
	 }
	 @Test(priority=2)
	  public void Search()
	  {
	  boolean flag =  driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
	  softAssert.assertFalse(flag);
	
	  }
	 @Test(priority=3)
	 public void Logo() {
		boolean logo=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		softAssert.assertTrue(logo);
		  softAssert.assertAll();
		
	 }
	 
		   @BeforeClass
		   public void launchUrl() {
		    driver = new ChromeDriver();
		    softAssert = new SoftAssert();
		    driver.manage().window().maximize();
		    driver.get("https://www.amazon.com");
		    
		    
		   }
		   @AfterClass
		   public void Close() {
			   driver.close();
		   }
		 
		 
		 
	 }

