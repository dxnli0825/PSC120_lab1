# PSC120_lab1

Lab 1: In Class

Psychology 120

The aim of lab 1 is to build a Java program from scratch. When your group is done, you will show it to me or the TAs for approval.  That is, your group will run your programs and show us that it does everything specified below.  This includes formatting the output as indicated below.

The lab consists of two problems:

Problem # 1: First, you will build from scratch an agent that can (1) print out the months of a year in order, (2) print out a random list of months, and (3) a month given a number. When it works, given the list command, it should print out a list that looks exactly like this:

1. January

2. February

3. March

4. April

5. May

6. June

7. July

8. August

9. September

10. October

11. November

12. December

When given the random order command, it prints out a random order of length n.  If n = 12, the list printed out might look like this (note: every random list will have a different order):

7. July

9. September

6. June

4. April

12. December

1. January

3. March

10. October

2. February

4. April

8. August

5. May

When given, say, the number 5, it returns:

5. May

When given a range of months (e.g., 2 to 4), it prints out:

2. February

3. March

4. April 

When given, say the string "April," it returns:

month: 4

Step 1: Create a project and package in your project's "src" folder.

Step 2: Create your Classes within the package of your project. One will be your agent, who can do the things listed above. You can name it Agent. The other object is the environment object for running your simulation, and remember it must have a "main" function. You can call it Environment. You can use the lecture notes for help.

Step 3: Define your Agent class in detail. It will need to store the months of the year and have methods for printing them out. Create the following methods:

public void printMonths(); //Prints all the months in order

public void printRandomList(int length); //Prints out a list of randomly generated months, e.g.:

4. April

2. February... (months can repeat)

public String getMonth (int month); //Prints out the string name for the month corresponding to the int, e.g., getMonth(d) -->

3. March

public void printRangeOfMonths(int start, int end); //make sure it checks start and end, e.g., printRangeOfMonths(2,4) -->

2. February

3. March

4. April  

public void printMonthNumber(String monthName); // Prints the number of the month

Step 4: Define your environment.  That is, create your agent in the main method of your Environment and have it print out the months.  For example:

Agent a = new Agent();

a.getMonth(3); print -->

3. March

Step 5: Run your program and debug it.

 

Problem # 2: Second, write a method that takes integers from 1 to 366 and returns the day of the week, month, and day for 2024.  For example, if given the number 189, it prints "Sunday, July 7" or if given the number 281, it prints "Monday, October 7".  You can verify your method hereLinks to an external site..

To Finish: Show us your programs, that they work, and you are done!  