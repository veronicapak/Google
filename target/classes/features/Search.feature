Feature: Search feature

  Scenario: Search a wooden spoon
    Given user in on the homepage
    When user is typing "wooden spoon" word
    Then title contains "wooden spoon" word