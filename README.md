# S1.04 - Java Testing ✅


## 🧾 Task Objectives


- Learn how to use JUnit 5 for unit testing in Java and AssertJ.
- Understand how to write, organize, and run tests for your Java classes and methods.
- See how TDD (Test-Driven Development) it works. 
- Add and manage project files using Git and GitHub.

---

## 📚 Documentation

- [JUnit 5 User Guide](https://docs.junit.org/current/user-guide)

- [Assertions in JUnit](https://docs.junit.org/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html)

- [Exception Testing](https://docs.junit.org/current/user-guide/#writing-tests-assertions)

---

## 🧪 Exercises Overview

## Level 1. JUnit

<details>

### Exercise 1  

  
Create a Java class that manages a collection of books in a library. The class should allow adding books, retrieving the list of books, getting a specific book by its position, adding a book at a specific position, and removing a book by its title.

Implement the following functionalities:

- The class should allow adding books to the collection.
- It should be possible to retrieve the full list of books.
- It should be possible to get the title of a book given a position.
- It should be possible to add a book at a specific position.
- It should be possible to remove a book by its title.

Verify its correct behavior with JUnit:

- Check that the list of books is not null after creating a new object.
- Confirm that the list has the expected size after inserting several books.
- Ensure that the list contains a specific book in its correct position.
- Verify that there are no duplicate book titles in the list.
- Check that a book title can be retrieved given a specific position.
- Ensure that adding a book correctly updates the list.
- Confirm that removing a book decreases the size of the list.
- Verify that the list remains alphabetically sorted after adding or removing a book.

3## Exercise 2  


Create a class named `CalculoDni` that calculates the DNI letter when receiving the number as a parameter.  
Create a JUnit class that verifies its correct functionality, parameterizing it so that the test receives a wide range of data and validates whether the calculation is correct for 10 predefined DNI numbers.

### Exercise 3 

Create a class with a method that throws an `ArrayIndexOutOfBoundsException`.  
Verify its correct behavior with a JUnit test.
  
</details>

## Level 2. AssertJ

<details>

### Exercise 1

- An assertion that verifies two `Integer` objects have the same value, and another that shows they are not equal.

### Exercise 2

- An assertion that verifies one object reference is the same as another, and another that confirms they are different.

### Exercise 3

- An assertion that checks two integer arrays are identical.

### Exercise 4

- Create an `ArrayList` containing different types of objects (create the objects as well).
- Write an assertion to verify the order of objects in the `ArrayList` is as inserted.

- Now verify that the list contains the objects in any order.
- Also, verify that one of the objects was only added once.
- Leave one of the elements out and check that the list does not contain it.

### Exercise 5

- Create a `Map` and verify that it contains one of the added keys.

### Exercise 6

- Trigger an `ArrayIndexOutOfBoundsException` in any class.
- Write an assertion that verifies the exception is thrown as expected.

### Exercise 7

- Create an empty `Optional` object.
- Write the correct assertion to verify that it is indeed empty.

  
</details>

## Level 3. TDD (Test-Driven Development).

<details>

### Exercise 1

Let's suppose we want to create a class named `Calculator` that contains methods for performing basic operations like addition, subtraction, multiplication, and division. We'll write the tests before implementing the functionality:

1. Create a test class called `CalculatorTest`.
2. Write tests to verify the _add_, _subtract_, _divide_, and _multiply_ methods of the calculator.
3. Run the tests. They should fail since we haven't implemented the methods in the `Calculator` class yet.
4 .Create a `Calculator` class that contains the methods specified in the tests.
5. Run the tests again.
6 .Iterate through the process: After each iteration, continue the `TDD` (Test-Driven Development) process—rewrite the tests, refactor the code if needed, and repeat the development cycle to improve and expand the functionality of the `Calculator` class.


</details>

---

## 💻 Suggested Technologies

- Java (JDK 17 or higher)
- IntelliJ IDEA / Eclipse
- JUnit 5 & Maven (project management and build tool)
- Git & GitHub

## 🤖 Requirements

- Java (JDK 17+)
- Maven (3.8.x or higher)
- IntelliJ IDEA / Eclipse / VSCode with Java and Maven support
- Git installed and configured

## 🚀 Installation
1. Clone the repository.
	```bash
	git clone https://github.com/andyrouge81/S1.04-Testing.git

 1. Clone the repository
    ```bash

    git clone https://github.com/andyrouge81/S1.04-Testing.git

2. Navigate to the project directory:
   ```bash

    cd S1.04-Testing

3. Compile the project using Maven:
    ```bash
    mvn clean compile

4. Run the tests using Maven:
   ```bash
   mvn test

Or if you're using IntelliJ or Eclipse, you can right-click the `src/test/java` folder and choose `Run All Tests`.
   
### 🧰 Additional Notes

Your project uses JUnit 5 as a test framework, managed by Maven through the following dependency in `pom.xml`:
  ``` xml
      <dependency>
          <groupId>org.junit.jupiter</groupId>
          <artifactId>junit-jupiter</artifactId>
          <version>5.10.2</version>
          <scope>test</scope>
      </dependency>
  ```

## ▶️ Execution

- Go to the test directory:
  
  `src/test/java`

- Locate the test class (e.g., LibraryTest.java, CalculatorTest.java).
- Run the tests using your IDE’s test runner or terminal:
  ```bash
    ./mvnw test

- Or via IntelliJ:
  - Right-click on the test class → `Run <TestName>`

## ⚙️ Deployment

This is an educational project, not intended for production use.

## 🤝 Contributions

1. Fork this repository
2. Create a new feature branch:
    ```bash
    git checkout -b feature/YourFeatureName

3. Make your changes and commit:
    ```bash
   git commit -m "feat: added new test case for XYZ"

4. Push the branch:
    ```bash
    git push origin feature/YourFeatureName

5. Open a Pull Request


## 💌 Contact

For questions or suggestions, feel free to open an Issue or contact me via [GitHub Profile](https://github.com/andyrouge81)

  
