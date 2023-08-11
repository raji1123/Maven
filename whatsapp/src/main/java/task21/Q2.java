package task21;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Excepted="New Window";
		String parentwindow=null;
		String Childwindow=null;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://the-internet.herokuapp.com/windows");
		
		parentwindow=driver.getWindowHandle();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		for(String wd:windows) {
			
			if(!(wd.equals(parentwindow))) {
				Childwindow=wd;
			}
		}
		
		
		//verification for new window twxt present in the page	
		  driver.switchTo().window(Childwindow);
		  String Actual=driver.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText();
		
			if( Excepted.equalsIgnoreCase(Actual)) {
				
				System.out.println("new window is present on the page");
			}
			
			
			
			driver.close();//close the new window
			
			
			//checking the parent window is active and closing the parent browser
			driver.switchTo().window(parentwindow);
			
			String Actual1	=driver.getCurrentUrl();
			
			String Excepted1="https://the-internet.herokuapp.com/windows";
			
             if( Excepted1.equalsIgnoreCase(Actual1)) {
				
				System.out.println("orginal window is active");
			}
			
			
			driver.close();//

	}

}
