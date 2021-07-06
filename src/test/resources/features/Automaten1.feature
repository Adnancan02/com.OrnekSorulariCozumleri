#http://automationpractice.com/index.php sayfasina gidelim
#2. Cucumber ile asagidaki testi yapalim
@auto
Feature: US1013_Automation Practice
  Scenario:automationpractice sayfasina gidelim
    Given user "automation_url" sayfasina gider
    And user sign in linkine tiklar
    And user Create and account bölümüne email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrulayin