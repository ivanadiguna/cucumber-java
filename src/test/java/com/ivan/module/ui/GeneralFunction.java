package com.ivan.module.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;


public class GeneralFunction extends PageObject {

    public void openHomePage() {
        openUrl("https://music.youtube.com/");
    }

    public void clickElement(WebElementFacade element){
        element.click();
    }

    public void fillElement(WebElementFacade element, String text){
        element.type(text);

    }


    public String getURL(){
        WebDriver webDriver = getDriver();
        String url = webDriver.getCurrentUrl();
        return url;

    }


}
