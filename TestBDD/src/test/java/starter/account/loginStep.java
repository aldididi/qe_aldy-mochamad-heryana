package starter.account;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStep {
    @Given("I go to login page")
    public void iGoToLoginPage() {
        System.out.println("im in login page");
    }

    @When("I input valid uname and valid password")
    public void iInputValidUnameAndValidPW(){
        System.out.println("input uname");
        System.out.println("input password");
    }

    @And("click login button")
    public void click_login_button(){
        System.out.println("click login button");
    }


    @Then("I go to homepage")
    public void iGoToHomepage() {
        System.out.println("go to homepage");
    }

    @When("I input null uname and valid password")
    public void iInputNullUnameAndValidPassword() {
    }

    @Then("Get eror message")
    public void getErorMessage() {
    }
}
