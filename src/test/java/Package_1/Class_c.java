package Package_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Class_c {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\k.cyril.joseph\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	
	   
	   Actions act=new Actions(driver);
	   act.moveToElement( driver.findElement(By.xpath("//span[contains(text(),'Categories')]"))).
	   moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).click();
	   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   act.moveToElement(driver.findElement(By.xpath("//ul[@id='submenuul11290']"))).build().perform();
	   driver.findElement(By.xpath("//ul[@id='submenuul11290']")).click();
  }
}
