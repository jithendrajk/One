import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign25 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			// ChromeDriver driver +new Chromedriver();
			   WebDriver driver=new ChromeDriver();
			   driver.navigate().to("https://www.google.co.in");  
			   Thread.sleep(2000);
		        
			  
			
			   driver.manage().window().maximize();
			   Thread.sleep(2000);
			   driver.close();
		           
		} 
		
		
		
				}
	