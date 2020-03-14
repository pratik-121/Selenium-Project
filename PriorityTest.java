package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PriorityTest {
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
	  System.out.println("");
  }
  
  @Test(priority=3)
  public void Amazon()
  {
	  driver.get("https://www.amazon.com/");
	  System.out.println("Amazon Launched");
	  System.out.println("@Test Amazon");
  }
  
  
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver","Z:\\SeleniumSoftwares\\Chrome78\\chromedriver.exe");
	  driver = new ChromeDriver();
	  System.out.println("@BeforeTest");
	  System.out.println("-----------------------------------------------");
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
	  System.out.println("-----------------------------------------------");
	  System.out.println("@AfterTest");
	  System.out.println("");
  }

}
