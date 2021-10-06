package com.linagora.steps;

import com.linagora.pageObjects.HomePage;
import io.cucumber.java8.En;

public class HomePageSteps implements En {
    
    public HomePageSteps(HomePage homePage) {
        
        Given("^Go to home page$", homePage::goToHomePage);
        
        When("^Click on \"([^\"]*)\" in the \"([^\"]*)\" section of the footer$", (String arg0, String arg1) -> {
            homePage.clickOnLinTo();
        });
    }
}
