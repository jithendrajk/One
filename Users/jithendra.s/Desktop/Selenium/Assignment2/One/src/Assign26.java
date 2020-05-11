import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign26 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			// ChromeDriver driver +new Chromedriver();
			   WebDriver driver=new ChromeDriver();
			   driver.navigate().to("https://www.google.co.in");  
			   Thread.sleep(2000);
			   Point p = new Point(0,4000);

			       	
		     	
		     	        driver.manage().window().setPosition(p);
			  
			
			   
			   Thread.sleep(2000);
			   driver.close();
		           
		} 
		
		
		
				}
	