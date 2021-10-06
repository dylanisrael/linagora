package com.linagora.steps;

import com.linagora.pageObjects.LinToPage;
import io.cucumber.java8.En;
import static org.testng.Assert.*;

public class LinToPageSteps implements En {
    
    public LinToPageSteps(LinToPage linToPage) {
        Then("^Scroll down to the \"([^\"]*)\" section$", (String arg0) -> {
            linToPage.scrollToParteners();
           
        });
        Then("^More visible size of partner company logos$", () -> {
            assertTrue(linToPage.verifySizeOfElementsHasIncreased(),"la taille des elements est inchangée");
        });
    }
}
