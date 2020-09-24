@ebayarama
Feature: Ebay Urun Arama
  Scenario Outline: MFB04_kullanici ebayda arama yapar
    Given kullanici ebay sayfasina gider
    And kullanici "<Urunler>" aramasi yap
    Then cikan sonucu control ed
    Examples: Urun isimleri
    |Urunler|
    |araba       |
    |bebek arabasi|
    |bisiklet     |