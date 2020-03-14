package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GroupTest {
	WebDriver driver;
 
  @Test(groups="Sanity Test")
  public void EchoTrack() 
  {
	  driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
	  System.out.println("@TestExecuted");
  }
 
  @BeforeTest(alwaysRun=true)
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver","Z:\\SeleniumSoftwares\\Chrome78\\chromedriver.exe");
	  driver = new ChromeDriver();
	  System.out.println("@BeforeTestExecuted");
  }

  @AfterTest(alwaysRun=true)
  public void afterClass() 
  {
	  driver.close();
	  System.out.println("@AfterTestExecuted");
  }

}
