package demoQa.pages;

import net.thucydides.core.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage  extends PageObject {
//    @Step
//    public void openUrl(){
//        //openUrl("https://demoqa.com/login/");
//        openAt()
//    }

    private By loginPage(){
        return By.id("login");
    }
    private By loginHeader() {
        return By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    }
    private By newUserButton() { return  By.id("newUser"); }

    @Step
    public void openUrl(){
        openAt("/login");
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(loginPage()).isDisplayed();
    }

    @Step
    public void clickNewUser(){
       $(newUserButton()).click();
    }
}
