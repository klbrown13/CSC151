Write a program that keeps track of the players in a 3x3 basketball game.  Your program should have the following classes:

A Player class.  A Player has

    instance variables for name and height.  (Keep height in inches; use an int.)
    overloaded constructors
        A constructor that takes name and height parameters
        A no-argument constructor
    getters and setters for name and height
    a String toString() method that returns a player's data as a String object

A Team class.  A Team has

    an instance variable that is an array of the team's players (i.e., Player[] myTeam)
    an instance variable that indicates the "next open" position of the team array.  You may assume that no more than 3 players will be added to a team, but a team might have less than 3 players.
    a no-argument constructor that initializes the player array
    a method void add(Player player) that adds a player to the team
    a method Player[] getCurrentTeamMembers() that returns a player array of all the players currently on the team (note that the team may not have a full roster when this method is called.  You should return an array with no "empty" slots.)
    a method int averageHeight()  that returns the average height (in inches) of all the players currently on the team.  Your code should handle a team with no members.
    a String toString() method that returns the number of players currently on the team, and their names and heights


A Game class.  A Game class has 

    a private static Scanner class variable for reading user input from the keyboard
    a method private static Team fillRoster() that uses the Scanner to query the user for all of the players on a Team.
    a main method.  The main method
        has two Team variables, home and visitor
        uses fillRoster to create the Team object and its associated Player objects for the home team
        uses fillRoster to create the Team object and its associated Player objects for the visting team
        prints a message identifying the team (home or visitor) that has the taller average height
        prints the taller team's roster
        prints the shorter team's roster

A sample execution of the program is attached below.

Enter the home team
Enter team member 1: 
Name: Aaron
Height: 73
Enter team member 2: 
Name: Abe
Height: 78
Enter team member 3: 
Name: Andrew
Height: 80
Enter the visiting team
Enter team member 1: 
Name: Bob
Height: 70
Enter team member 2: 
Name: Ben
Height: 81
Enter team member 3: 
Name: Bill
Height: 78
The home team is taller
Taller team roster: Team{numPlayers=3, members=[Player{name='Aaron', height=73}, Player{name='Abe', height=78}, Player{name='Andrew', height=80}]}
Shorter team roster: Team{numPlayers=3, members=[Player{name='Bob', height=70}, Player{name='Ben', height=81}, Player{name='Bill', height=78}]}
