$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:package3/3.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I want to enter username \"\u003cu_name\u003e\" in username field",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter password \"\u003cpassword\u003e\" in password field",
  "keyword": "When "
});
formatter.step({
  "name": "I click on the login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "u_name",
        "password"
      ]
    },
    {
      "cells": [
        "janu",
        "abc@#"
      ]
    },
    {
      "cells": [
        "tamizl",
        "abc$%"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I want to enter username \"janu\" in username field",
  "keyword": "Given "
});
formatter.match({
  "location": "cc6.i_want_to_enter_username_in_username_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password \"abc@#\" in password field",
  "keyword": "When "
});
formatter.match({
  "location": "cc6.i_enter_password_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login",
  "keyword": "Then "
});
formatter.match({
  "location": "cc6.i_click_on_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I want to enter username \"tamizl\" in username field",
  "keyword": "Given "
});
formatter.match({
  "location": "cc6.i_want_to_enter_username_in_username_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password \"abc$%\" in password field",
  "keyword": "When "
});
formatter.match({
  "location": "cc6.i_enter_password_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login",
  "keyword": "Then "
});
formatter.match({
  "location": "cc6.i_click_on_the_login()"
});
formatter.result({
  "status": "passed"
});
});