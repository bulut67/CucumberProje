@urunarama
Feature: Amazon arama
  Background: oncesinde calisacak method (BeforeMethod)
    Given kullanici amazon sayfasina gider

  @amazon
  Scenario: MFB08_kullanici amazonda arama yapar
    Given kullanici amazon sayfasina gider
    Given headphones aramasi yapar
    Then cikan sonucu control eder

    @amazoncamera
    Scenario: MFB01_kullanici amazonda arama yapar
      Given kullanici amazon sayfasina gider
      And  aramakutusuna camera aramasi yapar
      Then  cikan sonucu control eder