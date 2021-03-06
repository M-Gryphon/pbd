public class VariablesAndNames
{
  public static void main ( String[] args )
  {
    //Declare int variables
    int cars, drivers, passengers, space_in_car, average_passengers_per_car, cars_not_driven, cars_driven;

    //Declare double variables
    double carpool_capacity ;

    //Initialize variables with a value
    cars = 100;
    space_in_car = 4;
    drivers = 30;
    passengers = 90;
    cars_not_driven = cars - drivers;
    cars_driven = drivers;
    carpool_capacity = cars_driven * space_in_car;
    average_passengers_per_car = passengers / cars_driven;

    //Print out strings and the value of the above variables
    System.out.println("There are " + cars + " cars available.");
    System.out.println("There are only " + drivers + " drivers available.");
    System.out.println("There will be " + cars_not_driven + " empty cars today.");
    System.out.println("We need to put about " + average_passengers_per_car + " people in each car.");
  }
}
