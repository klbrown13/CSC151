
Note:  sample output from my solution is in the attached text file.
Write a program using Scanner and its nextLine method.  The following is an example of how to use nextLine
Scanner kybd = new Scanner(System.in);
System.out.println("Enter a line of text");
String aLine = kybd.nextLine();
If the user's input is shorter than 7 characters, print the message "The input is too short" and do no further processing.  If the user's input is 7 characters or longer, perform the following operations.
Print either "the original String has no leading or trailing whitespace" or "the original String has leading or trailing whitespace."  (Hint:  the trim method will be a good start, but you'll need more.)
Swap the first two and last five characters of aLine and print the result.
Print aLine in all upper case.
If aLine has an odd number of characters, print "The line has an odd number of characters."  Otherwise, print the two middle characters of aLine.
Print the compareTo results of comparing aLine in all lower case with the original aLine.  (This will be a number.)
Print whether the first half of aLine is the same as the last half of aLine except for case.
Print aLine with one character removed:  The first 'e' 'E' 's' or 'S'.

Note:  treat each of these steps as an independent action operating on the original input.  So if the original input was
kilroy was here, still waiting for godot
swapping the first two and last five characters would print
godotlroy was here, still waiting for ki
and printing the input in all upper case would result in
KILROY WAS HERE, STILL WAITING FOR GODOT
You may use ONLY String's indexOf, charAt, length, compareTo, toUpperCase, toLowerCase, trim, equals, equalsIgnoreCase and substring methods.
Grading Elements

    Program checks the length of user input.  If it is too short, the program prints a message.  If it is sufficiently long, the specified operations are performed. 
    Program always uses the original input for each manipulation
    Program uses only the specified String methods for manipulations
    Program prints whether the String has leading or trailing whitespace
    Program tests for any whitespace, not just spaces
    Program swaps the first two and last five characters
    Program prints the input in upper case
    Program prints either that the input has a odd length, or prints the two middle characters
    Program prints the results of String's compareTo method on the original input and the original input converted to lower case
    Program compares the first half and last half of the input, ignoring case
    Program prints the original input with the first   'e' 'E' 's' or 'S' removed


