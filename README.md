
Create an abstract class Vehicle.  A Vehicle has a single instance variable of type String named "vehicleType" that describes the vehicle.  It has an abstract method getTires that takes no parameters and returns an ArrayList<Tire> object that describes each Tire of the vehicle.  A Tire class has been provided.  Vehicle has a single constructor that takes the vehicle type as a parameter.

Create a class Bicycle that extends Vehicle that has two Tires, both of type "skinny".  Bicycle should have a single default constructor.

Create a class Dragster that extends Vehicle and has four Tires, two of type "slick" and two of type "medium".  Dragster should have a single default constructor.

Write a tester program to test Bicycle and Dragster objects.  Use declarations such as
  Vehicle b = new Bicycle();
in your tester.
