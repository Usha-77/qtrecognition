Feature: Login Testcase

Scenario Outline: Submit Credentials

Given Initialize the browser with chrome
And Navigate to "https://qtrecognition.testqtwiz.com/" site
When User enters <username> and <password>
Then Clicks on login

Examples:
|username      |password   |
|usha.suresh@qualitestgroup.com    |p@ssw0rd     |
|usha.suresh@qualitestgroup.com    |p@ssw0rd     |