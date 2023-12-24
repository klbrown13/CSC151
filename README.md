To Tell the Truth
Write a program to query 
https://www.pravdareport.com
https://pravda.ru
https://www.lefigaro.fr
https://www.independent.co.uk
and display everything between the first occurrence of the tags
<title> and </title> 

Things like <whatever> are called HTML tags.  The </title> ends the tag <title>. 
If a webpage contains

<title>Sophie, Sally and Jack</title> 

your program should print 

Sophie, Sally and Jack
If no <title> … </title> tags appear, print a message such as “No <title> was found in http://pravda.ru.”
You may assume that if <title> and </title> occur, they occur in the same line of the file.
Your program should handle any thrown exceptions with an informative message.

Grading Elements:
•	Submission adheres to your instructor’s rules for submissions and code quality and conventions.
•	Program opens network connections to each of  the designated web sites
•	Program reads the designated web pages
•	Program scans the incoming datastream for the appropriate HTML tags
•	Program extracts the designated information, or prints a message if no such information is found
•	Program catches any exceptions and prints an informative 
