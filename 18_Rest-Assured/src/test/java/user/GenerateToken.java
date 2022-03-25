package user;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import org.omg.CORBA.PUBLIC_MEMBER;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GenerateToken {
    private static String base_url = "https://demoqa.com/Account/v1/";

    @Step("I set an endpoint for POST generate token")
    public String setEndPointGenerateToken(){
        return base_url + "GenerateToken";
    }

    @Step("I request POST generate token")
    public void reqPostGenerateToken(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "aldidi1");
        requestData.put("password", "Admin1234!");

        given().header("Content-type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setEndPointGenerateToken());
    }

    @Step("validate the data detail after generate token")
    public void validateDataDetailToken(){
        then().body("result", equalTo("User authorized successfully."));
    }

    @Step("get token for other request")
    public String getToken(){
        Response response = SerenityRest.lastResponse();
        String token = response.body().path("token");
        System.out.println(token);
        return token;
    }
}
