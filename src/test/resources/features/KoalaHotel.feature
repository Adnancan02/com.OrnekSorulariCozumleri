Feature: US1001Koala Hotel

  Scenario Outline:Koala Hotel Testi
    Given Login tusuna basin
    Then "<kullanici_adi>" adi ve "<sifreyi>" deneyin ve login olmadigini test edin


    Examples:
      | kullanici_adi | sifreyi |
      | Manager1       | Manager1|
      | Manager2       | Manager2 |
      | Manager3       | Manager3 |
      | Manager4       | Manager4 |