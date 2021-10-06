package com.linagora.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class HomePage extends Page {
    
    @FindBy(linkText = "LinTO")
    private WebElement linToLink;
    
    @FindBy(linkText = "Comment contribuer?")
    private WebElement commentContribuerLink;
    
    public HomePage() {
    }
    
    private final String HOME_PAGE_URL = env;
    
    public void goToHomePage() {
        get(HOME_PAGE_URL);
    }
    
    public void clickOnLinTo(){
        clickOn(linToLink);
    }
    
    public void commentContribuerLink(){
        clickOn(commentContribuerLink);
    }
}
