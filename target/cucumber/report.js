$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('groupactivity2\online.feature');
formatter.feature({
  "line": 1,
  "name": "Login Operations",
  "description": "User login and registration page shall takes place here",
  "id": "login-operations",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 12,
  "name": "Registration for users",
  "description": "",
  "id": "login-operations;registration-for-users",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Registration"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "open the chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user enter valid email on the page",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the page is navigated to create account page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the user enter the valid registration data",
  "keyword": "When "
});
formatter.match({
  "location": "Registration.open_the_Browser_and_launch_the_application()"
});
formatter.result({
  "duration": 7763206700,
  "status": "passed"
});
formatter.match({
  "location": "Registration.enter_valid_data()"
});
formatter.result({
  "duration": 10312289500,
  "status": "passed"
});
formatter.match({
  "location": "Registration.successful_login()"
});
formatter.result({
  "duration": 2127113600,
  "status": "passed"
});
formatter.match({
  "location": "Registration.enter_registration_data()"
});
formatter.result({
  "duration": 41685321900,
  "status": "passed"
});
});