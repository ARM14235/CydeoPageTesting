Feature: JamboTestingLab

@wip
  Scenario: JamboTestingLab


Given Confirm checkbox #1 is NOT selected by default
When Confirm checkbox #2 is SELECTED by default.
And Click checkbox #1 to select it.
And Click checkbox #2 to deselect it.
And Confirm checkbox #1 is SELECTED.
Then Confirm checkbox #2 is NOT selected.

