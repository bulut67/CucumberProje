@urunarama1 @AMAZON

Feature: Amazon Urun Arama
  Scenario: MFB02_kullanici amazonda urun aramasi yapar
    Given kullanici amazon sayfasina gider
    And kullanici "drone" aramasi yapar
    Then cikan sonucu control eder
