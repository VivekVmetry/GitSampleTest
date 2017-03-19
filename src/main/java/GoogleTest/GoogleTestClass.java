package GoogleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTestClass {
	
	@Test
public void googletestmethod() throws IOException
{
	WebDriver wd= new FirefoxDriver();
	wd.get("https://google.com");
	wd.manage().window().maximize();
	
	File srcFile=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new 
File("E:\\selenium\\SeleniumWorkSpace5\\GithubTest\\testsshot\\google.jpg"));
	
	}
}
