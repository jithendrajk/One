import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;      
	          
public class CSS {
	private static WebElement searchBox;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		// ChromeDriver driver =new Chromedriver();
		   WebDriver driver=new ChromeDriver();
		   driver.navigate().to(" https://accounts.google.com/signup");  
	          
	          
	          driver.manage().window().maximize(); 
	          Thread.sleep(2000);
	          setSearchBox(driver.findElement(By.cssSelector("Input#firstName")));

	          Thread.sleep(2000);
	}

	public static WebElement getSearchBox() {
		return getSearchBox();
	}

	public static void setSearchBox(WebElement searchBox) {
		CSS.searchBox = searchBox;
	}

	
}

driver.findElement(By.cssSelector("span.CwaK9")).click();
Thread.sleep(2000);
Thread.sleep(2000);