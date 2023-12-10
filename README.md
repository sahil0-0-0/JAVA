# DSA
Java programs 

== >  variable , print statement , user-input 

1. Calculate average of three numbers input by user.
   CODE --> avgOfThreeNum.java
2. Compute area and circumference of a circle, where radius is input by user.
   (Hint : area = πr² and circumference = 2πr)
   CODE --> areaOfCircle.java
3. Calculate Simple Interest, where P and N are input by user. (Set R=1.6)
   CODE --> simpleInt.java
4. Swap two integer values.
      a) Using a third variable
      b) Without using a third variable
   CODE --> swapping.java
5. Write a Java program to create a Class named “Student” to set values of FirstName
   and LastName; and display Full Name as output.
   Example :
   Input:Enter First Name: Virat
   Enter Last Name: Kohli
   Output: Your Full Name is Virat Kohli.
   CODE --> fullName.java
6. Write a Java program to perform basic arithmetic operations on two numbers.
   CODE --> arithmaticOperation.java

== >  conditional statements and operators

8. Check if a year input by user is a leap year or not.
   CODE --> leapOrNot.java
9. Check if a number input by user is a multiple of 27 or not.
   CODE --> multiplyOrNot.java
10. Depending on the age input by user, display if the user is a minor (0-17 yrs), adult
   (18-59 yrs) or a senior citizen(60+ yrs).
   CODE --> ageDistribution.java
11. Display greatest of 3 numbers input by user.
      a) Use nested if
      b) Use logical operators
    CODE --> maxFrom3Num.java
12. Input length and width of a rectangle, and determine if it is a square or not using
    ternary operator.
    CODE --> squareOrNot.java
13. Input all three angles of a triangle and display if it is a valid triangle or not.
    (Hint : sum of all angles of a triangle = 180°)
    CODE --> checkTriangle.java
14. a) Check if user input is only of one character, otherwise print “Invalid input”.
    (Hint : Use built-in method String.length() to check length of input String)
    b) In the same code, further check if that character input by user is a vowel or a
    consonant.
    CODE --> checkChar.java
15. Input cost price and selling price of a product and determine if there is profit or loss.
    Display the final amount of profit / loss.
    (Hint : Profit = SP - CP and Loss = CP - SP)
    CODE --> profitOrLoss.java
16.  Input marks of three subjects (m1, m2, m3) from the user. Display total percentage
     and based on percentage, display final grade as below :
     Perc Grade
         70 - 100 Distinction
         60 - 69 First Class
         50 - 59 Second Class
         40 - 49 Pass Class
         0 - 39 Fail
     CODE --> gradeDistribution.java
17. Check if a user input number is a two-digit, three-digit or a four-digit number.
      Example :
      Input: 3467
      Output: It is a four digit number !
    CODE --> countDigit.java

== > switch statement

18. Create a switch statement which takes any number from 1 to 7 as user input and
    prints the name of the corresponding day as the message.
       Example : User Input : 2
       Expected output : The day is Monday !
    CODE --> weekDays.java
19.  Accept the value for two numbers from the user. Provide menu options for all 5 basic
     arithmetic operations. Perform only the selected operation on those numbers.
       Example :
       Enter ‘+’ for addition.
       Enter ‘-’ for subtraction.
       Enter ‘*’ for multiplication.
       Enter ‘/’ for division.
       Enter ‘%’ for modulo.
     CODE --> arithmaticOperation.java
20. Take the designation of an employee as user input.
    Using switch case; set the following values, based on their designation.
         For Engineer => Basic = 30000 HRA = 2600 DA = 3000
         For Manager => Basic = 40000 HRA = 4600 DA = 2500
         For Clerk => Basic = 15000 HRA = 1600 DA = 1500
         Lastly; calculate and display Gross Salary.
         (Gross Salary = Basic + HRA + DA)
    CODE --> employeeDestination.java
21.  Accept any number from the user. Using switch case, write a menu driven program to
     perform any of the following operations :
         1] Display the square of the number
         2] Display the cube of the number
         3] Check if the number is even or odd
         4] Increment operation
         5] Decrement operation
     CODE --> switchOperation.java

== > looping structures

22. Print number series of natural numbers from 1 to 25, in continuous sequence.
    CODE --> printNum.java
23. Print odd number series of natural numbers 1 to n in reverse order, where n is
    user-input.
    CODE --> printOddNum.java
24. Print factorial value of any number entered by the user.
      (Hint : n! = n*(n-1)*(n-2)*(n-3)*(n-4) * ... * 1
      Example : 5! = 5*4*3*2*1 = 120 )
         a) using while() loop
         b) using for() loop
    CODE --> findFactorial.java
25. Implement an infinite loop, through all looping structures.
      (Infinite loop is a loop which is never terminated; i.e., when the condition is always
      “true” it is never terminated.)
    CODE --> infiniteLoop.java
26. Print multiplication table of number n, input by user.
      a) using while() loop
      b) using for() loop
    CODE --> table.java
27. Accept 5 integers from the user using any loop and print their average .
    CODE --> inpUsLooop.java
28. Two numbers n1 and n2 are entered by the user. Write a program to find the value of
    n1 raised to the power of n2.
         Input : n1=5, n2=3
         Output : answer = 5³ = 125
    CODE --> powerOfN.java
29. Keep accepting integer values from the user. If at any time, the user enters ‘0’,
    terminate the program. Lastly, print the product of all input numbers.
    CODE --> inpUntill0.java
30. Accept values of n integers (where n is also input by user). Print their sum at the end
    of the program.
    Consider the condition => sum should not exceed 5000 in any case. If at any time, the
    value of sum exceeds 5000, terminate the loop.
    CODE --> lessThan5k.java

== > user defined functions

31. Create a user defined function named displayFactorial( ) that returns the factorial of
    n. Take input of n from the user and pass it as a parameter while calling the function.
    CODE --> displayFactFun.java
32. Create a user defined function which takes an integer as input parameter and returns
    the length of that number i.e the number of digits it contains.
      Input : n = 235
      Output : 3
    CODE --> countDigit.java
33. Take user input of 3 parameters n1, n2 and an operator. Perform the concerned
    arithmetic operation and return the result value.
      Input : num1 = 23, num2 = 5, opr = ‘+’
      Output : 28
    CODE --> arithFun.java
34. Pass the values of the user's name, age and country, and display the message in the
    following format.
    Condition : Only Indian citizens, aged 18 years and above, are eligible to vote.
      Input1 : name = Rohan, age = 21, country = India
      Output1 : Hello Rohan, you're eligible to vote !
      Input2 : name =Bill, age = 25, country = America
      Output2 : Hello Bill, you're not eligible to vote !
    CODE --> voteFun.java
35. Create a UDF which lets you print all the alphabets from A to Z .
    CODE --> aToZ.java

    




    









   


