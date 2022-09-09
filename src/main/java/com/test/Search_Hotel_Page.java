package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Hotel_Page {

	public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement Loc ;
	
	@FindBy(id = "hotels")
	private WebElement Hotel ;
	
	@FindBy(id = "room_type")
	private WebElement Room ;
	
	@FindBy(id = "room_nos")
	private WebElement Room_Num ;
	
	@FindBy(id = "datepick_in")
	private WebElement Date ;
	
	@FindBy(id = "datepick_out")
	private WebElement COD ;
	
	@FindBy(id = "adult_room")
	private  WebElement Adu_Room ;
	
	@FindBy(id = "child_room")
	private  WebElement Child_Room ;
	
	@FindBy(id = "Submit")
	private  WebElement Sub ;
	
	
	
	
}
