package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String base_url = "https://reqres.in/api/";

    @Step("I set an endpoint for GET detail user")
    public String setAnEndpointForGet(String userId){
        return base_url + "users/" + userId;
    }

    @Step("I request GET detail user")
    public void requestGetDetailUser(String userId, String token){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setAnEndpointForGet(userId));
    }

    @Step("I validate the status code is {int}")
    public void validateStatusCode(int statusCode){
        SerenityRest.then().statusCode(statusCode);
    }

    @Step("validate the data detail")
    public void validateDataDetail(String userId){
        SerenityRest.then().body("userId", equalTo(userId));
        //SerenityRest.then().body("data.email", equalTo("janet.weaver@reqres.in"));
    }
}

//SerenityRest.then().body("data.id", equalTo(2));
//        SerenityRest.then().body("data.email", equalTo("janet.weaver@reqres.in"));