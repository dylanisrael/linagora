package com.linagora.steps;

import com.linagora.pageObjects.FormationLinagoraPage;
import io.cucumber.java8.En;

import static org.testng.Assert.assertTrue;

public class FormationLingoraSteps implements En {
    public FormationLingoraSteps(FormationLinagoraPage formationLinagoraPage) {
        Given("^Go to \"([^\"]*)\"$", (String arg0) -> {
            formationLinagoraPage.goToPage(arg0);
        });
        When("^Scroll down to the footer$", () -> {
            formationLinagoraPage.scrollToFooter();
        });
        And("^Fill in the form in the \"([^\"]*)\" section and click on \"([^\"]*)\"\\.$", (String arg0, String arg1) -> {
            formationLinagoraPage.fillEmailField();
            formationLinagoraPage.fillNameField();
            formationLinagoraPage.fillMessage();
            formationLinagoraPage.clickOnSubmit();
        });
        Then("^Sending the form successfully after filling in the data$", () -> {
            assertTrue(formationLinagoraPage.checkSpinner());
        });
    }
}
