package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demotest {

	WebDriver driver;
	
	@Test(priority=2)
	public void login() {
		
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.id("userName")).sendKeys("Navvi");
		driver.findElement(By.id("password")).sendKeys("NavyaSelenium@1");
		driver.findElement(By.id("login")).click();
		System.out.println("login case passed");
	}
		
		 @Test(priority=1)
		 void myMethod() {
		   String title = driver.getTitle();
		  if(title.equals("ToolsQA"))
		  {
		   System.out.println("Title is matched and TC passes");
		   System.out.println("Page title is : " + driver.getTitle());
		  }
		  else
		  {
		   System.out.println("Test case failed");
		  }
		 }
		  @Test
		 (priority=3,dependsOnMethods= {"login"})
		 
			  void logout() {
				  driver.findElement(By.id("submit")).click();
			  }
		    
			  	 
	@BeforeClass
	 public void launchUrl() {
		 
		   driver = new ChromeDriver();
		  driver.get("https://demoqa.com/books");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.id("login")).click();
	}  
		  @AfterClass
		  public void End() {
			  driver.close();
		  }
		  
	 
	 }
