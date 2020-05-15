# A JUnit5 training


This example demonstrates:

* A simple Java 8 application with tests
* Unit tests written with [JUnit 5](https://junit.org/junit5/)
* Integration tests written with [JUnit 5](https://junit.org/junit5/)
* Code coverage reports via [JaCoCo](https://www.jacoco.org/jacoco/)
* A Maven build that puts it all together

## Running the tests

* To run the unit tests, call `mvn test`
* Code coverage reports are generated when `mvn verify` (or a full `mvn clean install`) is called.
  Point a browser at the output in `target/site/jacoco-both/index.html` to see the report.

## Conventions

This example follows the following basic conventions:

| | unit test |
| --- | --- | --- |
| **resides in:** | `src/test/java/*Test.java` |
| **executes in Maven phase:** | test |
| **handled by Maven plugin:** | [surefire](http://maven.apache.org/surefire/maven-surefire-plugin/) |

