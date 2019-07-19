package Package_1;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class OnlineShoppingTest {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
  @Test(priority=2)
  public void testLogin() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.cyril.joseph\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/");
	  
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.name("userName")).sendKeys("Lalitha");
	  driver.findElement(By.name("password")).sendKeys("Password123");
	  driver.findElement(By.name("Login")).click();
      Assert.assertEquals(driver.getTitle(),"Home");
  }
  
  @Test(priority=3)
  public void testCart(){

	  driver.findElement(By.id("myInput")).sendKeys("headphone");
	  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	  Assert.assertEquals(driver.getTitle(),"Search");
	  driver.findElement(By.partialLinkText("Add")).click();
	  driver.findElement(By.partialLinkText("Cart")).click();
	  Assert.assertEquals(driver.getTitle(),"View Cart");
	  
  }
  
  @Test(priority=4)
  public void testPayment(){
	  driver.findElement(By.partialLinkText("Checkout")).click();
	  driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.findElement(By.cssSelector("#swit > div:nth-child(1) > div")).click();
	//driver.findElement(By.xpath("//label[contains(text(),'Andhra']")).click();
	  driver.findElement(By.partialLinkText("CONTINUE")).click();
	  driver.findElement(By.name("username")).sendKeys("123456");
	  driver.findElement(By.name("password")).sendKeys("Pass@456");
	  driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	  driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
	  driver.findElement(By.xpath("//input[@value='PayNow']")).click();
	  Assert.assertEquals(driver.getTitle(),"Order Details");
	  driver.close();
	  
  }

@Test(priority=1)
  public void testregistration(){
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.cyril.joseph\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/");
	  
	  driver.findElement(By.linkText("SignUp")).click();
	  driver.findElement(By.name("userName")).sendKeys("dora3489");
	  driver.findElement(By.name("firstName")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  WebElement a = driver.findElement(By.xpath("//span[contains(text(),'Available')]"));
	  Assert.assertEquals(a.getText(),"Available");
	  
	  driver.findElement(By.name("firstName")).sendKeys("Sound");
	  driver.findElement(By.name("lastName")).sendKeys("arya");
	  driver.findElement(By.name("password")).sendKeys("Password123");
	  driver.findElement(By.name("confirmPassword")).sendKeys("Password123");
	  driver.findElement(By.xpath("//input[@value='Female']")).click();
	  driver.findElement(By.name("emailAddress")).sendKeys("soundarya@gmail.com");
	  driver.findElement(By.name("mobileNumber")).sendKeys("1234567890");
	  driver.findElement(By.name("dob")).sendKeys("08/06/1997");
	  
	  
	  driver.findElement(By.name("address")).sendKeys("Kanyakuamri");
	  Select sel=new Select(driver.findElement(By.name("securityQuestion")));
	  sel.selectByIndex(1);
	  driver.findElement(By.name("answer")).sendKeys("Pink");
	  //driver.findElement(By.name("Submit")).click();
	  // Assert.assertEquals(driver.getTitle(),"Login");
	  driver.close();
  }
  
  @AfterMethod
  public void getResultAfterMethod(ITestResult result) throws IOException {
	 if(result.getStatus()==ITestResult.FAILURE){
		 test.log(LogStatus.FAIL, test.addScreenCapture(Capture.screen(driver)),"Wait");
	 }  else{
	  test.log(LogStatus.PASS,"Passed","Continue");
	 }
	  
  }

  @BeforeTest
  public void startReportBeforeTest() {
	  report=new ExtentReports("C:\\Users\\k.cyril.joseph\\Documents\\shop.html");
	  test=report.startTest("Report Started");
  }

  @AfterTest
  public void endReportAfterTest() {
	  report.flush();
	  report.endTest(test);
  }

}
