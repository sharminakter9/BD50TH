package stepDeffBD;

import com.bangladesh.PageAction.HomePageAction;
import com.bangladesh.PageAction.LoginPageAction;
import com.bangladesh.Util.TestBase_BD;
import com.bangladesh.Util.Utill;

import cucumber.api.java.en.Then;

public class StepDeffLoginPage extends TestBase_BD 
{
	HomePageAction	homePageAction = new HomePageAction();
	LoginPageAction loginPageAction = new LoginPageAction();
	

@Then("^Click on Signinbutton$")
public void click_on_Signinbutton() throws Throwable {
	homePageAction.ClickonSigninbutton();
}

@Then("^Click Signinlink$")
public void click_Signinlink() throws Throwable {
	homePageAction.ClickSigninlink();
}

@Then("^Enter user pass and click signin$")
public void Enter_user_pass_and_click_signin() throws Throwable {
	loginPageAction.usercard(prop.getProperty("user1name"), prop.getProperty("user1pass"));
}

@Then("^Verify user can login$")
public void verify_user_can_login() throws Throwable {
	
	 Utill.takescreenshot(driver, "user profile page");
}


}
