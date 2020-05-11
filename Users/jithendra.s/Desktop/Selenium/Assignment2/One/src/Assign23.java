import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign23 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		// ChromeDriver driver =new Chromedriver();
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.testandquiz.com/selenium/testing.html");          
	          
	                             
	          
	         driver.findElement(By.linkText("This is a link")).click(); 
	         Thread.sleep(2000);
	        driver.navigate().back(); 
	        Thread.sleep(2000);
	        driver.navigate().forward();
	        Thread.sleep(2000);
	        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");  
	        driver.navigate().refresh();  
	        driver.close();   
        
	        
	}
}
           