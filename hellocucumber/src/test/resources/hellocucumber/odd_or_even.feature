Feature: Is a number even or odd
	Everybody wants to know if a number is even or odd.

Scenario: "4" is the number
	Given "4" is the number
	When I ask whether the number is odd or even
	Then I should be told "4 is an even number"

Scenario: "3" is the number
	Given "3" is the number
	When I ask whether the number is odd or even
	Then I should be told "3 is an odd number"

Scenario: "5.5" is the number
	Given "5.5" is the number
	When I ask whether the number is odd or even
	Then I should be told "The provided String was not a valid integer."
