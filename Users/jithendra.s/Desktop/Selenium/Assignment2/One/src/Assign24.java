import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign24 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		// ChromeDriver driver =new Chromedriver();
		   WebDriver driver=new ChromeDriver();
		   driver.navigate().to("https://www.google.com");  
		   Thread.sleep(2000);
	        
		  
		
			        //Create object of Dimensions class
			        Dimension d = new Dimension(480,620);
			        //Resize the current window to the given dimension
			        driver.manage().window().setSize(d);
			       
			        Thread.sleep(2000);
			        driver.close();
	
			      
	} 
	
	
	
			}
	