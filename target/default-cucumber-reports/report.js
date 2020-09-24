$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/walmart.feature");
formatter.feature({
  "name": "Walmart Urun Arama",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@walmart"
    }
  ]
});
formatter.scenarioOutline({
  "name": "MFB04_kullanici ebayda arama yapar",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "kullanici walmart sayfasina gider",
  "keyword": "Given "
});
formatter.step({
  "name": "kullanici \"\u003cUrunler\u003e\" aramasi yapariz",
  "keyword": "And "
});
formatter.step({
  "name": "cikan sonucu control ederiz",
  "keyword": "Then "
});
formatter.examples({
  "name": "Urun isimleri",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Urunler"
      ]
    },
    {
      "cells": [
        "chair"
      ]
    },
    {
      "cells": [
        "car seat"
      ]
    }
  ]
});
formatter.scenario({
  "name": "MFB04_kullanici ebayda arama yapar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@walmart"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici walmart sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.WalmartStepDefinitions.kullanici_walmart_sayfasina_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici \"chair\" aramasi yapariz",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.WalmartStepDefinitions.kullanici_aramasi_yapariz(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cikan sonucu control ederiz",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.WalmartStepDefinitions.cikan_sonucu_control_ederiz()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "MFB04_kullanici ebayda arama yapar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@walmart"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici walmart sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.WalmartStepDefinitions.kullanici_walmart_sayfasina_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici \"car seat\" aramasi yapariz",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.WalmartStepDefinitions.kullanici_aramasi_yapariz(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cikan sonucu control ederiz",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.WalmartStepDefinitions.cikan_sonucu_control_ederiz()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});