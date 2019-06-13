package com.jala.popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Singlewindow 
{
	@Test
	public void window()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Librarys\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://qamagnus.jalatechnologies.com");
		 driver.findElement(By.id("UserName")).sendKeys("mustafamj997@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("jalatech");
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.linkText("More")).click();
			driver.findElement(By.linkText("Popups")).click();

		 String parentWindowHandle = driver.getWindowHandle();
		 System.out.println("Parent window's handle -> " + parentWindowHandle);
		 WebElement clickElement = driver.findElement(By.id("button1")); 
		 
		 for(int i = 0; i < 3; i++)
		 {
		 clickElement.click();
		 //Thread.sleep(3000);
		 }
		 Set<String> allWindowHandles = driver.getWindowHandles();
		 
		 for(String handle : allWindowHandles)
		 {
		 System.out.println("Window handle - > " + handle);
		 }
		 
	}

}
