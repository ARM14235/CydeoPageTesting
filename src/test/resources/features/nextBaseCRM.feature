Feature: User should not be able to log in
User Story:
  As a user I should not be able to log in with wrong credentials.
  @wip
  Scenario: User log in attempt

When user Enter incorrect username: “incorrect”
When user Enter incorrect password: “incorrect”
And user Click to login button.
Then Verify error message text is as expected: Expected: Incorrect login or password
