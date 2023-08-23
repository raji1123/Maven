package task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q1Windowsandframes {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(("mce_0_ifr"));
		driver.findElement(By.xpath("//body//p")).clear();
		driver.findElement(By.xpath("//body//p")).sendKeys("Hello People");
		Thread.sleep(2000);
		String actual=driver.findElement(By.xpath("//body//p")).getText();
		
		
		
		System.out.println(actual);
		String expected="Hello People";
		
		if(expected.equalsIgnoreCase(actual)) {
			System.out.println("pass");
		}
		
		driver.close();
		

	}

}
