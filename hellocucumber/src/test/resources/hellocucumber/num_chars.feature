Feature: How many characters are in a string
	Everybody wants to know how many characters are in a string

Scenario: cucumber is the string
	Given "cucumber" is the string
	When I ask how many characters are in the string
	Then I should be told "8"

Scenario: supercalifragilisticexpialidocious is the string
	Given "supercalifragilisticexpialidocious" is the string
	When I ask how many characters are in the string
	Then I should be told "34"

Scenario: "" is the string
	Given "" is the string
	When I ask how many characters are in the string
	Then I should be told "An empty string was provided."
