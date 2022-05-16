package demoQa.stepsDefinition;

import demoQa.pages.HomePage;
import demoQa.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {
    @Steps
    LoginPage loginpage;
    @Steps
    HomePage homePage;


    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        loginpage.openUrl();
        loginpage.validateOnHomePage();
    }

    @When("I click login")
    public void iClickLogin() {
        loginpage.clickLoginOnHome();
    }

    @And("I directed to login page")
    public void iDirectedToLoginPage() {
        loginpage.headerMuncul();
        loginpage.headerLoginText();
    }

    @And("I input valid username")
    public void iInputValidUsername() {
        loginpage.inputUsername("aldidi");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginpage.inputPassword("Password1234!");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginpage.clickLoginButton();
    }

    @Then("I directed to homepage")
    public void iDirectedToHomepage() {
        homePage.UnameAppears();
        homePage.unameEqual();
    }

    //Negative case
    @And("I input invalid password")
    public void iInputInvalidPassword() {
        loginpage.inputPassword("asdasdasd");
    }

    @Then("show validation invalid password")
    public void showValidationInvalidPassword() {
        loginpage.errorMessageMuncul();
        loginpage.errorMessageEquals("Invalid username or password!");
    }

    //Login scenario positive
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
    }

    @When("I click new user")
    public void iClickNewUser() {
    }

    @And("I directed to register page")
    public void iDirectedToRegisterPage() {
    }

    @And("I input first name")
    public void iInputFirstName() {
    }

    @And("I input last name")
    public void iInputLastName() {
    }

    @And("I input username regis")
    public void iInputUsernameRegis() {
    }

    @And("I input password regis")
    public void iInputPasswordRegis() {
    }

    @And("I click {string}")
    public void iClick(String arg0) {
    }

    @And("I click register button")
    public void iClickRegisterButton() {
    }

    @And("show alert message")
    public void showAlertMessage() {
    }

    @Then("click ok successfull register")
    public void clickOkSuccessfullRegister() {
    }
}
