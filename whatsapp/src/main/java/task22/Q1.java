package task22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@name='business_name']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		
		String num1=driver.findElement(By.xpath("//div//span[@id='numb1']")).getText();
		String num2=driver.findElement(By.xpath("//div//span[@id='numb2']")).getText();
		
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		
		int n3=n1+n2;
		
		String Result=String.valueOf(n3);
		
		
	
		By num=By.xpath("//input[@id='number']");
		
		emplicitwait( driver,  num , 10).sendKeys(Result);
		
		
		
		
		By btn=By.xpath("//button[@id='demo']");

		emplicitwait( driver,  btn , 10).click();
		
		
		
		
		By form=By.xpath("//h2[@class='text-center cw']");
		String Actual=emplicitwait( driver,  form , 10).getText();
		
		
		
		if(Actual.equalsIgnoreCase("Thank you!")) {
			
			System.out.println("successful");
	
		}
		else {
			
			System.out.println("unsuccessful");
		}
		
		
		
		TakesScreenshot screen=(TakesScreenshot)driver;
		
		File source=screen.getScreenshotAs(OutputType.FILE);
		
		String location=System.getProperty("user.dir")+"//Screenshotdemoform.png";
	
		File Destination=new File(location);
		
		FileHandler.copy(source, Destination);
		
		
		
		
		
		
		
		
	}
		
		public static WebElement emplicitwait(WebDriver driver, By locator ,int time) {
			
			WebDriverWait wait1=new WebDriverWait (driver, Duration.ofSeconds(time));
	        wait1.until(ExpectedConditions.visibilityOfElementLocated(locator));
	        return driver.findElement(locator);
		}
		
		
		
		
	

}
