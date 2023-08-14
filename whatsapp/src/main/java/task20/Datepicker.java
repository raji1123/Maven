package task20;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		String orgdate="22";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	
		
		
		List <WebElement> select=driver.findElements(By.xpath("//tbody//tr//td"));
		
		
		for(WebElement date:select) {
		
			if(orgdate.equals(date.getText())) {
			
			date.click();
			break;
				
			}

			
		}
		
		Thread.sleep(1000);
		String output=driver.findElement(By.xpath("//input[@id='datepicker']")).getAttribute("value");
		System.out.println(output);
		driver.quit();
	
		
	}

}