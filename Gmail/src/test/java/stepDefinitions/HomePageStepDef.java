package stepDefinitions;

import com.gmail.base.Base;
import com.gmail.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef extends Base{
	
	HomePage homePage = new HomePage();
	boolean result = false;
	    
    @Given("^User login into gmail$")
    public void user_login_into_gmail() {
        result = homePage.loginToGmail();
    }
    
    @When("^User clicks on Compose$")
    public void user_clicks_on_compose() {
        result = homePage.clickOnCompose();
    }

    @Then("^Compose message window should be displayed$")
    public void compose_message_window_is_displayed() {
        result = homePage.isDisplayedComposeMessage();
    }

    @And("^User adds attachment$")
    public void user_adds_attachment(){
        result = homePage.addAttachment();
    }
}
