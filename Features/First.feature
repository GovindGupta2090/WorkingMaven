Feature: FirsrProg

Scenario Outline: scen1

Given Open Chrome and start application with "https://www.freecrm.com/index.html"
When I eneter valid surname "<anyname>" and valid paasword "<anypass>"
Then user should be able to login sucessfully

Examples:
|anyname|anypass|
|uname1|pass1|
#|uname2|pass2|
#|uname3|pass3|





