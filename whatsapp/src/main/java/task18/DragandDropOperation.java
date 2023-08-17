package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragandDropOperation {

	WebDriver driver=null;
	void Jquery() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	    Actions act=new  Actions(driver);
	    
	     String Actualtext2= driver.findElement(By.xpath("//*[@class='ui-widget-header ui-droppable']//p")).getText();
	    
	     act.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")),driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
	   
	   
	     Thread.sleep(2000);
	     
	     //validation
	     String Actualtext= driver.findElement(By.xpath("//*[@class='ui-widget-header ui-droppable ui-state-highlight']")).getText();
	    
	      String Excepted="Dropped!";
	
	      Assert.assertEquals(Actualtext, Excepted);
	   
	    
	      // color validation
		
		
		
		WebElement dropBox = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		String cssProp = dropBox.getCssValue("color");
	
		
		
		Color col = Color.fromString(cssProp);
	    String Actual=	col.asHex();
	
		
		Assert.assertEquals(Actual, "#777620");
		
		driver.close();
		
	}
//
	
	
	@Test
	public void test1() throws InterruptedException {
		
		DragandDropOperation d=new DragandDropOperation();
		
		d.Jquery();
		
	}

}
