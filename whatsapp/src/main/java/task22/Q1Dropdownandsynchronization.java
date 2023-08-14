package task22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q1Dropdownandsynchronization {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://phptravels.com/demo/");
		
		
  
		
		
		
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='first_name input mb1']")));
		ele1.sendKeys("abc");
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='last_name input mb1']")));
		ele2.sendKeys("aahh");
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele3=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='business_name input mb1']")));
		ele3.sendKeys("mwta");
		driver.findElement(By.xpath("//*[@class='business_name input mb1']")).sendKeys("meta");
		
         WebDriverWait wait3=new   WebDriverWait(driver,Duration.ofSeconds(10));
	     WebElement ele4=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='email input mb1']")));
		 ele4.sendKeys("abab@gmail.com");
 
		
		
	     String num1=(driver.findElement(By.xpath("//span[@id='numb1']")).getText());
	 
	  	 String num2=driver.findElement(By.xpath("//span[@id='numb2']")).getText();
	  	  
	  
	  	
	  	  
	  	  int org1=Integer.parseInt(num1);
	  	  int org2=Integer.parseInt(num2);
	      int r=org1+org2;
	
	     	String finalresult=String.valueOf(r);
	
		
    
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys(finalresult);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='demo']")).click();
		
		
		
		
		Thread.sleep(2000);
		String Actual=driver.findElement(By.xpath("//h2[@class='text-center cw']")).getText();
		
		System.out.println(Actual);
		
		String Expected="Thankyou!";
		
		if(Actual.equalsIgnoreCase(Expected)) 
		{
			System.out.println("verified");
		}
		
		
	}
		
		
	/*	public static void implicit(WebDriver driver,By loc1, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		WebElement ele1=wait.until(ExpectedConditions.elementToBeClickable(loc1));
		
	//	return driver.findElement( loc1);*/

		
	}


