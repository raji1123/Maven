package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guvisignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.guvi.in/");
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("test");
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("user");
		
		
		String email1="abi2001@gmail.com";
		String password="test@2322";
	    driver.findElement(By.xpath("//input[@id='emailInput']")).sendKeys(email1);
	
	
		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@id='mobileNumberInput']")).sendKeys("1112344444");
		
		driver.findElement(By.xpath("//button[@id='signup']")).click();
		
		
		String verificationactual=driver.findElement(By.xpath("//h2[@id='status_title']")).getText();
		
		String excepted="Successfully Registered";
		
		if(verificationactual.equalsIgnoreCase(excepted)) {
			
			System.out.println("Successfully Registered");
		}
		else {
			
			System.out.println("Not Successfully Registered");
		}
		
		
		
		driver.navigate().to("https://www.guvi.in/");
		
		driver.findElement(By.xpath("//*[@class='nav-link  text-primary text-center px-4']")).click();
		
		driver.findElement(By.xpath("//*[@id='login_email']")).sendKeys(email1);
	   driver.findElement(By.xpath("//*[@id='login_password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id='login_button']")).click();
		
		
		
		String expectedvalue="Please Consider Activating Your Guvi Account.";
		
		String actualvalue=driver.findElement(By.xpath("//*[@id='content']")).getText();
		
		if(actualvalue.equalsIgnoreCase( expectedvalue));{
		
		System.out.println("user logged in successfully");
		}
		driver.close();
		
		
		
		
	}

}
