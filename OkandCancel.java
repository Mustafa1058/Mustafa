package com.jala.popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OkandCancel {
	@Test
	public void confirm() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "E:\\Librarys\\chromedriver2.exe");
		WebDriver k = new ChromeDriver();
		k.get("http://qamagnus.jalatechnologies.com");
		k.findElement(By.id("UserName")).sendKeys("mustafamj997@gmail.com");
		k.findElement(By.id("Password")).sendKeys("jalatech");
		k.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		k.findElement(By.linkText("More")).click();
		Thread.sleep(2000);
		k.findElement(By.linkText("Popups")).click();
		Thread.sleep(2000);
		k.findElement(By.id("promptBtn")).click();

		Alert alert = k.switchTo().alert();
		String q = k.switchTo().alert().getText();
		System.out.println(q);
		 alert.dismiss();
		//alert.dismiss();
	}
}
