package runneritlearn.org;

import org.openqa.selenium.WebDriver;

import base.com.Base_Demo;
import pomitlearn.demo.Header_POM;
import pomitlearn.demo.Logout_POM;
import pomitlearn.demo.Signin_POM;


public class RunnerHeader extends Base_Demo {
	
	public static WebDriver driver=BrowserLaunch();
	
	
	public static void main(String[] args) throws InterruptedException {
		Signin_POM s= new Signin_POM(driver);//Parameterized Constructor
		
		Url("https://www.itlearn360.com/");
		Click(s.getSign());
		Sendkeys(s.getUser(),"KAMATCHI11");
		Sendkeys(s.getPass(),"KAMATCHI456$");
		Click(s.getLogin());
		
		Header_POM h = new Header_POM(driver);
		Thread.sleep(2000);
		Click(h.getAllCourses());
		
		//Back To lOGO
		Thread.sleep(2000);
	    Click(h.getLogo());
	    
	    Thread.sleep(2000);
	    Click(h.getBlog());
	    
	    Thread.sleep(2000);
	    Click(h.getContact());
	    
	    Thread.sleep(2000);
	    Click(h.getDashboard());
	    
	    Thread.sleep(2000);	    	    		
		Logout_POM s1= new Logout_POM(driver);
		Click(s1.getLogout());
		
		driver.quit();
		
		
		
		
	}
}
