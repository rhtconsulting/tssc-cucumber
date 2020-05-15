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

mvn test to run tests (none currently created)

Now we need to create cucumber tests for behavior driven design. Ideally tests are written before the code itself.

Feature files are stored in src/test/resources/hellocucumber

Create feature file with format:


Feature: x
	<Documentation>
Given <initial condition>
When <variable>
Then <expected answer>




