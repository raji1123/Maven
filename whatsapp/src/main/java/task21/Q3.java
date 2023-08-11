package task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Q3 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame("frame-top");
	   
	    driver.switchTo().frame("frame-left");
	    
	    String Actual=driver.findElement(By.xpath("//body[1]")).getText();
	    
	    String Exceptedleft="left";
	    
	    if(Exceptedleft.equalsIgnoreCase(Actual))
	    {
	    System.out.println("verified left frame");
	    System.out.println(Actual);
	    }
	    Thread.sleep(2000);
	    
	   driver.switchTo().defaultContent();
	     
	   driver.switchTo().frame("frame-top");
	   driver.switchTo().frame("frame-middle");
	    
	    
      String Actual1=driver.findElement(By.xpath("//div[@id='content']")).getText();
	    
	    String Exceptedmid="middle";
	    
	    if(Exceptedmid.equalsIgnoreCase( Actual1))
	    {
	      System.out.println("verified middle frame");
	      System.out.println(Actual1);
	    }
	    Thread.sleep(2000);
	    driver.switchTo().defaultContent();
	  	driver.switchTo().frame("frame-top");
	  	
	  	driver.switchTo().frame("frame-right");
	    
	    String Actual2=driver.findElement(By.xpath("//body[1]")).getText();
	    
	    
          String Exceptedright="right";
	    
	    if(Exceptedright.equalsIgnoreCase( Actual2))
	    {
	      System.out.println("verified right frame");
	      System.out.println(Actual2);
	    }
	    Thread.sleep(2000);
	    
	    driver.switchTo().defaultContent();
        WebElement btm=driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
	  	
	  	driver.switchTo().frame(btm);
	  	
	  	 String Actual3=driver.findElement(By.xpath("//body[1]")).getText();
		    
		    
         String Exceptedbottom="bottom";
	    
	    if(Exceptedbottom.equalsIgnoreCase( Actual3))
	    {
	      System.out.println("verified bottom frame");
	      System.out.println(Actual3);
	    }
	    Thread.sleep(2000);
	  String  page= driver.switchTo().defaultContent().getTitle();
	  	   String Excepted="Frames";
	   
	   if(Excepted.equalsIgnoreCase(page))
	    {
	      
	      System.out.println("successful");
	    }
	
	    
	}

}