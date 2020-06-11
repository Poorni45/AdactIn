package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReUsable {

	public static WebDriver driver;

	public static void openBrowser() {
		WebDriverManager.chromedriver().driverVersion("81").setup();
		driver = new ChromeDriver();
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void type(WebElement e, String s) {
		e.sendKeys(s);

	}

	public static void btnclick(WebElement e) {
		e.click();
	}
	
	public static void selectbytext(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByVisibleText(value);
	}

	public static void printtext(WebElement e) {
		String att = e.getAttribute("value");
		System.out.println(att);
	}

	public static void sleep(long s) throws Exception {
		Thread.sleep(s);

	}


}
