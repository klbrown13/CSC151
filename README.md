
Write a program that presents the user with 6 menu choices.

[0] to Exit
[1] Option 1
[2] Option 2
[3] Option 3
[4] Option 4
[5] Option 5


If the user enters a zero, the program terminates.

If the user enters a one, the program displays a message (such as "You selected Option 1") and then the program waits for the user to press a key and enter.

You Selected Option 1

Press any key and then enter to continue


After the user presses a key and enter the main 6 options are displayed again.  Options 1 to 5 will work the same as option 1.

Hint - the main loop should be

 do {
   System.out.println(prompt);
   System.out.println("Enter a number from 0 to " + 5 + " : ");
   option = input.nextInt();
   // bunch of if statements and/or switch statement 

 } while (option >= 1 && option <= 5);



