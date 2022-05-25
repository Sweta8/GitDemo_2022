Feature: Login into Application

Scenario: Positive Scenario 
Given User is on NetBanking landing page
When User login into the application with "username" and "password"
Then Home page is populated
And Cards are displayed are "true"

Scenario: Negative Scenario 
Given User is on NetBanking landing page
When User login into the application with "username" and "password"
Then Home page is populated
And Cards are displayed are "false"
