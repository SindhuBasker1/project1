package com.runn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.Base_Class;

public class Project  {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\Jenes_raj\\eclipse-workspace\\FilpKart_Project\\FilpKart_Project\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		

	

	}

}
