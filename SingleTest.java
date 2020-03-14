package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SingleTest {
	WebDriver driver;
  @BeforeTest
  public void launch()
  {
	  System.setProperty("webdriver.chrome.driver","Z:\\SeleniumSoftwares\\Chrome78\\chromedriver.exe");
	  driver = new ChromeDriver();
	  System.out.println("@Before Test Executed");
  }
	
  @Test
  public void google() 
  {
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  System.out.println("@Test Executed");
  }
  
  @AfterTest
  public void close()
  {
	  driver.close();
	  System.out.println("@After Test Executed");
  }
  
}
