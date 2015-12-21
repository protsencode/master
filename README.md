Read me

Technical Exercise GoEuro #2
2. Test automation
GoEuro lists the travel results sorted by cheapest, fastest or by time (departure/arrival). Please create an automated test that will make a search (Eg.: Berlin ­ Prague) and will verify that the sorting by price is correct. You are free to choose the tool and language you want, except for record and play tools.
Please send your solution as a github link. We’ll take a look at your solution considering if the test is working, the design choices, the commit messages on github (best practices of version control) and the test report.

What was made:
Was created test automation Framework: TestNg+Maven+SurefireReportsPlugins+Log4j
Were written 1 test suite 6 tests: the first three check correct oppenning of home page and search page; the last three tests check sorting by price for train, bus and flight.
The logging was implemented with Log4j. Log_file.log is saved to the  project folder.
The reporting: Surefire Reports Plugins.
The asserts and run: TestNg, Maven

Requirements:
apache-maven-3.3.9
FireFox browser 41.0
Java 1.8

structure:
src\main\java\es\goeuro\pages - the classes which describe the the pages of target site: HomePage.java, Page.java, SearchPage.java
src\test\java\es\goeuro\test - here classes BaseTest.java, BaseTest.java with tests

For each item  was done the separated test.
In sum: 6 test:
5 - passed,
1 failed (For Sorting by price for bus Was not considered "Alternative Dates" feature which impact on test results)

--------------- Run -----------------------------------------------------------------------
*****************************************************
* ATTENTION: require installed Java 1.8 and Maven 3   *
* And correct settings of system variables.         *
* FireFox browser 41.0                              *
*****************************************************
To run the tests and reporting You need:
1. Clone the project from https://github.com/protsencode/master.git (git@github.com:protsencode/master.git)
2. Go via the commands line (-> run-> cmd) in the folder with the unpacked project
3. Run the command:

         mvn clean install site

Or just run via your IDE)
For fetching the all necessary libraries, You need to run pom.xml in any IDE.
----------------------------------- -------------- Reports -------------------------------------
Reports are implemented using Maven plugins:
 - Maven Surefire Report Plugin
 - Maven Surefire Plugin

Pretty html-report can be found here: /target/site/surefire-report.html
                                      /target/site/index.html

