public class Car
{
    //Instance Variables

    private String licensePlate;

    private String model;

    private int weight;

    private double miles;

    //Constructor

    public Car(String carPlate, String carModel, int carWeight, double carMiles)
    {
        licensePlate = carPlate;
        model = carModel;
        weight = carWeight;
        miles = carMiles;
    }

    //Method That Prints Car Info
    public void printCarInfo()
    {
        System.out.println("License Plate: " + licensePlate);
        System.out.println("model: " + model);
        System.out.println("weight: " + weight);
        System.out.println("miles: " + miles);
    }
}
