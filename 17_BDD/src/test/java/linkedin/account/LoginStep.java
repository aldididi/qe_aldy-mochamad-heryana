package linkedin.account;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    @Given("I go to login page")
    public void iGoToLoginPage() {
        System.out.println("im in login page");
    }

    @When("I input valid email and valid password")
    public void iInputValidEmailAndValidPassword() {
        System.out.println("input valid email and invalid password");
    }

    @And("click login button")
    public void clickLoginButton() {
        System.out.println("click login button");
    }

    @Then("I directed to homepage")
    public void iDirectedToHomepage() {
        System.out.println("directed to homepage");
    }

    @When("I input valid email and wrong password")
    public void iInputValidEmailAndWrongPassword() {
        System.out.println("input invalid email and wrong password");
    }

    @Then("get error message wrong password")
    public void getErrorMessageWrongPassword() {
    }

    @When("I input wrong email and valid password")
    public void iInputWrongEmailAndValidPassword() {
    }
}
