Cucumber Documentation for use in TSSC

How will it work.

Cucumber will be run as part of the pipeline.

Good resource for writing cucumber tests: https://cucumber.io/docs/guides/10-minute-tutorial/

In step "Run Automated UAT Testing" In both continuous merge request deployment and continuous deployment

CI Container needs to have maven installed (yum -y install maven)

Command to initialize cucumber project with maven:

mvn archetype:generate                      \
   "-DarchetypeGroupId=io.cucumber"           \
   "-DarchetypeArtifactId=cucumber-archetype" \
   "-DarchetypeVersion=5.6.0"               \
   "-DgroupId=hellocucumber"                  \
   "-DartifactId=hellocucumber"               \
   "-Dpackage=hellocucumber"                  \
   "-Dversion=1.0.0-SNAPSHOT"                 \
   "-DinteractiveMode=false"


Creates a directory called hellocucumber. Change this name to whatever your project name is.

cd to hellocucumber or project_name

"mvn test" to run tests (none currently created)

Now we need to create cucumber tests for behavior driven design. Ideally tests are written before the code itself.

Feature files are stored in src/test/resources/hellocucumber

Create feature file with format:

Feature: This is a feature
	Note on feature
Given an initial condition
When a question about the condition is asked
Then I should be told "this answer"

StepDefinitions.java needs to fill in the logic for evaluating these feature files

@Given, @When, and @Then annotations are used to link the feature steps from the scenario with the method in the step definition

Example:

public class StepDefinitions {

private String value;
private String expectedAnswer;
private String actualAnswer;

@Given("an initial condition)
public void an_initial_condition(String initialCondition) {
// Do something to set the initial condition
	value = initialCondition;
}

@When("a question about the condition is asked")
public void question_about_condition) {
// Do something to evaluate the question as input against the initial condition
	actualAnswer = SomeClass.staticMethod(value);
}

@Then("this answer should be provided)
public void i_should_be_told(String expectedAnswer)
{
// Compare the expected answer ("this answer") with the answer provided by the logic in question_about_condition
assertEquals(expectedAnswer, actualAnswer);

}

}












