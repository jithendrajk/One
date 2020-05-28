
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi21 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		// ChromeDriver driver =new Chromedriver();
		   WebDriver driver=new ChromeDriver();
		   driver.navigate().to("https://www.msn11.com/en-in");  
	          
	          
	          driver.manage().window().maximize();  
	          
	         Thread.sleep(2000);  
	          
	          
	        driver.findElement(By.linkText("Selectable")).click();  
	        
	        driver.navigate().back(); 
	        Thread.sleep(2000);
	        driver.navigate().forward();
	        Thread.sleep(2000);
	        driver.navigate().refresh();  
	

Select select = new Select(driver.findElement(By.xpath("/html/body/div[2]/header/ul/li[5]/ul/li[2]/ul/li[1]/label)));"

	
driver.close();  
}


}
	
