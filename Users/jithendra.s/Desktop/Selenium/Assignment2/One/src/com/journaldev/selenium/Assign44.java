package com.journaldev.selenium;
import java.awt.Image;
import java.text.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Point;


public class Assign44 {
 
	 public static void main (String [] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
		 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(5000);
		 int firstName = driver.findElement(By.xpath("//input[@id='firstName']")).getLocation().getY();
		 int username = driver.findElement(By.xpath("//input[@id='username']")).getLocation().getY();
		 System.out.println(" firstName y co-ordinates"+ firstName );
		 System.out.println(" username y co-ordinates"+ username );
		 if (firstName == username) {
	 			
	 			System.out.println("Vertical distance of the two boxes are same");
	 		} else {
	 			
	 			System.out.println("Vertical distance  of the two boxes are not equal");
	       
	}
	         
	}
	 }

	       