package Package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	 
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\k.cyril.joseph\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://jqueryui.com/droppable/");
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  WebElement src = driver.findElement(By.id("draggable"));
	  WebElement des = driver.findElement(By.id("droppable"));
	  
	  Actions act=new Actions(driver);
	  //act.dragAndDrop(src, des).build().perform();
	  act.clickAndHold(src).release(des).build().perform();;
	  
	  driver.switchTo().defaultContent();
	  //driver.findElement(By.linkText("Demos")).click();
	  //Assert.assertTrue(driver.getTitle().contains("Demos"));
	    
  }
}
