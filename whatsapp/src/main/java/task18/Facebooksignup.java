package task18;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooksignup {
	
	public void signupfacebook() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
	driver.findElement(By.name("firstname")).sendKeys("Test");
	driver.findElement(By.name("lastname")).sendKeys("User");
	
	driver.findElement(By.name("reg_email__")).sendKeys("tsetuser@test.com");
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("tsetuser@test.com");
	
	driver.findElement(By.name("reg_passwd__")).sendKeys("test@1123");
	

		WebElement ele= driver.findElement(By.name("birthday_day"));
		select(ele,"11");
		WebElement ele1= driver.findElement(By.name("birthday_month"));
		select(ele1,"May");
		WebElement ele2= driver.findElement(By.name("birthday_year"));
		select(ele2,"1985");
		
		
		
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		
	}
	
	
	public  static void select(WebElement ele, String value) {
		Select list=new Select(ele);
		List<WebElement>r=list.getOptions();
		for(WebElement obj:r) {
			if(obj.getText().equals(value)){
				obj.click();
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		 Facebooksignup s=new  Facebooksignup();
		 s.signupfacebook();
		
		
	}

}
