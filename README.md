
The goal of this semester's project is to build software that runs the basic operations of a Car Lot.  At the heart of any business selling cars is knowing about each car in the inventory, so the first order of business is to define a Car class. You will be completing this project with the group assigned to you in Blackboard.

The Car Class
Define a new class, Car. The Car class should meet the following specifications: 
Attributes 
Your Car should have the following attributes:

    ID uniquely identifies each car.  An example ID might be "1985 Ferrari 308GT", but any string is a valid identifier
    Mileage  represents the number of miles the car has been driven. You can assume this value does not change 
    MPG reprents the Car's fuel efficiency in miles per gallong
    Cost represents the amount the Car Lot paid for the car
    SalesPrice represents the amount that the Car Lot is asking to purchase this car
    Sold is true if the Car has been sold, otherwise it is false to represent that is it available for sale
    PriceSold represents the amounf that the Car actually sold for.  Remember the SalesPrice is what the Car Lot asked for the Car, but the PriceSold is what the Car Lot actually accepted
    Profit. When a Car is sold, the Profit the CarLot makes on the Car is equal to the PriceSold minus the Cost of the Car

Constructors
Your Car class should provide 2 constructors:

    A default Constructor.
    A Constructor that is used to add a new Car to the CarLot's inventory. The constructor should take the following arguments:
        String id
        int mileage
        int mpg
        double cost
        double salesPrice

Accessors 
Your Car class should provide appropriate accessor methods for all of its attributes. 
Provide a toString() method that provides a human-consumable version of the Car instance.  Your toString() method should return something along the lines of: 
Car:    test1, Mileage:  10000, MPG  30, Sold:  Yes, Cost: $12500.00, Selling price: $17500.00, Sold For $18000.00, Profit: $5500.00
Implement the following 3 comparison methods

    int compareMPG(Car otherCar)returns
        a negative value (exact value doesn't matter--only that it be less than zero) if the current car gets fewer miles per gallon than otherCar
        a positive number  (exact value doesn't matter--only that it be greater than zero) if the current car gets more miles per gallon than otherCar
        0 if the two cars have exactly the same MPG (given that MPG is a double number, this will probably occur relatively infrequently)
    int compareMiles(Car otherCar) return
        a negative value (exact value doesn't matter--only that it be less than zero) if the current car has fewer miles than otherCar
        a positive number  (exact value doesn't matter--only that it be greater than zero) if the current car has more miles than otherCar
        and 0 if the two cars have exactly the same miles
    int comparePrice(Car otherCar) returns
        a negative value (exact value doesn't matter--only that it be less than zero) if the current car's price is less than the price of otherCar
        a positive number  (exact value doesn't matter--only that it be greater than zero) if the current car's price is more than the price of otherCar
        0 if the two cars have exactly the same price

Mutators
The Car class should have default mutators for all attributes.
In addition the Car class must provide a sellCar() method that takes the priceSold for a Car.  When a Car is sold, the following must happen:

    The Car is marked sold
    The priceSold attribute is updated appropriately 
    The profit is calculated 

JavaDoc
The attached .zip file core-javadoc.zip. Contains the JavaDoc for the Car class. Your implementation of the Car class should match the JavaDoc exactly. 
To view the JavaDoc, you must extract all of the files from the zip archive.  After extracting the files, click on the index.html file to view the JavaDoc.
The CarTester Class
In addition to the Car class, provide a CarTester class.  Your CarTester should have a main method that verifies that your Car class is working properly.  The CarTester class should do the following:

    Instantiate at least 2 Car objects
    Insure that both constructors work as specified. This is especially important for the constructor used to add a new Car to the inventory
    Insure that the sellCar() method works properly
    Test each of the Compare methods above by creating two Car objects and verifying that each possible return value (negative number, zero, or positive number) is generated as expected

Running your CarTester class should be an easy way to determine that everything is working properly. If something in your class does NOT work as expected, you should display an error message on the Console.  
Hints

    Eclipse will generate default accessor and mutator methods. From the package explorer, select the class, display the pop-up menu, select Source -> Generate Getters/Setters
    In addition to System.out,  Java also provides System.err, which is used to print out error messages.  System.err works identically to System.out, but the Eclipse console displays System.err text in red.  Use System.err to clearly indicate error conditions in your CarTester class or within the CarLot application.

Grading Elements

    Submission includes two classes: Car and CarTester
    Car has the required attributes, constructors, accessors, and mutators that match the provided JavaDoc
    Car works correctly
    Only CarTester has a main method
    CarTester does not fail silently. It displays an error message if appropriate

