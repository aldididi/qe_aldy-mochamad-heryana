package demoQa.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenAt;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By loginOnHome(){
        return By.id("login");
    }

    private By loginPage(){
          return By.id("login");
    }

    private By loginHeader() {
        return By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    }

    private  By errorMessage(){
        return By.xpath("//*[@id=\"name\"]");
    }

//    private By HalamanLogin(){
//        return By.id("");
//    }

    private By usernameField(){
        return By.id("userName");
    }

    private By passwordField(){
        return By.id("password");
    }

    private By loginButton(){
        return By.id("login");
    }

//    @Step
//    public void openUrl(){
//        //Open.relativeUrl("books")
//    }
//    @Step
//    public static OpenUrl url(String targetUrl) {
//        return new OpenUrl(targetUrl);
//    }

    @Step
    public void openUrl(){
        //openUrl("https://demoqa.com/books/");
        openAt("/books");
    }

    @Step
    public boolean validateOnHomePage(){
        return $(loginOnHome()).isDisplayed();
    }

    @Step
    public void clickLoginOnHome(){
        $(loginOnHome()).click();
    }

    @Step
    public boolean headerMuncul(){
        return $(loginHeader()).isDisplayed();
    }

    @Step
    public boolean headerLoginText(){
        return $(loginHeader()).getText().equals("Login");
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(loginPage()).isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step
    public boolean errorMessageMuncul(){
        return $(errorMessage()).isDisplayed();
    }
    @Step
    public boolean errorMessageEquals(String text){
        return $(errorMessage()).getText().equals(text);
    }


}
