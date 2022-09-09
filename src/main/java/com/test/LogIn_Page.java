package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Page {
	
		
		public static WebDriver driver;
		
		@FindBy(id = "username")
		private WebElement User_Name ;
		
		
		@FindBy(id = "password")
		private WebElement Pass ;

		
		@FindBy(id = "login")
		private WebElement Login ;
		
		public  LogIn_Page(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		public WebElement getUesrName() {
			return User_Name;
		}
		
		
		public WebElement getPassword() {
			return Pass ;
		}
		

	}
