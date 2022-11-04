# AutomationJava
To be able to run the tests install following:

- Java -- follow the steps from the link:

```https://www.geeksforgeeks.org/how-to-install-java-on-macos/```
- Selenium ```from dependencies```
- Maven ```brew install maven```


```https://www.jetbrains.com/help/idea/convert-a-regular-project-into-a-maven-project.html```
- Cucumber ```from dependencies```
  
- Clone the **repository**


For creation of the test file use directory ```src/main/resources/```, Should be writen in Gerkin
-
Use ```@tags``` at the beginning of the **feature** file


few Maven commands:

```mvn clean```

This command cleans the maven project by deleting the target directory. The command output relevant messages are shown below.

```mvn verify```

This command build the project, runs all the test cases and run any checks on the results of the integration tests to ensure quality criteria are met.


To trigger a specific test run clear target folder by running:
```mvn clean```

Then run the test:

```mvn clean test -Dcucumber.filter.tags='@Demo'```
