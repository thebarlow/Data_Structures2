Matthew Barlow

README
All .java files were made in Eclipse Neon. To run them please do so through either Eclipse or off the command line using javac.

Problem1.java
Solution to first portion of programming section. Finds the largest perimeter out of an array of Rectangles.

Problem2.java
Recursively searches through an array of Rectangles to find one which matches its secondary input.

Problem3.java
Implements the three provided code fragments from the written section. Runs them to find their processing time.

Problem3.txt
The results of problem3.java and why I think the answers were what they were.

Rectangle.java
The Rectangle Base class. Contains relevant functions to collect data. Implements Comparable.

Written hmk 1.pdf
Contains the first five problems of the homework. The entire written portion. Open in any program which can handle pdf.


PROMPT (1)
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Symbol Balancing (30): 

Implement a class called SymbolBalance.java. It should take a the name of a java file as a command line argument. Read in the file and check to make sure that all { }'s, ( )'s, [ ]'s, " "'s, and /* */'s are properly balanced. Make sure to ignore characters within literal strings and comment blocks. You do not have to deal with single line comments (those that start with a //).

There are a number of error cases:

The file ends with one or more opening symbols missing their corresponding closing symbols.
There is a closing symbol without an opening symbol.
There is a mismatch between closing and opening symbols (for example: { [ } ] ).
Your program should output whether or not the symbols are all appropriately balanced.  If they are not, indicate which error condition occurred and what symbol type caused the problem. 

You will need to write your own stack class for this. It should be generic (in this particular case you will be pushing Character objects on it, but it should be capable of handling any object reference). Call your stack class: MyStack.java.You may use java.util.LinkedList as an instance variable in your MyStack class, but in the implementation of your stack methods, you are only allowed to use its basic list operations, not the stack operations themselves (that is, do not use LinkedList's native push and pop methods).

PROMPT (2)
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Two Stack Queue (30 pts):  Build a queue out of two completely separate stacks, S1 and S2. Enqueue operations happen by pushing the data on to stack 1. Dequeue operations are completed with a pop from stack 2.  Obviously you will have to find some way to get the input stack information over to the output stack.  Your job is to figure out how and when to do that, using only push and pop operations.

Write a class TwoStackQueue that provides the Queue ADT (as specified in the MyQueue.javaDownload MyQueue.java interface)  using two stacks. Your class should explicitly implement the interface provided above.  Since the interface is generic, your class should be as well. Provide all methods specified  in the interface. Your class should not use any additional memory to store the data in the queue except for the two stacks. Use your stack implementation from programming problem 1.
Write a tester class with a main method to demonstrate that your TwoStackQueue works correctly (by enqueueing a number of objects and then dequeueing and printing them in the correct order).   Call your tester class Program2.java.  You can find a sample tester class in the file TwoStackQueueTester.javaDownload TwoStackQueueTester.java. It is similar to the one that we will use to grade your submission. Your tester should try different examples, than the ones from this sample.
In a file called Program2.txt, discuss the big-O running time of the enqueue and dequeue operation for your queue implementation.
