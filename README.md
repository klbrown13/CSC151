
In Programming Lab 5D, you implemented a simple menu system. In Step 3 of the CarLot Project, you will use this code as the foundation of your main CarLotMain application.
The CarLotMain Class
Using the menu system in Lab 5D, build the main user interface to the CarLot system in the class CarLotMain.  
Note: The JavaDoc supplied in Step 1 of the project also has doc for CarLotMain
Requirements

    Option 1 - Add a car to inventory. The following attributes are required for all cars:
        Identifier. This must be a String that describes the car
        Mileage. The current mileage on the car
        MPG. The Car's MPG rating
        Cost. The amount that the dealer paid for the car
        Sales Price.  The asking price for the Car
    Option 2 - Sell a car from inventory.  Selling a car requires the ID of the car and the actual price for the car, not the asking price
    Option 3 - Print a listing of all cars in the inventory, ordered by when they were acquired. 
    Option 4 - Print a listing of all cars in the inventory, sorted from highest MPG to lowest MPG
    Option 5 - Display the car in the inventory with the highest MPG
    Option 6 - Display the car in the inventory that has the highest mileage.
    Option 7 - Calculate the average MPG for all cars in the inventory.
    Option 8 - Display the total profit for all cars in the inventory that are sold.

Hints

    All inputs should be collected from the CarLotMain class. The Car and CarLot classes should not do Console input
    The CarLot class should do most of the work
    Your menu may look something like this:

[0] Exit
[1] Add a car to inventory
[2] Sell a car from inventory
[3] List inventory by order of acquisition
[4] List Inventory From Best MPG to Worst MPG
[5] Display car with best MPG
[6] Display car with the highest mileage
[7] Display overall MPG for the entire inventory
[8] Display profit for all sold cars
Enter a number from 0 to 8 : 
Grading Elements

    All eight options are listed in the menu
    All eight options work correctly
    CarLotMain reads any required input and prints application output
    All required classes are submitted in a single zip file.

