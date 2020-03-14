package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AssignmentLinks {
	WebDriver driver;
  
  @Test(groups="Top")
  public void Top1() 
  {
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
	  System.out.println("The Title OF The Link :- "+driver.getTitle());
  }
  
  @Test(groups="Top")
  public void Top2()
  {
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
	  System.out.println("The Title OF The Link :- "+driver.getTitle());
  }
  
  @Test(groups="Bottom")
  public void Bottom1()
  {
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]/a[1]")).click();
	  System.out.println("The Title OF The Link :- "+driver.getTitle());
  }
  
  @Test(groups="Bottom")
  public void Bottom2()
  {
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]/a[2]")).click();
	  System.out.println("The Title OF The Link :- "+driver.getTitle());
  }
  
  @Test(groups="Bottom")
  public void Bottom3()
  {
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]/a[3]")).click();
	  System.out.println("The Title OF The Link :- "+driver.getTitle());  
  }
  
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() 
  {
	  System.out.println("Google Links");
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() 
  {
    driver.navigate().back();
  }

  @BeforeTest(alwaysRun=true)
  public void beforeTest() 
  { 
	System.setProperty("webdriver.chrome.driver","Z:\\SeleniumSoftwares\\Chrome78\\chromedriver.exe");
	driver = new ChromeDriver();
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
