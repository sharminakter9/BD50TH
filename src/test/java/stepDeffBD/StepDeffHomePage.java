package stepDeffBD;

import org.apache.log4j.Logger;

import com.bangladesh.PageAction.HomePageAction;
import com.bangladesh.Util.LogsHelper_log;
import com.bangladesh.Util.TestBase_BD;
import com.bangladesh.Util.Utill;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDeffHomePage extends TestBase_BD{

	HomePageAction	homePageAction = new HomePageAction();
	Logger log =LogsHelper_log.getLogs(LogsHelper_log.class );
	


@Given("^Open Application \"([^\"]*)\"$")
public void open_Application(String URL) throws Throwable {
	
   launchApplication(URL);
   Utill.takescreenshot(driver, "Home Page");
   // opening browser
   log.info("opening URL");
}

@Then("^Enter XPS in SearchField$")
public void enter_XPS_in_SearchField() throws Throwable {
	homePageAction.EnterXPSinSearchField();
	  log.info("Entering product");
}

@Then("^Click on SearchLink$")
public void click_on_SearchLink() throws Throwable {
	homePageAction.ClickonSearchLink();
	  log.info("Clicking searchLink");
}

@Then("^Verify search result display$")
public void verify_search_result_display() throws Throwable {
	homePageAction.Verifysearchresultdisplay();
	 Utill.takescreenshot(driver, "search result page"); 
	  log.info("Result page ");
}


}



