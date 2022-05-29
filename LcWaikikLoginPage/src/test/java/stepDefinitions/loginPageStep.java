package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;
import util.DriverFactory;

public class loginPageStep {

    loginPage loginpage=new loginPage(DriverFactory.getDriver());
    @Given("Enes is on Login Page")
    public void enesIsOnLoginPage() {
        loginpage.checkLoginPage();
    }

    @When("click {string} radio button")
    public void clickRadioButton(String arg0) {
        loginpage.clickRadiobtn(arg0);

    }

    @Then("should see {string} title")
    public void shouldSeeTitle(String arg0) {
        loginpage.checkTitle(arg0);

    }

    @Then("should see {string} radio button")
    public void shouldSeeRadioButton(String arg0) {
        loginpage.checkRadiobtn(arg0);

    }

    @Then("should see {string} text on Email")
    public void shouldSeeTextOnEmail(String arg0) {
        loginpage.checkMail(arg0);
    }

    @Then("should see {string} text on Password")
    public void shouldSeeTextOnPassword(String arg0) {
        loginpage.checkPassword(arg0);
    }

    @Then("should see Show Password Icon")
    public void shouldSeeShowPasswordIcon() {
        loginpage.checkShowPassword();
    }

    @Then("should see {string} remember me")
    public void shouldSeeRememberMe(String arg0) {
        loginpage.checkRemember(arg0);
    }

    @Then("should see {string} forgot password")
    public void shouldSeeForgotPassword(String arg0) {
        loginpage.checkForgetPassword(arg0);
    }

    @Then("should see {string} login button")
    public void shouldSeeLoginButton(String arg0) {
        loginpage.checkLoginbtn(arg0);
    }

    @Then("should see Phone Text Box")
    public void shouldSeePhoneTextBox() {
        loginpage.checkPhoneText();
    }

    @When("click login button")
    public void clickLoginButton() {
        loginpage.clickLoginbtn();
    }

    @Then("should see {string} Email Empty message")
    public void shouldSeeEmailEmptyMessage(String arg0) {
        loginpage.checkEmailEmptymessage(arg0);
    }

    @Then("should see {string} Password Empty message")
    public void shouldSeePasswordEmptyMessage(String arg0) {
        loginpage.checkPasswordEmptyMassage(arg0);
    }

    @When("type Email {string}")
    public void typeEmail(String arg0) {
        loginpage.enterEmail(arg0);
    }

    @Then("should not see Email Empty message")
    public void shouldNotSeeEmailEmptyMessage() {
        loginpage.checkNotEmailEmptyMassage();
    }

    @When("type Password {string}")
    public void typePassword(String arg0) {
        loginpage.enterPassword(arg0);
    }

    @Then("should not see Password Empty message")
    public void shouldNotSeePasswordEmptyMessage() {
        loginpage.checkNotPasswordEmptyMassage();
    }

    @When("type Email {string} and click login")
    public void typeEmailAndClickLogin(String arg0) {
        loginpage.enterEmailClick(arg0);
    }

    @Then("should see {string} Email False message")
    public void shouldSeeEmailFalseMessage(String arg0) {
        loginpage.emailFalseMassage(arg0);
    }

    @When("type Email {string}, Password {string} and click login")
    public void typeEmailPasswordAndClickLogin(String arg0, String arg1) {
        loginpage.enterEmailAndPasswordClick(arg0,arg1);    }

    @Then("should see {string} Login Error message")
    public void shouldSeeLoginErrorMessage(String arg0) {
        loginpage.checkLoginErorMassage(arg0);
    }
}
