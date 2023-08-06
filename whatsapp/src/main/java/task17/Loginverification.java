package task17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginverification {

	
	public static void main (String[] argus) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.co.in");

		
        driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("rajilakshmi1112223@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Raji@1123");
		
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.navigate().refresh();
		System.out.println("loggedin Successfuly");
		
		Thread.sleep(5000);
		driver.close();
		
	}
	
	
	
	
	
	

}
