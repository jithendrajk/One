import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_Settings {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		// ChromeDriver driver =new Chromedriver();
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.google.com/");  
		   
	          
	          
	          driver.manage().window().maximize();  

	      
	          
	         Thread.sleep(2000);  
	         driver.findElement(By.id("lst-ib")).sendKeys("Testing");
	         Thread.sleep(2000); 
	         List<WebElement> list=driver.findElements(By.xpath("//ul[@role'listbox']//li/descendant::div[@class='sbqs_c']"));
	         System.out.println("Total no of suggestions in search box:::===>"+ list.size());
	for(int i=0; i<list.size(); i++) {
		 System.out.println(list.get(i).getText());
		 if(list.get(i).getText().contains("Testing tools"))		 {
			 list.get(i).click();
		break;	 
		 }
	}
					 
				 
		 }
	
		
	}
	
