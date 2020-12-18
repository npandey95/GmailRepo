package com.gmail.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.gmail.browsers.ChromeBrowser;
import com.gmail.browsers.EdgeBrowser;
import com.gmail.browsers.FireFoxBrowser;
import com.gmail.browsers.IEBrowser;
import com.gmail.utils.ConfigurationFileReader;

public class Base {

	public static WebDriver driver;
	public static ConfigurationFileReader reader;

	public static final String CHROME = "chrome";
	public static final String FIREFOX = "firefox";
	public static final String IE = "ie";
	public static final String EDGE = "edge";

	public static void initializeBrowser() {
		switch (Base.reader.getBrowser()) {
		case CHROME:
			ChromeBrowser.initializeChromeBrowser();
			break;
		case FIREFOX:
			FireFoxBrowser.initializeFireFoxBrowser();
			break;
		case IE:
			IEBrowser.initializeIEBrowser();
			break;
		case EDGE:
			EdgeBrowser.initializeEdgeBrowser();
			break;
		default:
			System.out.println("No browser selected");
		}
		Base.driver.manage().window().maximize();
		Base.driver.manage().deleteAllCookies();
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Base.driver.get(reader.getURL());
	}
	
	public static void quitBrowser() {
		Base.driver.quit();
	}
}