package task19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.guvi.in/register");
		
		
		//finding possible x-path for first name
		
		driver.findElement(By.id("firstName"));
		
		driver.findElement(By.className("form-control"));
		
		
		driver.findElement(By.tagName("input"));
		
		
		driver.findElement(By.cssSelector("#firstName"));
		
		driver.findElement(By.xpath("//input[@id='firstName']"));
		
		
		
		
		//finding possible x-path for last name
		
		
       driver.findElement(By.id("lastName"));
		
		driver.findElement(By.className("form-control"));
		
		
		driver.findElement(By.tagName("input"));
		
		
		driver.findElement(By.cssSelector("#lastName"));
		
		driver.findElement(By.xpath("//input[@id='lastName']"));
		
		
		
		//	finding possible x-path for emailid
		
		
		   driver.findElement(By.id("emailInput"));
			
			driver.findElement(By.className("form-control"));
			
			
			driver.findElement(By.tagName("input"));
			
			
			driver.findElement(By.cssSelector("#emailInput"));
			
			driver.findElement(By.xpath("//input[@id='emailInput']"));
			
		
		
		
		//finding possible x-path for password
			
			
			 driver.findElement(By.id("passwordInput"));
				
			 driver.findElement(By.className("form-control"));
				
				
			driver.findElement(By.tagName("input"));
				
				
			driver.findElement(By.cssSelector("#passwordInput"));
				
			driver.findElement(By.xpath("//input[@id='passwordInput']"));
		
		
		//finding possible x-path for mobile number
		
				
				
				 driver.findElement(By.id("mobileNumberInput"));
					
					driver.findElement(By.className("form-control"));
					
					
					driver.findElement(By.tagName("input"));
					
					
					driver.findElement(By.cssSelector("#mobileNumberInput"));
					
					driver.findElement(By.xpath("//input[@id='mobileNumberInput']"));	
				
				
				///finding possible x-path for signupbutton
					
					
					
					 driver.findElement(By.id("signup"));
						
						driver.findElement(By.className("form-control"));
						
						
						driver.findElement(By.tagName("input"));
						
						
						driver.findElement(By.cssSelector("#signup"));
						
						driver.findElement(By.xpath("//input[@id='signup']"));	
					
					
					
					
					
					
				
}
}