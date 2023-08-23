package task21;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String parentwindow=null;
		String Childwindow=null;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://the-internet.herokuapp.com/windows");
		
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		
		List<String>window1=new ArrayList(windows);
		
		String parent1=window1.get(0);
		String Childwindow1=window1.get(1);
		
		/*for(String wd:windows) {
			
			if(!(wd.equals(parentwindow))) {
				Childwindow=wd;
			}
		}*/
		
		
		//verification for new window twxt present in the page	
		  driver.switchTo().window(Childwindow1);
		  String Excepted="New Window";
		  String Actual=driver.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText();
		
			if( Excepted.equalsIgnoreCase(Actual)) {
				
				System.out.println("new window is present on the page");
			}
			
			
			
			driver.close();//close the new window
			
			
			//checking the parent window is active and closing the parent browser
			driver.switchTo().window(parent1);
			
			String Actual1	=driver.getCurrentUrl();
			
			String Excepted1="https://the-internet.herokuapp.com/windows";
			
             if( Excepted1.equalsIgnoreCase(Actual1)) {
				
				System.out.println("orginal window is active");
			}
			
			
			driver.close();//

	}

}
