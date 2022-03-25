package user;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String base_url = "https://demoqa.com/Account/v1/";

    @Step("I set an endpoint for GET detail user")
    public String setAnEndpointForGet(String userId){
        return base_url + "User/" + userId;
    }

//    @Step("I request GET detail user")
}
