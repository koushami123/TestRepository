package Package_1;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Class_e {
	ExtentReports report;
	ExtentTest test;
	WebDriver driver;
	
  @Test
  public void f() throws IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\k.cyril.joseph\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://newtours.demoaut.com");
	   
	   if(driver.getTitle().contains("Marcury")){
		   test.log(LogStatus.PASS,"Login","Success");
	   }else{
		   test.log(LogStatus.FAIL, test.addScreenCapture(Capture.screen(driver)), "Fail");
	   }
	   driver.close();
  }
  @BeforeMethod
  public void beforeMethod() {
	  report = new ExtentReports("C:\\Users\\k.cyril.joseph\\Documents\\myreport.html");
	  test=report.startTest("ReportCreation");	  
  }

  @AfterMethod
  public void afterMethod() {
	  report.flush();
	  report.endTest(test);
  }

}
