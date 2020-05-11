package com.journaldev.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Assign43 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		// ChromeDriver driver =new Chromedriver();
		   WebDriver driver=new ChromeDriver(); 
		 

          driver.get("https://demoqa.com/automation-practice-form/"); 
          driver.manage().window().maximize();
    
		   Thread.sleep(2000);   
                 
          driver.findElement(By.name("firstname")).sendKeys("Jithendra");
          Thread.sleep(2000);
          driver.findElement(By.id("lastname")).sendKeys("sunnam");							
          Thread.sleep(2000);
          driver.findElement(By.id("buttonwithclass")).click();				
          Thread.sleep(1000);
     
      
	}
}
