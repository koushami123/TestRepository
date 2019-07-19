package Package_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Capture {
	public static String screen(WebDriver driver) throws IOException{
		TakesScreenshot a= (TakesScreenshot) driver;
		File src=a.getScreenshotAs(OutputType.FILE);
		String des=("C:\\Users\\k.cyril.joseph\\Documents\\screen.html");
		FileUtils.copyFile(src, new File(des));
		return des;
		
	}
}
