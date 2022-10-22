package stepDefinition;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.retailPageObjects;

public class retailPageStepDefinitions extends Base {
	
	
	retailPageObjects login = new retailPageObjects();
	
	//----------------------step definition for retail login page--------------------------------
    @Given("^User is on Retail website $")
    public void user_is_on_retail_website() throws Throwable {
        login.validateMainPage();
    }
    
    @And("^User click  on MyAccount$")
    public void user_click_on_myaccount() throws Throwable {
        login.clickOnMyAccount();
    }
    
    @When("^User click on Login $")
    public void user_click_on_login() throws Throwable {
        login.clickOnLogInRetailFeatureFirstLogin();
    }
    
    @And("^User enter username ‘userName’ and password 'password’ $")
    public void user_enter_username_username_and_password_password() throws Throwable {
        login.enterUsername();
        login.enterPassword();
    }
    
    @And("^User click on Login button$")
    public void user_click_on_login_button() throws Throwable {
        login.clickLogInButton();
    }
    
    @Then("^User should be logged in to MyAccount dashboard$")
    public void user_should_be_logged_in_to_myaccount_dashboard() throws Throwable {
        
    } 

}
