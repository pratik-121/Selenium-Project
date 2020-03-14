package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AssingmentEchotrak {
	WebDriver driver;
  
  @Test
  public void EchoTrak() 
  {
	driver.findElement(By.name("txtCustomerID")).sendKeys("username");
	driver.findElement(By.name("txtPassword")).sendKeys("password");
	driver.findElement(By.name("Butsub")).click();
  }
   
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver.findElement(By.name("txtCustomerID")).clear();
	  driver.findElement(By.name("txtPassword")).clear();
  }

  @AfterMethod
  public void afterMethod() 
  { 
	  String Act = driver.findElement(By.className("error")).getText();
	  System.out.println("The Actual Msg Is :- "+Act);
	  String Exp="The User/Pass Is Invalid";
	  System.out.println("The Expected Msg Should Be :- "+Exp);
	  
	  if(Act.equals(Exp))
	  {
		  System.out.println("Both Strings Are Equal");
	  }
	  else
	  {
		  System.out.println("Both Strings Are Different");
	  }
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver","Z:\\SeleniumSoftwares\\Chrome78\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
	  System.out.println("@BeforeTest");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("");
	  driver.close();
	  System.out.println("@AfterTest");
  }

}
