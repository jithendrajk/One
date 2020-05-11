
package com.journaldev.selenium;
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class SeleniumCSSLocators { 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		// ChromeDriver driver =new Chromedriver();
		   WebDriver driver=new ChromeDriver(); 
          driver.get("https://accounts.google.com/signup"); 
      // Here Tag = input and Id = identifier
          driver.findElement(By.cssSelector("svg.l5Lhkf")).click();
          Thread.sleep(2000);
      driver.findElement(By.cssSelector("input[name=firstName]")).sendKeys("Pati"); 
      driver.findElement(By.cssSelector("input[name=lastName]")).sendKeys("Vamsi"); 
      driver.findElement(By.cssSelector("input[name=Username]")).sendKeys("vamsi.pati@gmail.com");
      driver.findElement(By.cssSelector("input[name=Passwd]")).sendKeys("Jkt@123"); 
      driver.findElement(By.cssSelector("input[name=ConfirmPasswd]")).sendKeys("Jkt@123");
      driver.findElement(By.cssSelector("span.CwaK9")).click();
      Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.IMH1vc.lUHSR.Hj2jlf")).click();
        
            Thread.sleep(2000);
     
	}
}