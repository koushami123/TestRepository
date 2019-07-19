package Package_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class_a {
  @Test
  public void f() throws IOException {
	  File src=new File("C:\\Users\\k.cyril.joseph\\Documents\\Book1.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook book=new XSSFWorkbook(fis);
	  XSSFSheet sheet=book.getSheetAt(0);
	  
	  int n=sheet.getLastRowNum();
	  System.out.println(n);
	  for(int i=0;i<n;i++){
		  String un = sheet.getRow(i+1).getCell(0).getStringCellValue();
		  String pass = sheet.getRow(i+1).getCell(1).getStringCellValue();
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\k.cyril.joseph\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com");
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  driver.findElement(By.name("userName")).sendKeys(un);
		  driver.findElement(By.name("password")).sendKeys(pass);
		  driver.findElement(By.name("login")).click();
		  driver.close();
	  }
	  
  }
}
