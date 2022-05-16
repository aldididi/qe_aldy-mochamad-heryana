package demoQa.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By HomePageUname(){
        return By.xpath("//*[@id=\"userName-value\"]");
    }
    @Step
    public boolean UnameAppears(){
        return $(HomePageUname()).isDisplayed();
    }

    @Step
    public boolean unameEqual(){
        return $(HomePageUname()).getText().equals("aldidi");
    }
}
