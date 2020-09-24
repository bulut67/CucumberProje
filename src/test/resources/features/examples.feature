
@teknolojikarama
Feature: Amazon Birden Fazla Arama
  Scenario Outline: MFB03_kullanici amazonda urun arar
    Given kullanici amazon sayfasina gider
      And kullanici "<urunler>" aramasi yapar
    Then cikan sonucu control eder

    Examples: Urun Isimleri
    |urunler|
    |headphones|
    |camera    |
    |drone     |
    |pencil    |
    |tv        |