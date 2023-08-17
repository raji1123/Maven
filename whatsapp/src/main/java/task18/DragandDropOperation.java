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
        driver=new EdgeDriver();
		
		
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
	     
	    System.out.println(Actualtext);
	      String Expected="Dropped!";
	
	   if(Actualtext.equalsIgnoreCase(Expected)) {
		   
		   
		   System.out.println("verified");
		   
	   }
	   else {
		   
		   System.out.println(" Not verified");
	   }
	    
	      // color validation
		
		
		
		WebElement dropBox = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		String cssProp = dropBox.getCssValue("color");
	
		String Expected1="#777620";
		
		Color col = Color.fromString(cssProp);
	    String Actual=	col.asHex();
	
		if(Actual.equalsIgnoreCase(Expected1)) {
			
			System.out.println("color is verified");
		}
		else {
			
			System.out.println("Not verified");

		}
		
		driver.close();
		
	}
//
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		DragandDropOperation d=new DragandDropOperation();
		
		d.Jquery();
		
	}

}
