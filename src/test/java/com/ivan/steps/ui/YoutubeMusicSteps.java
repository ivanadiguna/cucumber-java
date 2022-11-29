package com.ivan.steps.ui;

import com.ibm.icu.impl.UResource;
import com.ivan.module.ui.YoutubeMusicExplore;
import com.ivan.module.ui.YoutubeMusicHome;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.rest.Ensure;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.steps.ScenarioSteps;
import com.ivan.module.ui.GeneralFunction;
import org.assertj.core.api.Assertions;
import org.jruby.RubyProcess;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class YoutubeMusicSteps extends ScenarioSteps {

    public YoutubeMusicHome youtubeMusicHome;
    public GeneralFunction generalFunction;
    public YoutubeMusicExplore youtubeMusicExplore;
    @Given("open the youtube music")
    public void open_the_youtube_music() {
        // Write code here that turns the phrase above into concrete actions
        generalFunction.openHomePage();
    }

    @When("click explore tab")
    public void click_explore_tab() {
        // Write code here that turns the phrase above into concrete actions
        generalFunction.clickElement(youtubeMusicHome.exploreLink);
    }

    @Then("explore page will be displayed")
    public void explore_page_will_be_displayed() {

        youtubeMusicExplore.newReleaseButton.isVisible();
        youtubeMusicExplore.chartsButton.isVisible();
        youtubeMusicExplore.moodsGenresButton.isVisible();
        String urlActual = generalFunction.getURL();
        Assertions.assertThat(urlActual).matches("https://music.youtube.com/explore");
    }

    @When("click sign in button")
    public void click_sign_in_button() {
        generalFunction.clickElement(youtubeMusicHome.signInButton);
    }

    @When("input username and password")
    public void input_username_and_password() throws InterruptedException {
        generalFunction.fillElement(youtubeMusicHome.emailInput, "ivantestefishery@gmail.com");

        generalFunction.clickElement(youtubeMusicHome.nextEmailButton);
        Thread.sleep(3000);

        generalFunction.fillElement(youtubeMusicHome.passwordInput, "vanivan123!");
    }

    @When("click login button")
    public void click_login_button() {
        generalFunction.clickElement(youtubeMusicHome.nextPasswordButton);
    }

    @Then("account has been logged in")
    public void account_has_been_logged_in() throws InterruptedException {
        //Tidak bisa verify karena perlu autentikasi
        youtubeMusicHome.profileLink.isVisible();
        generalFunction.clickElement(youtubeMusicHome.profileLink);
        youtubeMusicHome.profilePopup.isVisible();
    }
    @When("click search button")
    public void click_search_button() {
        generalFunction.clickElement(youtubeMusicHome.searchLink);
        youtubeMusicHome.searchField.isVisible();

    }

    @When("input value in the search bar")
    public void input_value_in_the_search_bar() {
//        generalFunction.fillElement(youtubeMusicHome.searchField, "Bruno Mars");
//        youtubeMusicHome.searchField.sendKeys(Keys.RETURN);


        youtubeMusicHome.searchField.typeAndEnter("Bruno Mars");
    }

    @Then("searched value will be appear")
    public void searched_value_will_be_appear() {
        String result = youtubeMusicHome.searchResult.getText();
        Assertions.assertThat(result).matches("Bruno Mars");
    }



}
