$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("swagTest.feature");
formatter.feature({
  "line": 2,
  "name": "Test all scenario",
  "description": "",
  "id": "test-all-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ALlTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 33,
  "name": "Validate the price with the product listing",
  "description": "",
  "id": "test-all-scenario;validate-the-price-with-the-product-listing",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 32,
      "name": "@TestScenario3"
    },
    {
      "line": 32,
      "name": "@takescreenshot"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "Open the Site Url \"https://www.saucedemo.com/\" for Login",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User copy the user name and password enters details and log in",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "verify the user is successfully logged with page title \"PRODUCTS\"",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "get all product price in the list",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "clicks the particular product \u003cproname\u003e and verify that product name and price",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 41,
  "name": "",
  "description": "",
  "id": "test-all-scenario;validate-the-price-with-the-product-listing;",
  "rows": [
    {
      "cells": [
        "proname"
      ],
      "line": 42,
      "id": "test-all-scenario;validate-the-price-with-the-product-listing;;1"
    },
    {
      "cells": [
        "Sauce Labs Bolt T-Shirt"
      ],
      "line": 43,
      "id": "test-all-scenario;validate-the-price-with-the-product-listing;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 43,
  "name": "Validate the price with the product listing",
  "description": "",
  "id": "test-all-scenario;validate-the-price-with-the-product-listing;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 32,
      "name": "@TestScenario3"
    },
    {
      "line": 1,
      "name": "@ALlTest"
    },
    {
      "line": 32,
      "name": "@takescreenshot"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "Open the Site Url \"https://www.saucedemo.com/\" for Login",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User copy the user name and password enters details and log in",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "verify the user is successfully logged with page title \"PRODUCTS\"",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "get all product price in the list",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "clicks the particular product Sauce Labs Bolt T-Shirt and verify that product name and price",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "swagTestSD.initialize_the_browser_with_chrome()"
});
formatter.result({
  "duration": 7843354000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 19
    }
  ],
  "location": "swagTestSD.open_the_site_url_something_for_login(String)"
});
formatter.result({
  "duration": 903489900,
  "status": "passed"
});
formatter.match({
  "location": "swagTestSD.user_copy_the_user_name_and_password_enters_details_and_log_in()"
});
formatter.result({
  "duration": 1627040200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PRODUCTS",
      "offset": 56
    }
  ],
  "location": "swagTestSD.verify_the_user_is_successfully_logged_with_page_title_something(String)"
});
formatter.result({
  "duration": 127848800,
  "status": "passed"
});
formatter.match({
  "location": "swagTestSD.get_all_product_price_in_the_list()"
});
formatter.result({
  "duration": 214894300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sauce Labs Bolt T-Shirt",
      "offset": 30
    }
  ],
  "location": "swagTestSD.clicks_the_particular_product_and_verify_that_product_name_and_price(String)"
});
formatter.result({
  "duration": 2251187600,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c$[49].99\u003e but was:\u003c$[7].99\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinitions.swagTestSD.clicks_the_particular_product_and_verify_that_product_name_and_price(swagTestSD.java:186)\r\n\tat ✽.Then clicks the particular product Sauce Labs Bolt T-Shirt and verify that product name and price(swagTest.feature:39)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "swagTestSD.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1746645900,
  "status": "passed"
});
});