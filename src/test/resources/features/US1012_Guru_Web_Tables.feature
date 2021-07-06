Feature: US1012_Guru Web Tables olusturun

  Scenario: TC_16_kullanici liste alabilmeli

    Given user "<demo_url>" sayfasinda
    Then Company listesini consola yazdirir
    And DCB Bank'in listede oldugunu test eder