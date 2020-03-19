package com.turnkey.floowdrive.helper;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Base 
{
	public static DesiredCapabilities cap;
	public static AppiumDriver driver;
	
	public void setDriver() throws MalformedURLException
	{
		cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Galaxy A7 (2018)");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("appPackage", "com.thefloow.thefloowltd.floowdrive.app"); 
	    cap.setCapability("appActivity","com.thefloow.turnkey.ui.launcher.LauncherActivity"); 
//	    cap.setCapability("noSign", true);
	    
	    driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	

	@BeforeMethod
	public void befo() throws MalformedURLException 
	{
		Base base = new Base();
		base.setDriver();
	}
}
