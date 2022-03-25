package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BooksStep {
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

    @Given("I set an endpoint for GET book details with isbn")
    public void iSetAnEndpointForGETBookDetailsWithIsbn() {
    }

    @When("I input ISBN book")
    public void iInputISBNBook() {
    }

    @When("I request GET for book details")
    public void iRequestGETForBookDetails() {
    }

    @Then("I validate the status code for get book details is {int}")
    public void iValidateTheStatusCodeForGetBookDetailsIs(int arg0) {
    }

    @And("validate the book details")
    public void validateTheBookDetails() {
    }
}
