package starter.book;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;

public class GetBooks {
    protected static String base_url = "https://demoqa.com/";

    @Step("I set an endpoint for GET book details")
    public String setAnEndPointGet(){
        return base_url + "BookStore/v1/Books";
    }
    @Step("I request GET book details")
    public void reqGetDetailBooks(){
        SerenityRest.given()
                .when()
                .get(setAnEndPointGet());
    }

    @Step("I validate the status code for get book is {int}")
    public void validateStatusCode(int statusCode){
        SerenityRest.then().statusCode(statusCode);
    }

    @Step("validate the book detail")
    public void validateBooksDetails(){
        SerenityRest.then().body("data", equalTo("books") );
    }
}
