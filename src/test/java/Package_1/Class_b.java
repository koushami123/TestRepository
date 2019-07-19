package Package_1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class Class_b {
	WebDriver ff;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.ie.driver","C:\\Users\\k.cyril.joseph\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
	   ff=new InternetExplorerDriver();
	   ff.get("http://newtours.demoaut.com");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
