package runneritlearn.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.com.Base_Demo;
import pomitlearn.demo.Logout_POM;
import pomitlearn.demo.Signin_POM;
import pomitlearn.demo.Subscribe_POM;

public class RunnerSubScribe extends Base_Demo{
	
	public static WebDriver driver=BrowserLaunch();
	public static void main(String[] args) throws InterruptedException {
		Signin_POM s= new Signin_POM(driver);//Parameterized Constructor
		
		Url("https://www.itlearn360.com/");
		Click(s.getSign());
		Sendkeys(s.getUser(),"KAMATCHI11");
		Sendkeys(s.getPass(),"KAMATCHI456$");
		Click(s.getLogin());
		
		//Scroll down
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,7000)");
				Thread.sleep(3000);
				
				Subscribe_POM sp =new Subscribe_POM(driver);
				Sendkeys(sp.getEmail(), "Test@gmail.com");
				Click(sp.getSubCrib());
				
				//Home Scroll up
				WebElement element2 = driver.findElement(By.xpath("//h2[text()='Home']"));
				element2.click();
				Thread.sleep(3000);
				
				 
			    Thread.sleep(2000);	    	    		
				Logout_POM s1= new Logout_POM(driver);
				Click(s1.getLogout());
				
				driver.quit();
						
				
				
				
	}

}
