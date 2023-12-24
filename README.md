
This program expands on the Alexander Hamilton We Love You program you wrote earlier to handle British Pounds, Shillings and Pence.
Write a class called Purse.  Purse should have the following:

    three int instance variables: pounds, shillings and pence.
    a no argument constructor (i.e., Purse()) that initializes the instance variables to 0.
    a mutator  method void addPounds(int poundsToAdd)
    a mutator  method void addShillings(int shillingsToAdd)  You may assume shillingsToAdd is less than 20.  Note that if addShillings increases the number of shillings to 20 or more, the pounds value should be increased until shillings is less than 20.
    a mutator  method void addPence(int penceToAdd)  You may assume penceToAdd is less than 12.  Note that if addPence increases the number of pence to 12 or more, the shillings value should be increased until pence is less than 12.
    an accessor method int getPounds() that returns the number of pounds in the purse
    an  accessor  method int getShillings() that returns the number of shillings (<20) in the purse.
    an  accessor  method int getPence() that returns the number of pence (<12) in the purse.  
    a mutator method void spend(int poundsToRemove, int shillingsToRemove, int penceToRemove) that removes the specified amount of money from the purse.  You may assume the purse has sufficient total funds to cover the withdrawal, though you may have to break a pound into shillings, or a shilling into pence.
    an accessor method String toString() that returns a String representation of the purse (such as "pounds 3, shillings 10, pence 5")

A tester class, PurseTester, is attached for your use.  PurseTester has only a single main method, and does the following:

    creates two Purse objects, sophie and sally
    has a loop whose body executes two times.  For each execution of the loop, it
        asks the user for the pounds, shillings and pence sophie and sally (each) should add to their purses
        displays the amount of money in each purse

Grading Elements:

    Purse has the specified instance variables, and only the specified instance variables
    Purse has the specified constructor and methods
    All methods have the correct return type and signature
    All methods have the correct behavior
    PurseTester works with Purse as expected


