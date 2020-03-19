package com.turnkey.floowdrive.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.turnkey.floowdrive.helper.Base;
import com.turnkey.floowdrive.helper.GenericFunctions;
import com.turnkey.floowdrive.pagemodules.LoginModule;

public class Login extends Base
{
	GenericFunctions generic;
	LoginModule logMod;

	
	@BeforeMethod
	public void befMethod()
	{
		logMod = new LoginModule(driver);
		generic = new GenericFunctions();
	}
	
	@Test
	public void Login() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.thefloow.thefloowltd.floowdrive.app:id/register_email_address")));
		generic.scrollBy(driver, 99,99);	
		Thread.sleep(5000);
		
	}

}
