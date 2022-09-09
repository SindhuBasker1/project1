package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver=null;
	public static String value;

	public static WebDriver getBrowser(String type) { // GetBrowser -Method

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty(("uesr.dir") + "\\driver1\\chromedriver.exe"));

			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty(("uesr.dir") + "\\Driver\\geckodriver.exe"));

			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void getUrl(String url) { // GetUrl-Method
		driver.get(url);
	}

	public static void clickOnElement(WebElement element) { // ClickonElement- click Method
		element.click();

	}

	public static void inputValueElement(WebElement element, String value) { // inputvalueElement- sendkeys method
		element.sendKeys(value);
	}

	public static void clear(WebElement element) { // Clear_ Method
		element.clear();
	}

	public static void getText(WebElement element) {
		element.getText();
	}

	public static void getAttribute(WebElement element, String value) {
		element.getAttribute(value);

	}

	public static void isDisplayed(WebElement element) {
		element.isDisplayed();
	}

	public static void Enabled(WebElement element) {
		boolean isenabled = element.isEnabled();
		System.out.println(isenabled);

	}

	public static void isSelected(WebElement element) {
		element.isSelected();
	}

	public static WebDriver close() {
		driver.close();
		return driver;
	}

	public static void quit() { // quit
		driver.quit();
	}

	public static WebDriver getTitle() {
		driver.getTitle();
		return driver;
	}

	public static WebDriver getCurrentUrl() {
		driver.getCurrentUrl();
		return driver;
	}
	// Navigation - Method

	public static void navigateTo(String name) {
		driver.navigate().to(name);
	}

	public static WebDriver NavigateBack() {
		driver.navigate();
		return driver;
	}

	public static WebDriver NavigateForward(String url) {
		driver.navigate().to(url);
		;
		return driver;

	}

	public static WebDriver Navigaterefresh() {
		driver.navigate();
		return driver;

	}
	// DropDown -Method

	public static void dropDown(WebElement element, String type, String value) { // element-refname,
																					// type-value,index,vissibtext
																					// ,value-(")

		Select S = new Select(element);

		if (type.equalsIgnoreCase("byValue")) {
			S.selectByValue(value);

		} else if (type.equalsIgnoreCase("byIndex")) {
			int A = Integer.parseInt(value);
			S.selectByIndex(A);
		} else if (type.equalsIgnoreCase("byVissibleText")) {
			S.selectByVisibleText(value);
		}
		if (type.equalsIgnoreCase(value)) {
			S.getAllSelectedOptions();

		} else if (type.equalsIgnoreCase(value)) {
			S.getFirstSelectedOption();

		} else {
			S.deselectAll();

		}
	}

	// Frame
	public static WebDriver Frames(String element, String type) {
		// Frame F= (Frame)

		driver.switchTo().frame(0);
		driver.switchTo().frame("");
		driver.switchTo().frame(element);

		return driver;
	}

	// Action- Mouse Action
	public static WebDriver Actions(WebElement element) {

		Actions A = new Actions(driver);

		A.click(element).build().perform();
		A.contextClick(element).build().perform(); // Right Click
		A.moveToElement(element).build().perform(); // From one element to other element
		A.dragAndDrop(element, element).build().perform();
		A.clickAndHold(element).build().perform();
		A.release(element).build().perform();
		return driver;
	}

	// Robot- keyboard Action
	public static void keyboard() throws AWTException {
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_0);
		r.keyRelease(KeyEvent.VK_0);
	}

	// Windowshandling
	public static void Windowshandling(WebDriver driver) {

		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();

		for (String s : windowHandles) {
			driver.switchTo().window(s);

		}
	}

	// JavascriptExecutor
	public static WebDriver Scroll(WebDriver driver, String string) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoview().WebElementName");
		js.executeScript("window.scroll(0,0)", "");
		js.executeScript("window.scrollBy(0,1000");
		js.executeScript("window.scrollBy(0,-3000");
		js.executeScript("arguments[0].click();webElementname");
		return driver;
	}

	// Wait- Method
	public static void waitLong(int i) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}

	// Alert - Method
	public static WebDriver Alerts(String element, String type) {
		Alert A = driver.switchTo().alert();

		if (type.equalsIgnoreCase(element)) {
			A.accept();
		} else if (type.equalsIgnoreCase(element)) {
			A.dismiss();
		}
		return driver;
	}

	// TakesScreenShot
	public static void TakeScreenShot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Jenes_raj\\eclipse-workspace\\Selenium\\Screenshot" + "\\path");
		FileHandler.copy(source, destination);

	}

}
