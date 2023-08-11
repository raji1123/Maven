package task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q1Windowsandframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(("mce_0_ifr"));
		driver.findElement(By.xpath("//body//p")).clear();
		driver.findElement(By.xpath("//body//p")).sendKeys("Hello People");
		
		
		
		
		
		//driver.close();
		

	}

}
