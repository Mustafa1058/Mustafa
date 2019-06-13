package com.jala.popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Switchtoframe
{
	@Test
	
	public void toframe()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Librarys\\chromedriver.exe");
		WebDriver k=new ChromeDriver();
		k.get("http://qamagnus.jalatechnologies.com");
		k.findElement(By.id("UserName")).sendKeys("mustafamj997@gmail.com");
		k.findElement(By.id("Password")).sendKeys("jalatech");
		k.findElement(By.id("btnLogin")).click();		
	    k.switchTo().frame("9873981ji");
		
		
	}

}
