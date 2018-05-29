$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/RAKESH/Desktop/Testing/FreeCRMBDDframework/src/main/java/Features/Hook.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Hook Test",
  "description": "",
  "id": "free-crm-hook-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 405076,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM creat deal page",
  "description": "",
  "id": "free-crm-hook-test;free-crm-creat-deal-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is in deal page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Userf fills all the details",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Deal page is created",
  "keyword": "Then "
});
formatter.match({
  "location": "hookingStepDefiniations.user_is_in_deal_page()"
});
formatter.result({
  "duration": 162526544,
  "status": "passed"
});
formatter.match({
  "location": "hookingStepDefiniations.userf_fills_all_the_details()"
});
formatter.result({
  "duration": 2983582,
  "status": "passed"
});
formatter.match({
  "location": "hookingStepDefiniations.deal_page_is_created()"
});
formatter.result({
  "duration": 3043726,
  "status": "passed"
});
formatter.after({
  "duration": 692947,
  "status": "passed"
});
});