package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import user.Get;
import net.thucydides.core.annotations.Steps;
import user.GenerateToken;
import user.Get;
import user.Post;

public class UserStep {
    public String userId, token;

    @Steps
    Post post;

    @Steps
    Get get;

    @Steps
    GenerateToken postGenerateToken;

    // create new user
    @Given("I set an endpoint for POST new user")
    public void iSetAnEndpointForPOSTNewUser() {
        post.setPostEndpoint();
    }

    @When("I request POST detail user")
    public void iRequestPOSTDetailUser() {
        post.reqPostDetailUser();
    }

    @Then("I validate the status code is {int}")
    public void iValidateTheStatusCodeIs(int arg0) {
        post.validateStatusCodePostNewUser();
    }

    @And("validate the data detail after create user")
    public void validateTheDataDetailAfterCreateUser() {
        post.validateDataDetail();
    }

    @And("get userId for other request")
    public void getUserIdForOtherRequest() {
        post.getUserId();
    }

    //create new user but exist
    @When("I request POST detail existing user")
    public void iRequestPOSTDetailExistingUser() {
        post.requestPostExistingUser();
    }

    @And("Failed create new user")
    public void failedCreateNewUser(int arg0) {
        post.failedCreateExistUser();
    }

    //generate token
    @Given("I set an endpoint for POST generate token")
    public void iSetAnEndpointForPOSTGenerateToken() {
       postGenerateToken.setEndPointGenerateToken();
    }

    @When("I request POST generate token")
    public void iRequestPOSTGenerateToken() {
        postGenerateToken.reqPostGenerateToken();
    }

    @Then("I validate the status code token is {int}")
    public void iValidateTheStatusCodeTokenIs(int arg0) {
    }

    @And("validate the data detail after generate token")
    public void validateTheDataDetailAfterGenerateToken() {
        postGenerateToken.validateDataDetailToken();
    }

    @And("get token for other request")
    public void getTokenForOtherRequest() {
        this.token=postGenerateToken.getToken();
    }

    //login with invalid password
    @Given("I set an endpoint for POST invalid password")
    public void iSetAnEndpointForPOSTInvalidPassword() {
        post.endPointInvalidPw();
    }

    @When("I request POST detail user with invalid password")
    public void iRequestPOSTDetailUserWithInvalidPassword() {
        post.setInvalidPassword();
    }

    @Then("I validate the status code for invalid pw is {int}")
    public void iValidateTheStatusCodeForInvalidPwIs(int arg0) {
        post.validateFailedLogin();
    }

    @And("validate the data detail after failed login")
    public void validateTheDataDetailAfterFailedLogin() {

    }

    //Delete
    @Given("I set an endpoint for delete")
    public void iSetAnEndpointForDelete() {
    }

    @When("I request delete with userId")
    public void iRequestDeleteWithUserId() {
    }

    @Then("I validate the status code delete is {int}")
    public void iValidateTheStatusCodeDeleteIs(int arg0) {
    }

    @And("validate the delete message")
    public void validateTheDeleteMessage() {
    }

    // delete

}
