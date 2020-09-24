@birdenfazlaexample @amazon
  Feature: Amazonda Urun Arama
    Scenario Outline: MFB07_kullanici amazonda dropdown ve aramakutusu kullanarak arama yapar
      Given kullanici amazon sayfasina gider
      And kullanici dropdownda "<kategori>" secer
      And     kullanici "<urunler>" aramasi yapar
      Then cikan sonucu control eder
      Examples:
        | kategori | urunler |
        |Automotive|phone holder         |
        |Baby      |stroller           |
      |Books     |Miserables         |
