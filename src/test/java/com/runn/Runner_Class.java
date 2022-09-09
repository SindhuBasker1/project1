package com.runn;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.test.Base_Class;

public class Runner_Class extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		driver =getBrowser("chrome");

		getUrl("https://adactinhotelapp.com/");

		WebElement User_Name = driver.findElement(By.id("username"));
		clickOnElement(User_Name);
		inputValueElement(User_Name, "sindhushanu");

		WebElement Pass = driver.findElement(By.id("password"));
		clickOnElement(Pass);
		inputValueElement(Pass, "OAM4D2");

		WebElement Login = driver.findElement(By.id("login"));
		clickOnElement(Login);

		WebElement Loc = driver.findElement(By.id("location"));
		clickOnElement(Loc);
		dropDown(Loc, "byVissibleText", "London");

		WebElement Hotel = driver.findElement(By.id("hotels"));
		clickOnElement(Hotel);
		dropDown(Hotel, "byVisibleText", "Hotel Sunshine");

		WebElement Room = driver.findElement(By.id("room_type"));
		clickOnElement(Room);
		dropDown(Room, "byVisibleText", "Standard");

		WebElement Room_Num = driver.findElement(By.id("room_nos"));
		clickOnElement(Room_Num);
		dropDown(Room_Num, "byValue", "2");

		WebElement Date = driver.findElement(By.id("datepick_in"));
		clickOnElement(Date);
		clear(Date);
		inputValueElement(Date, "25/3/2022");

		WebElement COD = driver.findElement(By.id("datepick_out"));
		clickOnElement(COD);
		clear(COD);
		inputValueElement(COD, "26/3/2022");

		WebElement Adu_Room = driver.findElement(By.id("adult_room"));
		clickOnElement(Adu_Room);
		clear(Adu_Room);
		dropDown(Adu_Room, "byValue", "2");

		WebElement Child_Room = driver.findElement(By.id("child_room"));
		clickOnElement(Child_Room);
		clear(Child_Room);
		dropDown(Child_Room, "byValue", "1");

		WebElement Sub = driver.findElement(By.id("Submit"));
		clickOnElement(Sub);

		WebElement Sel = driver.findElement(By.id("radiobutton_0"));
		clickOnElement(Sel);

		WebElement Conti = driver.findElement(By.id("continue"));
		clickOnElement(Conti);

		WebElement FName = driver.findElement(By.id("first_name"));
		clickOnElement(FName);
		inputValueElement(FName, "SINDHU");

		WebElement lName = driver.findElement(By.id("last_name"));
		clickOnElement(lName);
		inputValueElement(lName, "BASKER");

		WebElement Add = driver.findElement(By.id("address"));
		clickOnElement(Add);
		inputValueElement(Add, "7/312,MainRoad,Kaval");

		WebElement Ccnum = driver.findElement(By.id("cc_num"));
		clickOnElement(Ccnum);
		inputValueElement(Ccnum, "1234 5678 9012 6789");

		WebElement cctype = driver.findElement(By.id("cc_type"));
		clickOnElement(cctype);
		dropDown(cctype, "byValue", "VISA");

		WebElement CC_month = driver.findElement(By.id("cc_exp_month"));
		clickOnElement(CC_month);
		dropDown(CC_month, "byValue", "6");

		WebElement Cc_Y = driver.findElement(By.id("cc_exp_year"));
		clickOnElement(Cc_Y);
		dropDown(Cc_Y, "byValue", "2022");

		WebElement Ccv = driver.findElement(By.id("cc_cvv"));
		clickOnElement(Ccv);
		inputValueElement(Ccv, "3029");

		WebElement Book_No = driver.findElement(By.id("book_now"));
		clickOnElement(Book_No);

		WebElement Log_Out = driver.findElement(By.xpath("//a[text()='Logout']"));
		clickOnElement(Log_Out);

		Thread.sleep(6000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Jenes_raj\\eclipse-workspace\\Selenium\\Screenshot\\name4.png");
		FileHandler.copy(Source, destination);

	}

}
