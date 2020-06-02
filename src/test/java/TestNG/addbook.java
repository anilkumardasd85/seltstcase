package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addbook {
	  WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		  driver = new ChromeDriver();
		  driver.get("http://3.128.28.35:8843/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
  @Test
  public void verifyaddbook() {
	  driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).click();
	  
  }
  
  @AfterMethod
  public void close() {
	  driver.close();
	}
}
