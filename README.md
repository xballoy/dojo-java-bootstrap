# Java Kata Bootstrap

You can use this project to quick start your katas in Java.

The project targets the latest JDK version (16).
You can either install it from [AdoptOpenJDK website](https://adoptopenjdk.net/) or you can change it to your current version in following files:

- [pom.xml](pom.xml): change `maven-compiler-plugin` configuration
- [ci.yml](.github/workflows/ci.yml): change `actions/setup-java@v1` configuration

## Dependencies

- [AssertJ](https://github.com/joel-costigliola/assertj-core)
- [Cucumber JVM](https://github.com/cucumber/cucumber-jvm)
- [jquik](https://github.com/jlink/jqwik)
- [JUnit](https://github.com/junit-team/junit5)
- [Mockito](https://github.com/mockito/mockito)

## Getting started

The following files are just examples, you can remove them:

- src/main/java/com/xballoy/kata/Calculator.java
- src/test/java/com/xballoy/kata/CalculatorSteps.java
- src/test/java/com/xballoy/kata/CalculatorTest.java
- src/test/resources/features/Calculator.feature
