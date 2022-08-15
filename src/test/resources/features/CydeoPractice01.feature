Feature: JamboTestingLab

@wip
  Scenario: JamboTestingLab


Given Login Homepage Login with valid username and password
When Click the MORE tab and select APPRECIATION
And Write an Appreciation message
And Click the SEND button
Then Verify the Appreciation message is displayed on the feed