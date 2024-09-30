package runneritlearn.org;

import org.openqa.selenium.WebDriver;

import base.com.Base_Demo;
import pomitlearn.demo.Coursesmousehover_POM;

public class RunnerMouseHover extends Base_Demo {
	
	public static WebDriver driver=BrowserLaunch();
	
	public static void main(String[] args) throws InterruptedException {
		Coursesmousehover_POM m=new Coursesmousehover_POM(driver);
		Url("https://www.itlearn360.com/");
		Thread.sleep(2000);
		Click(m.getAllCourses());
		Thread.sleep(2000);
		Action(m.getCloud());
		Thread.sleep(2000);
		Action(m.getDevops());
		Thread.sleep(2000);
		Action(m.getSTesting());
		Thread.sleep(2000);
		Action(m.getCode());
		Thread.sleep(2000);
		Action(m.getCyber());
		Thread.sleep(2000);
		Action(m.getCareer());
		driver.quit();
		
		
		}

}
