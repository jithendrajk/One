package softwareTestingMaterial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assign48 {
 
 public static void main (String [] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
 WebDriver driver = new ChromeDriver();
  driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 Thread.sleep(5000);
 WebElement logo = driver.findElement(By.xpath("//input[@id='firstName']"));
 WebElement logo1 = driver.findElement(By.xpath("//input[@id='username']"));
 
         int logoWidth = logo.getSize().getWidth();
         int logoWidth1 = logo1.getSize().getWidth();
         System.out.println("Logo width : "+logoWidth1+" pixels");
         System.out.println("Logo width : "+logoWidth+" pixels");
               
         if (logoWidth == logoWidth1) {
 			
 			System.out.println("Width of the two boxes are same");
 		} else {
 			
 			System.out.println("width of the two boxes are not equal");
       
}
         
}
 }