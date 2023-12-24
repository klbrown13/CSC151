Triangle of Squares
Write a program using a Scanner that asks the user for a number n between 1 and 9 (inclusive).  The program prints a triangle with 2n - 1 rows.  The first row contains only the square of 1, and it is right-justified.  The second row contains the square of 2 followed by the square of 1, and is right justified.  Subsequent rows include the squares of 3, 2, and 1, and then 4, 3, 2 and 1, and so forth until n rows are printed.  Starting at row n + 1, the squares between (n - 1) to 1 are printed, again right justified.  Row n + 2 prints the squares between (n -2) to 1.

 

Notes

    Your solution should NOT use the conditionaloperator
    Your solution should NOT use tabs
    Your solutions SHOULD have at least one nested loop

Hint
Don't think of the output as a triangle.  Think of it as two rectangular tables: one of the first n rows, the second of the last (n-1) rows. 
Within each table, some cells are three spaces, some are one space and two digits, and some are two spaces and one digit. 
Start by printing an entire table with each cell its appropriate square value.  Then figure out how to replace the cells that should "empty" with three spaces instead of a number. 
Finally, figure out how to print the one-digit numbers as two spaces and one digit, and the two-digit numbers as one space and two digits.
Grading Elements

    Program asks the user for a number in the specified range
    Program displays the correct number of rows
    Program displays the correct number of columns
    Each column entry contains the appropriate square number
    Each row is right-justified, with 1 in the right-most column
    Row spacing is consistent, with each column's entry directly below the preceding row
    Program does not use the conditional operator or tabs
    Program has a nested loop
