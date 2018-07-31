package com.nit.mavenproject.example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demoqa.com");
	    driver.manage().window().maximize();
	    
	    //driver.findElement(By.xpath("//a[@href='http://demoqa.com/registration/']")).click();
	    //We can store that xpath in the WebElement and then click over it
	    WebElement fs = driver.findElement(By.xpath("//a[@href='http://demoqa.com/registration/']"));
	    fs.click();

	}

}
