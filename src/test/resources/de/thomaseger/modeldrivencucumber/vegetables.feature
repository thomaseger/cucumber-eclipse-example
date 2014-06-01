Feature: Vegetables

Scenario: The vegetables have different colors
	Given I have these vegetables:
	| name     | color |
    | Cucumber | Green |
    | Tomato   | Red   |
	When I compare the both colors
	Then they have to be different
