$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/StudyBDD.feature");
formatter.feature({
  "line": 2,
  "name": "Testing on E-commerce Website",
  "description": "",
  "id": "testing-on-e-commerce-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "To validate the Login Process",
  "description": "",
  "id": "testing-on-e-commerce-website;to-validate-the-login-process",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I want to enter URL",
  "rows": [
    {
      "cells": [
        "https://freecrm.com/"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Login Link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter the Username and Password",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 9
    },
    {
      "cells": [
        "nitesh.tadadikar95@gmail.com",
        "Nt@tadadikar1995"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I confirm Login validation",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click on Welcome link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I do logout operation",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I close the window",
  "keyword": "And "
});
formatter.match({
  "location": "StudyBDD.i_want_to_enter_URL(DataTable)"
});
formatter.result({
  "duration": 14442209600,
  "status": "passed"
});
formatter.match({
  "location": "StudyBDD.i_click_on_Login_Link()"
});
formatter.result({
  "duration": 1769917800,
  "status": "passed"
});
formatter.match({
  "location": "StudyBDD.i_enter_the_Username_and_Password(DataTable)"
});
formatter.result({
  "duration": 3509263000,
  "status": "passed"
});
formatter.match({
  "location": "StudyBDD.i_click_on_login_button()"
});
formatter.result({
  "duration": 94748700,
  "status": "passed"
});
formatter.match({
  "location": "StudyBDD.i_confirm_Login_validation()"
});
formatter.result({
  "duration": 2901544000,
  "status": "passed"
});
formatter.match({
  "location": "StudyBDD.i_click_on_Welcome_link()"
});
formatter.result({
  "duration": 40000,
  "status": "passed"
});
formatter.match({
  "location": "StudyBDD.i_do_logout_operation()"
});
formatter.result({
  "duration": 31800,
  "status": "passed"
});
formatter.match({
  "location": "StudyBDD.i_close_the_window()"
});
formatter.result({
  "duration": 240434800,
  "status": "passed"
});
});