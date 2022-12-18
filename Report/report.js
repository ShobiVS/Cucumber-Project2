$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/sample.feature");
formatter.feature({
  "name": "To order the food in Bristo Bites Website",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To launch the browser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "Bites3.to_launch_the_browser_and_maximize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The user read “Our Story”",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke1"
    }
  ]
});
formatter.step({
  "name": "Click the “Our Story” option",
  "keyword": "When "
});
formatter.match({
  "location": "Bites6.click_the_Our_Story_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the spelling mistake",
  "keyword": "And "
});
formatter.match({
  "location": "Bites6.check_the_spelling_mistake()"
});
formatter.result({
  "status": "passed"
});
});