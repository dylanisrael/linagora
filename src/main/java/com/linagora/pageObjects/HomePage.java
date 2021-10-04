package com.linagora.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class HomePage extends Page {
    
    
    public HomePage() {
    }
    
    private final String HOME_PAGE_URL = env;
    
    public void goToHomePage() {
        get(HOME_PAGE_URL);
    }
}
