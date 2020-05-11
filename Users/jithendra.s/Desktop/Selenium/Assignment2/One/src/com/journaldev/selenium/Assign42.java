package com.journaldev.selenium;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign42 {
	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			// ChromeDriver driver =new Chromedriver();
			   WebDriver driver=new ChromeDriver();
			   JavascriptExecutor js = (JavascriptExecutor) driver;

			   driver.manage().window().maximize();
			   driver.get("https://www.testandquiz.com/selenium/testing.html");  
			   Thread.sleep(2000);
			   
			   js.executeScript("window.scrollBy(0,4000)");
			   Thread.sleep(2000);
			  
				Select testingDropdown = new Select(driver.findElement(By.id("testingDropdown")));
				testingDropdown.selectByVisibleText("Database Testing");
				testingDropdown.selectByIndex(3);
Thread.sleep(2000);
driver.close();
		          

	}
}