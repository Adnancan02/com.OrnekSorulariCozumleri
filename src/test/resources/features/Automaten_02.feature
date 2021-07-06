Feature: US1014_Automation Practice
  Scenario:automationpractice sayfasina gidelim

    Given  user "automation_url" sayfasina gider
    And user sign in linkine tiklar
    And email kutusuna @isareti olmayan email adresi yazar
    And enter'a tiklar
    Then error mesajinin “Invalid email address” oldugunu dogrulayin