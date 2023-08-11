package task22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q1Dropdownandsynchronization {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.xpath("//*[@class='first_name input mb1']")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@class='last_name input mb1']")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@class='business_name input mb1']")).sendKeys("meta");
		driver.findElement(By.xpath("//*[@class='email input mb1']")).sendKeys("abc@gmail.com");
		
List <WebElement>	spanli=	driver.findElements(By.xpath("//h2[@class='cw mw100']"));
int sum=0;
for(WebElement r:spanli) {
	
	String value=r.getText();
	
	
	 System.out.println(value);
}
		
		
	  String num1=(driver.findElement(By.xpath("//span[@id='numb1']")).getText());
	  
	  String num2=driver.findElement(By.xpath("//span[@id='numb2']")).getText();
			        
	String num3=num1+num2;
	
	
		
		
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys(num3);
		driver.findElement(By.xpath("//button[@id='demo']")).click();
		
		
		
	}

}
