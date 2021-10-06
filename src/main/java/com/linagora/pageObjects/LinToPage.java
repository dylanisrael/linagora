package com.linagora.pageObjects;

import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LinToPage extends Page{
    
    @FindBy(css = ".flickity-slider>li")
    private List <WebElement> partenerView;
    
    public void scrollToParteners() {
        scrollTo(partenerView.get(1));
    }
    public boolean verifySizeOfElementsHasIncreased(){
        Rectangle size =getElementSize(partenerView.get(1));
        int currentHeight = 33;
        int currentWidth = 277;
        Log.info("la taille precedente des icones des partenaire est de {}x{}",size.getHeight(),size.getWidth());
        Log.info("la taille actuelle des icones des partenaire est de {}x{}",size.getHeight(),size.getWidth());
        if(currentWidth != size.getWidth()){
            Log.info("la recommandation a ete prise en compte");
            return true;
        }
        return false;
    }
    
}
