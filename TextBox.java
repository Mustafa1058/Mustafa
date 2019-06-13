package com.jala.popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBox {
	@Test
	public void prompt() {
		System.setProperty("webdriver.chrome.driver", "E:\\Librarys\\chromedriver.exe");
		WebDriver k = new ChromeDriver();
		 k.get("http://qamagnus.jalatechnologies.com");			
			k.findElement(By.id("UserName")).sendKeys("mustafamj997@gmail.com");
			k.findElement(By.id("Password")).sendKeys("jalatech");
			k.findElement(By.id("btnLogin")).click();
			k.findElement(By.linkText("More")).click();
			k.findElement(By.linkText("Popups")).click();
		Alert alert = k.switchTo().alert();
		String q = k.switchTo().alert().getText();
		System.out.println(alert);

		alert.accept();
		alert.sendKeys("mustafa");
		
		System.out.println(alert.getText());

	}

}
