@walmart
  Feature: Walmart Urun Arama
    Scenario Outline: MFB04_kullanici ebayda arama yapar
  Given kullanici walmart sayfasina gider
  And kullanici "<Urunler>" aramasi yapariz
  Then cikan sonucu control ederiz
  Examples: Urun isimleri
  |Urunler|
  |chair       |
  |car seat|
