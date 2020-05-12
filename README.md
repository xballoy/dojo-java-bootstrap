# Java Kata Bootstrap

## Dependencies

- [Cucumber JVM](https://github.com/cucumber/cucumber-jvm) 5.7.0
- [JUnit](https://github.com/junit-team/junit5) 5.5.2
- [AssertJ](https://github.com/joel-costigliola/assertj-core) 3.16.1
- [Mockito](https://github.com/mockito/mockito) 3.3.3

## Getting started

The following files are just examples, you can remove them:

- src/main/java/com/xballoy/kata/Calculator.java
- src/test/java/com/xballoy/kata/CalculatorSteps.java
- src/test/java/com/xballoy/kata/CalculatorTest.java
- src/test/resources/features/Calculator.feature

### How to

Run the tests:
```
mvn clean test
```

Change Java version:

- Update `java.version` in pom.xml (eg: `1.8` or `11`)
- Configure `maven-compiler-plugin` accordingly
