package com.ivan.module.ui;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class YoutubeMusicExplore extends PageObject {

    public @FindBy(xpath = "//yt-formatted-string[contains(.,'Home')]")
    WebElementFacade homeLink;
    public @FindBy(name = "New releases")
    WebElementFacade newReleaseButton;
    public @FindBy(name = "Charts")
    WebElementFacade chartsButton;
    public @FindBy(name = "Moods & genres")
    WebElementFacade moodsGenresButton;
    public @FindBy(name = "New albums & singles")
    WebElementFacade newAlbumsSingleButton;
    public @FindBy(name = "Trending")
    WebElementFacade trendingButton;
    public @FindBy(name = "New music videos")
    WebElementFacade newMusicVideosButton;
    public @FindBy(xpath = "//yt-formatted-string[contains(.,'Explore')]")
    WebElementFacade exploreLink;

}
