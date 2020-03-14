package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MultiTest {
	WebDriver driver;
	
  @Test
  public void Google() 
  {
	driver.get("https://www.google.com/"); 
	System.out.println("Google Launched");
	System.out.println("@Test Google");
	System.out.println("");
  }
  
  @Test
  public void YouTube() 
  {
	driver.get("https://www.youtube.com/"); 
	System.out.println("YouTube Launched");
	System.out.println("@Test YouTube");
  }
  
  @Test
  public void Wikipedia() 
  {
	driver.get("https://www.wikipedia.org/"); 
	System.out.println("Wikipedia Launched");
	System.out.println("@Test Wikipedia");
	System.out.println("");
  }
  
  @BeforeTest
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver","Z:\\SeleniumSoftwares\\Chrome78\\chromedriver.exe");
	  driver = new ChromeDriver();
	  System.out.println("@BeforeTest");
	  System.out.println("-----------------------------------------------");
  }

  @AfterTest
  public void afterClass() 
  {
	  driver.close();
	  System.out.println("-----------------------------------------------");
	  System.out.println("@AfterTest");
	  System.out.println("");
  }

}
