package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Gmail {

	WebDriver driver;
	
@Test
public void login() {
	driver.findElement(By.id("identifierId")).sendKeys("Navya6409@gmail.com");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")).click();
	
	//driver.manage().timeouts().implicitlyWait(10));
	driver.findElement(By.cssSelector(".whsOnd zHQkBf")).sendKeys("NavviSlr@us15");
	
	driver.findElement(By.cssSelector(".Next")).click();
}
@BeforeClass
 void launchurl() {
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	
	driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1492510927%3A1671228300828100&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh64TBHlJgzQ4MHl0OnJLO6S3cDGnIvmp05jba5Xy7btp0mhLabzq_AOWJ3GvneUgShq9T_rjQ#inbox");
}

}
