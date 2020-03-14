package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GoogleLinks {
  WebDriver driver;
  
  @Test(groups="Top",priority=0)
  public void Top() 
  {   System.out.println("Links From Top OF Google");
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
	  System.out.println("The Title OF The Link :- "+driver.getTitle());
	  driver.navigate().back();
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
	  System.out.println("The Title OF The Link :- "+driver.getTitle());
	  driver.navigate().back();
  }
  
  @Test(groups="Bottom",priority=1)
  public void Bottom()
  {
	  System.out.println("Links From Bottom OF Google");
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]/a[1]")).click();
	  System.out.println("The Title OF The Link :- "+driver.getTitle());
	  driver.navigate().back();
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]/a[2]")).click();
	  System.out.println("The Title OF The Link :- "+driver.getTitle());
	  driver.navigate().back();
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]/a[3]")).click();
	  System.out.println("The Title OF The Link :- "+driver.getTitle());
	  driver.navigate().back();
  }
  
  @BeforeTest(alwaysRun=true)
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver","Z:\\SeleniumSoftwares\\Chrome78\\chromedriver.exe");
	  driver = new ChromeDriver();
	  System.out.println("@BeforeTestExecuted");
	  System.out.println("");
	  driver.get("https://www.google.com/");
  }

  @AfterTest(alwaysRun=true)
  public void afterTest() 
  {
	  System.out.println("");
	  driver.close();
	  System.out.println("@AfterTestExecuted");
  }

}
