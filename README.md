# CSC151
Lab Assignments for the CSC 151 class
CSC 151 - Java Programming Fall 2023

Programming Lab 3B : Did You Ever Have To Make Up Your Mind?
Programming Lab 3B : Did You Ever Have To Make Up Your Mind?
Did You Ever Have To Make Up Your Mind?
Write a program using Scanner to help you decide what to do this weekend.
There is enough information in the narrative paragraph to do this program. Converting a narrative (story) into a program is required to become a programmer.  Using that information to complete the table.
The narrative - 
Imagine you only ever do three things at the weekend: go shopping, watch a movie, or just stay at home.  Which of these you do depends on three things: the weather (good or bad); how much money you have (rich or poor), and whether your parents are visiting. You say to yourself:  If my parents are visiting and the weather's bad, we'll stay in.  If they're visiting and the weather's good, we'll go to the cinema.  If they're not visiting and I'm poor, I'll stay in.  If they're not visiting and the weather is good and I'm rich, I'll go shopping.  Otherwise, I'll go to the cinema.
Create a program that asks whether the parents are visiting, whether the weather is good and whether you are rich or poor.  Your program should print "go to the cinema" "go shopping" or "stay in" as appropriate.
Hint:  There are two possibilities for the "Parents visiting?" question, two for the "is weather good?" question, and two for the "are you rich?" question.  That gives eight possible cases:

Truth Table for Did You Ever Have to Make Up Your Mind? Are parents visiting? 	
Is the weather good? 	Are you rich? 	What you do
      y 	                  y 	            y 	 
      y 	                  y 	            n 	 
      y 	                  n 	            y 	 
      y 	                  n 	            n 	 
      n 	                  y 	            y 	 
      n 	                  y 	            n 	 
      n 	                  n 	            y 	 
      n 	                  n 	            n 	 

The problem can be solved by testing a lot fewer cases than 8, but if you get confused, the full 8 case solution might provide a way to understand all of the possibilities.
Note:  Since we haven't covered String processing yet, I suggest giving the user instructions such as "Enter 1 for yes, 2 for no" when asking the various questions.  That will let you use integers internally, which should make the program easier.
Grading Elements

    The program uses nested if statements to separate various cases
    The program displays the correct action
    The program displays exactly one action per run

