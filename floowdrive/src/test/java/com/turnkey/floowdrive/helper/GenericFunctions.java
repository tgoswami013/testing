package com.turnkey.floowdrive.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class GenericFunctions extends Base
{
	public void scrollBy(AppiumDriver driver, int x, int y) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.thefloow.thefloowltd.floowdrive.app:id/register_email_address")));
		TouchAction action = new TouchAction(driver);	
		Dimension size = driver.manage().window().getSize();	
		int endX = (size.width * x)/100;
		int endY = (size.height * y)/100;
		action.press(PointOption.point(endX, size.height-10))
		.moveTo(PointOption.point(0, 0))
		.release()
		.perform();
	}

}
