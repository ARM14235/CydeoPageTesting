Feature: JamboTestingLab

@wip
  Scenario: JamboTestingLab

When user log in
And  Select familyAlbum from product, set quantity to two
And  Click to Calculate button
And  Generate: name, street, city, state, zip code
And  Click on visa radio button
And  Generate card number using JavaFaker
And  Click on Process
Then Verify success message “New order has been successfully added.

