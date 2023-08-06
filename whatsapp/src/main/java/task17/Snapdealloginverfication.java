package task17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdealloginverfication {

	void login() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.snapdeal.com/");
				//String s1 = driver.getWindowHandle();
		driver.findElement(By.xpath("(//span[@class='accountUserName col-xs-12 reset-padding'])[1]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='login'])[1]")).click();
				//String s2 = driver.getWindowHandle();
		
		driver.switchTo().frame(driver.findElement(By.id("loginIframe")));
				
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("rajilakshmi1112223@gmail.com");
		driver.findElement(By.xpath("//button[@id='checkUser']")).click();
		//driver.switchTo().frame(driver.findElement(By.id("loginIframe")));
		
		driver.findElement(By.xpath("(//input[@placeholder='Code'])[2]"));
	
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@id='loginUsingOtp']")).click();
		System.out.println("user logged in successfully");
		
				
				
		
	
	
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {

		Snapdealloginverfication s=new Snapdealloginverfication ();
		s.login();
	
		
		
		
		
		
	}

}
