package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class Login_ParameterizationThrough_XML 
{
	WebDriver driver;
	String Act,Exp="Invalid Username/Password";
	
  @Parameters({"user","pwd"})	
  @Test
  public void LoginEchoTraks(String user,String pwd) 
  {
	  driver.findElement(By.id("txtCustomerID")).sendKeys(user);
	  driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	  driver.findElement(By.id("Butsub")).click();
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver.findElement(By.id("txtCustomerID")).clear();
	  driver.findElement(By.id("txtPassword")).clear();
  }
  @AfterMethod
  public void afterMethod() 
  {
	  Act=driver.findElement(By.id("lblMsg")).getText();
	  Assert.assertEquals(Act,Exp);
  }
  @Parameters({"URL"})
  @BeforeTest
  public void beforeTest(String URL) 
  {
	System.setProperty("webdriver.chrome.driver","Z:\\SeleniumSoftwares\\Chrome78\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(URL);
  }
  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
