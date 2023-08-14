package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropOperation {

	
	void Jquery() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	    Actions act=new  Actions(driver);
	    
	     String Actualtext2= driver.findElement(By.xpath("//*[@class='ui-widget-header ui-droppable']//p")).getText();
	     System.out.println(Actualtext2);
	     
	     
	      act.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")),driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
	   
	   
	     Thread.sleep(2000);
	    String Actualtext= driver.findElement(By.xpath("//*[@class='ui-widget-header ui-droppable ui-state-highlight']")).getText();
	    
	     String Excepted="Dropped!";
	
	    if(Actualtext.equalsIgnoreCase(Excepted)) {
		
		System.out.println("Element is dropped");
	   }
	
	    WebElement Actualtext1= driver.findElement(By.cssSelector("div.ui-state-highlight"));
	    
		System.out.println(  Actualtext1.getText());
	    
	
	   
	}
//
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		DragandDropOperation s=new DragandDropOperation();
		s.Jquery();
		

	}

}
