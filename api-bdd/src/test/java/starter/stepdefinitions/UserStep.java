package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStep {
    @Given("I set an endpoint for GET user detail")
    public void iSetAnEndpointForGETUserDetail() {

    }

    @When("I request GET detail user")
    public void iRequestGETDetailUser() {
    }

    @Then("I validate the status code is {int}")
    public void iValidateTheStatusCodeIs(int arg0) {
    }

    @And("validate the data detail")
    public void validateTheDataDetail() {
    }

    @Given("I set an endpoint for POST new user")
    public void iSetAnEndpointForPOSTNewUser() {
    }

    @When("I request POST detail user")
    public void iRequestPOSTDetailUser() {
    }

    @And("validate the data detail after create user")
    public void validateTheDataDetailAfterCreateUser() {
    }


}
