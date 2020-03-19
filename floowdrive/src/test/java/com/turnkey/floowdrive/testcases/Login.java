package com.turnkey.floowdrive.testcases;

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
	public void login() throws InterruptedException
	{
		generic.scrollBy(driver, 99,99);	
		Thread.sleep(5000);
		
	}

}
