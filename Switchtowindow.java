package com.jala.popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Switchtowindow
{
	@Test
	public void window()
	{
	
		
		System.setProperty("webdriver.chrome.driver", "E:\\Librarys\\chromedriver.exe");		
		WebDriver k=new ChromeDriver();
		k.get("https://facebook.com");

		k.findElement(By.id("email")).sendKeys("7794911633");
		k.findElement(By.id("pass")).sendKeys("7337433166");
		k.findElement(By.id("u_0_2")).click();
		//k.get("https://gmail.com");
		//String handle=k.getWindowHandle();
		String parentWindow = k.getWindowHandle();
		//Set<String> handles = k.getWindowHandles();
		  
		          k.switchTo().window(parentWindow);
		         k.close(); //closing child window
		         k.switchTo().window(parentWindow); //cntrl to parent window
		          
		    
		
	}

	
}
