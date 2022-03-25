package user;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    private static String base_url = "https://demoqa.com/Account/v1/";

    // create new user
    @Step("I set an endpoint for POST new user")
    public String setPostEndpoint(){
        return base_url + "User";
    }

    @Step("I request POST detail user")
    public void reqPostDetailUser(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "aldidi18");
        requestData.put("password", "Admin1234!");

        SerenityRest.given().header("Content-Type", "application/json") .contentType(ContentType.JSON)
                .body(requestData.toJSONString());
        SerenityRest.when().post(setPostEndpoint());
    }

    @Step("validate the status code 201")
    public void validateStatusCodePostNewUser(){
        then().statusCode(201);
    }
//    public void validateStatusCodePostNewUser(){
//        then().body("code", equalTo("201"));
//    }

    @Step("validate the data detail after create user")
    public void validateDataDetail(){
        SerenityRest.then().body("username", equalTo("aldidi18"));
    }

    @Step("Get userId from the response")
    public String getUserId(){
        Response response = SerenityRest.lastResponse();
        String userId = response.body().path("userID");
        System.out.println(userId);
        return  userId;
    }

    //create new user but exist
    @Step("I request POST detail existing user")
    public void requestPostExistingUser(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "aldidi9");
        requestData.put("password", "Admin1234!");

        SerenityRest.given().header("Content-Type", "application/json") .contentType(ContentType.JSON)
                .body(requestData.toJSONString());
        SerenityRest.when().post(setPostEndpoint());
    }

    @Step("Failed create new user")
    public void failedCreateExistUser(){
        then().body("code", equalTo("1204"));
    }

    //login with invalid password
    @Step("I set an endpoint for POST invalid password")
    public String endPointInvalidPw(){
        return base_url + "Authorized";
    }

    @Step("I request POST detail user with invalid password")
    public void setInvalidPassword(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "aldidi9");
        requestData.put("password", "password");

        SerenityRest.given().header("Content-Type", "application/json")
                .body(requestData.toJSONString());
        SerenityRest.when().post(setPostEndpoint());
    }

    @Step("validate the data detail after failed login")
    public void validateFailedLogin(){
        then().body("code", equalTo("1300"));
    }
}
