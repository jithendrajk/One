
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi21 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		// ChromeDriver driver =new Chromedriver();
		   WebDriver driver=new ChromeDriver();
		   driver.navigate().to("https://demoqa.com//");  
	          
	          
	          driver.manage().window().maximize();  
	          
	         Thread.sleep(2000);  
	          
	          
	        driver.findElement(By.linkText("Selectable")).click();  
	        
	        driver.navigate().back(); 
	        Thread.sleep(2000);
	        driver.navigate().forward();
	        Thread.sleep(2000);
	        driver.navigate().refresh();  
	        driver.close();  
	}
	

	}

