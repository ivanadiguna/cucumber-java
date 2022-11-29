package com.ivan.module.ui;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.bcel.generic.Select;
import org.yecht.Data;

public class YoutubeMusicHome extends PageObject {


    //Element
    public @FindBy(xpath = "//yt-formatted-string[contains(.,'Home')]")
    WebElementFacade homeLink;

    public @FindBy(xpath = "//yt-formatted-string[contains(.,'Explore')]")
    WebElementFacade exploreLink;

    public @FindBy(xpath = "//yt-formatted-string[contains(.,'Library')]")
    WebElementFacade libraryLink;

    public @FindBy(xpath = "//yt-formatted-string[contains(.,'Upgrade')]")
    WebElementFacade upgradeLink;

    public @FindBy(xpath = "//tp-yt-iron-icon[@id='icon']/img")
    WebElementFacade profileLink;

    public @FindBy(xpath = "    //*[@id='contentWrapper']/ytd-multi-page-menu-renderer\n")
    WebElementFacade profilePopup;
    public @FindBy(xpath = "//*[@id='right-content']/a")
    WebElementFacade signInButton;

    public @FindBy(name = "Settings")
    WebElementFacade settingButton;

    public @FindBy(name = "Connect to a device")
    WebElementFacade castButton;

    public @FindBy(xpath = "//*[@id='placeholder']")
    WebElementFacade searchLink;

    public @FindBy(xpath = "//*[@placeholder='Search']")
    WebElementFacade searchField;

    public @FindBy(name = "Back")
    WebElementFacade searchBackButton;

    public @FindBy(xpath = "//*[@id='identifierId']")
    WebElementFacade emailInput;

    public @FindBy(xpath = "//*[@id='identifierNext']/div/button/span")
    WebElementFacade nextEmailButton;

    public @FindBy(xpath = "//*[@id='password']/div[1]/div/div[1]/input")
    WebElementFacade passwordInput;

    public @FindBy(xpath = "//*[@id='passwordNext']")
    WebElementFacade nextPasswordButton;

    public @FindBy(xpath = "//*[@id='contents']/ytmusic-responsive-list-item-renderer/div[2]/div[1]/yt-formatted-string\n")
    WebElementFacade searchResult;
}
