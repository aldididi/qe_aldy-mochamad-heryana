package starter.book;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;

public class GetBookFromISBN {
    protected static String base_url = "https://demoqa.com/";
    @Step("I set an endpoint for GET book details with isbn")
    public String setAndEndPointGetIsbn(){
        return base_url + "BookStore/v1/Book?ISBN=9781449325862";
    }

    @Step("I request GET for book details")
    public void reqGetDetailsBookISBN(){
        SerenityRest.given()
                .when()
                .get(setAndEndPointGetIsbn());
    }

    @Step("I validate the status code for get book details is {int}")
    public void validateStatusCodeBookISBN(int statusCode){
        SerenityRest.then().statusCode(statusCode);
    }

    @Step("validate the book details")
    public void validateBookDetailsISBN(){
    SerenityRest.then().body("data.isbn", equalTo("9781449325862"));
    }
}
