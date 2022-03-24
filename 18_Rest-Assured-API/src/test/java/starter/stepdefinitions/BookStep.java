package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookStep {
    @Given("I set an endpoint for GET book details")
    public void iSetAnEndpointForGETBookDetails() {
    }

    @When("I request GET book details")
    public void iRequestGETBookDetails() {
    }

    @Then("I validate the status code for get book is {int}")
    public void iValidateTheStatusCodeForGetBookIs(int arg0) {
    }

    @And("validate the book detail")
    public void validateTheBookDetail() {
    }
}
