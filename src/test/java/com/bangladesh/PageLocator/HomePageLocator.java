package com.bangladesh.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bangladesh.Util.TestBase_BD;

public class HomePageLocator extends TestBase_BD
{
public HomePageLocator () 
{
	PageFactory.initElements(driver,this);
}
@FindBy(how=How.XPATH, using="//input[@class='mh-search-input']")
public WebElement searchfield;

@FindBy(how=How.XPATH, using="//span[@class='mh-search-button-label']")
public WebElement searchlink;

@FindBy(how=How.XPATH, using="//h2[@class='direct-content__title']")
public WebElement verifysearchresult;

@FindBy(how=How.XPATH, using="//span[text()='Sign In']")
public WebElement signinbutton;

@FindBy(how=How.LINK_TEXT, using="Sign In")
public WebElement signinlink;

@FindBy(how=How.XPATH, using="")
public WebElement search;

}