package starter.book;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class createUserBook {
    protected static String base_url = "https://demoqa.com/";
    @Step("I set endpoint for create user")
    public String setEndPointCreateUser(){
        return base_url + "Account/v1/User";
    }
    @Step("set username and password")
    public void setUnameAndPassword(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "aldidi");
        requestData.put("password", "Admin1234!");

        given()
                .header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setEndPointCreateUser());
    }

    @Step("VALIDATE create user")
    public void validateCreateUser(){
        SerenityRest.then().body("code", equalTo(201));
    }
}

