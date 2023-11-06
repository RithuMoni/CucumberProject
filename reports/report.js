$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/login.feature");
formatter.feature({
  "name": "Facebook Application demo",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login should be successful",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "users  need to launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Holiday.user_enters_the_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username",
  "keyword": "When "
});
formatter.match({
  "location": "Holiday.user_enters_the_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usr enters the email",
  "keyword": "And "
});
formatter.match({
  "location": "Holiday.usr_enters_the_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password",
  "keyword": "And "
});
formatter.match({
  "location": "Holiday.user_enters_the_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects a dateofbirth",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user selects a gender",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user needs to click a a signup",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});