package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.homePage;
import util.DriverFactory;

public class homePageStep {

    homePage homepages=new homePage(DriverFactory.getDriver());
    @Given("Enes is on Home page")
    public void enesIsOnHomePage() {
        homepages.checkHome();

    }

    @When("click {string} card in the top rigt")
    public void clickCardInTheTopRigt(String arg0) {
        homepages.clickCard();

    }

    @Then("should see Login Page")
    public void shouldSeeLoginPage() {
        homepages.checkLoginPage();

    }





}
