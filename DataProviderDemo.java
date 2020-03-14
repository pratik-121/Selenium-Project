package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DataProviderDemo {
	WebDriver driver;

	@Test(dataProvider = "dp")
	public void SendParameter(String unm, String pwd) {
		driver.findElement(By.id("txtCustomerID")).sendKeys(unm);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("Butsub")).click();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.id("txtCustomerID")).clear();
		driver.findElement(By.id("txtPassword")).clear();
	}

	@AfterMethod
	public void afterMethod() {

	}

	@DataProvider
	public Object[][] dp() {
		String[][] data = new String[3][2];
		data[0][0] = "Pratik";
		data[0][1] = "Pass1";
		data[1][0] = "Omkar";
		data[1][1] = "Pass1";
		data[2][0] = "Akhil";
		data[2][0] = "Pass3";                                                 
		return data;

	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "Z:\\SeleniumSoftwares\\Chrome78\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
