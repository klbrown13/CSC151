
In step 1 of the project, you created a class to represent a Car that is for sale. In step 2 of the project, you will create a CarLot class that manages all of the vehicles that are for sale.  The collection of vehicles that are for sale represent the CarLot's inventory. 
Note: The CarLot class requires successfully implementing the Car class developed in Step 1 of the project. 
The CarLot Class
Define a class CarLot. Your CarLot will have a single attribute, inventory, of the type ArrayList<Car>. Provide default accessor and mutator methods for the inventory attribute.
Accessors
Add the following accessor methods:

    Car findCarByIdentifier(String identifier).  Find the car with the specified identifer in the inventory. Return null if the Car is not found
    ArrayList<Car> getCarsInOrderOfEntry(). Return an ArrayList of all Cars in the inventory, ordered by their entry into the inventory. This method should return a copy of the inventory, not the inventory itself
    ArrayList<Car> getCardsSortedByMPG(). Return an ArrayList of all Cars in the inventory, sorted by MPG. This method should not sort the inventory, but should instead make a copy of the inventory and sort the copy
    Car getCarWithBestMPG(). Return the Car in the inventory with the highest MPG
    Car getCarWithHighestMileage(). Return the Car in the inventory with the highest mileage
    double getAverageMpg(). Return the average MPG of all Cars in the inventory
    double getTotalProfit(). Return the total profit of all cars in the inventory that have been sold

Mutators
Add the following mutator methods:

    void addCar(String id, int mileage, int mpg, double cost, double salesPrice).  Add a new Car with the specified id, mileage, mpg, cost, and salesPrice to the inventory
    void sellCar(String identifier, double priceSold ) throws IllegalArgumentException. Sell the Car identified by identirier for the priceSold. If the Car does not exist in the identifier, throw an IllegalArgument Exception with an appropriate error message

JavaDoc
The JavaDoc supplied in Step 1 of the project also contains documentation for the CarLot class. Your implementation of the CarLot class should match the JavaDoc exactly. 
To view the JavaDoc, you must extract all of the files from the zip archive.  After extracting the files, click on the index.html file to view the JavaDoc.
CarLotTesterClass
Write a tester class CarLotTester that verifies that your CarLot class is working properly.  CarLotTester should contain a main method. Specifically, your tester class should:

    Test that the addCar() and sellCar() methods work as expected
    Verify that the accessor methods work as expected by creating a CarLot  with an inventory of at least 2 Cars. Your code should call the appropriate accessor and if the correct Car is not returned, print an error message on the Console 

Hints

    If you did not complete successfully complete all parts of the Car class from Step 1, finish that before starting Step 2
    In Step 1 of the project, you implement several "compareTo" methods. Use those methods when implementing some of the accessor methods
    The getCarsSortedByMPG() will require sorting the ArrayList.  Modify the selection sort from Unit 7 to work with Cars and use the appropriate "compareTo" from Step 1

Grading Elements

    The submission contains Car, CarLot, and CarLotTester.  CarTester is ideally provided but is not required
    CarLot contains a single ArrayList<Car> attribute named inventory
    All CarLot accessor and mutator methods are implemented exactly as defined in the JavaDoc
    CarLotTester runs successfully
    CarLotTester prints an error message in the event a test fails

