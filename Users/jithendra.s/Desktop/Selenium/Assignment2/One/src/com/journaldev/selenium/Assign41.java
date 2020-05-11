package com.journaldev.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign41 {
	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			// ChromeDriver driver =new Chromedriver();
			   WebDriver driver=new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.get("www.javatpoint.com");  
			   Thread.sleep(2000);
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			
			   Thread.sleep(2000);
			   js.executeScript("window.scrollBy(0,1000)");

driver.findElement(By.linkText("lazyloaded")).click();  
		            
		          

	}

}
