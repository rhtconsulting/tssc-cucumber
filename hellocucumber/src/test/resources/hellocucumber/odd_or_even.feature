Feature: Is a given number even or odd
	Everybody wants to know if a given number is even or odd.

Scenario: "4" is the chosen number
	Given "4" is the chosen number
	When I ask whether the chosen number is odd or even
	Then I should be told "4 is an even number"

Scenario: "3" is the chosen number
	Given "3" is the chosen number
	When I ask whether the chosen number is odd or even
	Then I should be told "3 is an odd number"

Scenario: "5.5" is the chosen number
	Given "5.5" is the chosen number
	When I ask whether the chosen number is odd or even
	Then I should be told "The provided String was not a valid integer."
