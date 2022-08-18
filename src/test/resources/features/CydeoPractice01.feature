Feature: JamboTestingLab

@wip
  Scenario: JamboTestingLab

Given User logged in to SmartBear.com
When Click on Order
And Select familyAlbum from product, set quantity to two
When Click to Calculate button
When Generate: name, street, city, state, zip code using Java Faker
And Click on visa radio button
When Generate card number using JavaFaker
And Click on Process
Then Verify success message New order has been successfully added.