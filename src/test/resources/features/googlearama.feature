Feature: Google Arama
  Scenario: TC01_kullanici googleda arama yapar
    Given kullanici google sayfasina gider
    And techproeducation aramasi yapar
    Then sayfa basligini control eder
