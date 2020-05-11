package com.journaldev.selenium;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Dynamic { 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		// ChromeDriver driver =new Chromedriver();
		   WebDriver driver=new ChromeDriver(); 
		          driver.get("http://register.rediff.com/register/register.php?FormName=user_details");      	         
		         
		          
		        
		          driver.findElement(By.cssSelector("input[type='submit'][id='Register']")).click();

		          driver.findElement(By.cssSelector("input[type='button'][value='Check availability']")).click();
		          Thread.sleep(2000);
	}
}
			
