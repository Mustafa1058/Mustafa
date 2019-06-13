package com.jala.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewSecond 
{
	@Test
	public void newmethod()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Librarys\\chromedriver2.exe");
		WebDriver k=new ChromeDriver();
		k.get("http://qamagnus.jalatechnologies.com");
	
	}

}
