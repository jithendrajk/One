import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign27 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			// ChromeDriver driver +new Chromedriver();
			   WebDriver driver=new ChromeDriver();
			   driver.navigate().to("http://www.softwaretestingmaterial.com");  
			   Thread.sleep(2000);
		        
			  
			
				   		        System.out.println(driver.manage().window().getSize());
				        //Create object of Dimensions class
				        Dimension d = new Dimension(480,620);
				        //Resize the current window to the given dimension
				        driver.manage().window().setSize(d);
				        System.out.println(driver.manage().window().getSize());
				        Thread.sleep(2000);
				        driver.close();
				        
		
		           
		} 
		
		
		
				}
	