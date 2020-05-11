package com.journaldev.selenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

import java.util.Set;
import java.util.concurrent.TimeUnit;
public class Assign51 {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	
	
	WebDriver driver=new FirefoxDriver();
	       
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	                       		
	   driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
	   Thread.sleep(2000);
		
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[1]/div[1]/a"));
Thread.sleep(2000);

WebElement link = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[1]/div[1]/a"));
Actions newTab = new Actions(driver);
Thread.sleep(5000);

newTab.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(link).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
Thread.sleep(5000);
String base = driver.getWindowHandle();
Set<String> set = driver.getWindowHandles();

driver.close();
}
}