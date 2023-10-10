# Homework 1: Programming Languages Principles and Implementation

## Exercise 1: GitHub

Done. https://github.com/PrideInt/CS361

## Exercise 2: Lecture Notes

Read the Java lecture notes posted in BlackBoard.
What is the title of slide n/2?

- Pride > n = 16 > **Constructors**

## Exercise 3: Setting up.

## Exercise 4: Do the 22 TODO tasks

Done in this repo. *CS361/hw1/cs361languages/src/...*

## Exercise 5: Java Bytecode

Explain the following bytecode commands:
- ILOAD
  - **ILOAD is the instruction that loads in some data into code to be manipulated after.**
- IINC
  - **IINC is the instruction that performs arithmetic to data; in this case, incrementation.**
- GOTO
  - **GOTO is the instruction that returns to or jump to another line of code.**

Explain how how assignments, loops etc. are implemented in bytecode.
- **In Java bytecode, it performs sequences of definitions, loads, storing of data in cache, then performing some
  operation on this data (e.g., IINC in this case). In loops, a GOTO instruction allows lines of code to loop around
  until a certain condition tells it to stop.**

Did you discover anything about the Java language by looking at the bytecode? 
- **I understood that JVM is able to translate written code in Java into bytecode, which really are just sequences of
  instructions in a superimposed order. It is then translated into assembly and machine code, which is the same, but with much less abstraction.**

