# Unit Testing Introduction

Project to introduce unit testing to people for the first time

## Description
This project is a calculator where you pass a comma separated list of numbers to the `add(inputString)` method.

e.g. 

**Input:** "5,10,20"

**Output:** 35 

### Considerations
* You cannot add more than 3 numbers. Anymore than that will produce an error e.g. "5,10,20,25" is not a valid input
* Any values passed in that are not numbers will fallback to zero e.g. "5,8,nine" will have output 13
* There is no minimum number of numbers so "" is actually a valid input and will throw 0
* Currently passing in null has not been handled and ideally should be handled in the code `add(null)` 

## Getting Started

1. Open Project in intellij idea
2. Ensure you have set the Java version in the Project Structure otherwise you will get an error
3. When you go into the `StringCalculatorTest.java` you should see a green play button on the left

![img.png](img.png)
