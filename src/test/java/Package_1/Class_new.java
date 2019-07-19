package Package_1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Class_new {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  driver.findElement(By.name("login")).click();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@value='oneway']")).click();
	  Select val=new Select(driver.findElement(By.name("passCount")));
	  val.selectByIndex(1);
	  Select dep=new Select(driver.findElement(By.name("fromPort")));
	  System.out.println(driver.findElement(By.cssSelector("select[name='fromPort'] li:nth-of-type(2)")));
	  dep.selectByVisibleText("London");
	  Select arr=new Select(driver.findElement(By.name("toPort")));
	  arr.selectByValue("Paris");
	  driver.findElement(By.xpath("//input[@value='Business']")).click();
	  driver.findElement(By.name("findFlights")).click();
	  driver.findElement(By.linkText("SIGN-OFF")).click();
	  Assert.assertEquals(driver.getTitle(),"Sign-on: Mercury Tours");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\k.cyril.joseph\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://newtours.demoaut.com");
	   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
