@MajorAbnormalities
@severity=critical
Feature: Anomalies Majeures

  @Bug1749
  Scenario: Infinite loading
    Given Go to "https://formation.linagora.com/"
    When Scroll down to the footer
    And Fill in the form in the "Contact Us" section and click on "Send".
    Then Sending the form successfully after filling in the data











