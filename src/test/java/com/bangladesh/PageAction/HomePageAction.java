package com.bangladesh.PageAction;

import org.testng.Assert;

import com.bangladesh.PageLocator.HomePageLocator;
import com.bangladesh.Util.TestBase_BD;
import com.bangladesh.Util.TestData;

public class HomePageAction extends TestBase_BD
{
	 HomePageLocator  homePageLocator = new  HomePageLocator();
	
	public void EnterXPSinSearchField() 
	{
		 homePageLocator.searchfield.sendKeys(TestData.laptop);
		
	}
	public void ClickonSearchLink() 
	{
		 homePageLocator.searchlink.click();
		
	}
	public void Verifysearchresultdisplay()
{
		 boolean searchresult = homePageLocator.verifysearchresult.isDisplayed();	
		Assert.assertTrue(searchresult);
}
	public void ClickonSigninbutton() 
	{
		 homePageLocator.signinbutton.click();
		
	}
	public void  ClickSigninlink() 
	{
		 homePageLocator.signinlink.click();
		
	}
	

}
