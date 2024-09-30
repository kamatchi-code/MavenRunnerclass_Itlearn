package runneritlearn.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.com.Base_Demo;
import pomitlearn.demo.CodeAcademy_POM;

public class RunnerCodeAcademy extends Base_Demo{
	public static WebDriver driver=BrowserLaunch();
	
	public static void main(String[] args) throws InterruptedException {
		CodeAcademy_POM c=new CodeAcademy_POM(driver);
		Url("https://www.itlearn360.com/");
		Thread.sleep(2000);
		Click(c.getAllCourses());
		Thread.sleep(2000);
		
		//code
		//action(c.getCode());
		Click(c.getCode());
		Click(c.getJava());
		Thread.sleep(2000);
		Click(c.getFreeTrial());
		Thread.sleep(2000);
		Click(c.getMonthlyTrial());
		Sendkeys(c.getUser(),"KAMATCHI11");
		Sendkeys(c.getPass(),"KAMATCHI456$");
		Click(c.getLogin());
		Thread.sleep(2000);
		Click(c.getLogout());
		driver.quit();
		

	}

	

	

}
