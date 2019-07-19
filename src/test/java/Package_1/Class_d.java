package Package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Class_d {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\k.cyril.joseph\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
	  
	  Assert.assertTrue(driver.getTitle().contains("Demo Web Shop"));
	  
	  WebElement a = driver.findElement(By.name("q"));
	  Actions act=new Actions(driver);
	 //a.sendKeys("computer");
	  act.keyDown(a,Keys.SHIFT).sendKeys("computer").keyUp(a, Keys.SHIFT).build().perform();
	  Thread.sleep(2000);
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).click().build().perform();
	  driver.findElement(By.xpath("//input[@value='Search']")).click();
  }
}
