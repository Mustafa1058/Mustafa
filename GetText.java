package com.jala.popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetText 
{
	@Test
	
	public void getText()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Librarys\\chromedriver.exe");
		WebDriver k=new ChromeDriver();
        k.get("http://qamagnus.jalatechnologies.com");			
		k.findElement(By.id("UserName")).sendKeys("mustafamj997@gmail.com");
		//k.findElement(By.id("pass")).sendKeys("8947238947");
		k.findElement(By.id("btnLogin")).click();
		Alert alert=k.switchTo().alert();
		String q=k.switchTo().alert().getText();
		System.out.println(q);
		
	}
}
