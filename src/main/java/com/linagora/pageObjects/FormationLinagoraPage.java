package com.linagora.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;


public class FormationLinagoraPage extends Page{

    @FindBy(className="ajax-loader")
    private WebElement spinner;
    
    @FindBy(className="wpcf7-validates-as-email")
    private WebElement emailField;
    
    @FindBy(className="wpcf7-validates-as-required")
    private WebElement nameField;
    
    @FindBy(css="textarea.wpcf7-textarea")
    private WebElement messageField;
    
    @FindBy(css="input.wpcf7-submit")
    private WebElement submitButton;
    
    @FindBy(css="ul>li.active>a")
    private List<WebElement> activeClassLinks;
    
    
    private String email = "237pk68@gmail.com";
    private String name = "leram cesar";
    private String message = "hello";
    
    public void fillEmailField() {
        sendKeys(emailField,email);
        
    }
    
    public void fillNameField(){
        sendKeys(nameField,name);
    }
    
    public void fillMessage() {
        sendKeys(messageField,message);
    }
    
    public void clickOnSubmit() {
        clickOn(submitButton);
    }
    
    public void goToPage(String arg0) {
        get(arg0);
    }
    
    public void scrollToFooter() {
        scroll(3000);
    }
    
    public boolean checkSpinner() {
        
        AtomicReference<WebElement> pageIdentifier = new AtomicReference<>();
        
        waitUntil(ExpectedConditions.attributeToBe(spinner,"visibility","visible"));
    
        Log.info("spinner visibility : "+spinner.getCssValue("visibility"));
    
        activeClassLinks.stream()
                .filter(element -> element.getText()
                        .equalsIgnoreCase("Accueil"))
                .forEach(element -> {
                    System.out.println(element.getText());
                    pageIdentifier.set(element);
                });
        Log.info(pageIdentifier.get().getText());
        try {
            longWait.until(ExpectedConditions.attributeToBe(spinner,"visibility","hidden"));
        }
        catch (Exception e){
            if(longUntil(ExpectedConditions
                    .attributeToBe(spinner,"visibility","visible"))&
                       pageIdentifier.get().getText().equalsIgnoreCase("Accueil"))
            {
        
                return false;
            }
    
        }
        return true;
    }
}
