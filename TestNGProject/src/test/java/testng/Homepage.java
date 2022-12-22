package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Homepage {
  @BeforeSuite //1 
  public void setup() {
	  System.out.println("Set up system property for chrome");
	  
  }
  @BeforeTest //2
  public void launchbrowser(){
	  
	  System.out.println("launchbrowser");
  }
  @BeforeClass//3
  public void login() {
	  System.out.println("login the app");
  }
  @BeforeMethod //4
  public void enterurl() {
	  System.out.println("Enter url");
 

}
  
  //Sequence is run BeforeMethod and Test And After method
  
  @Test //5
  public void googletitletext()
  {
	  System.out.println("Google Title Test");
  }  
	  @Test
	  public void searchText() 
	  {
		  System.out.println("Search text box");
	  }
  @ Test
  public void Googlelogotext()
  {
	  System.out.println("Google logo text");
  }
  
  @AfterMethod//6
  public void LogOut() {
	  System.out.println("Logout the app");
  
  }
 

@AfterClass //7
public void deleteallcookies () {
	  System.out.println("deleteAllcookies");
}
@AfterTest//8
public void closebrowser() {
	 System.out.println("close the browser");
}
@AfterSuite//9
public void Generatetestreport() {
	System.out.println("Generate Report");
}
}
