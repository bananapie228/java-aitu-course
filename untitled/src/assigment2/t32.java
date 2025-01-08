package assigment2;

public class t32 {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.maxSpeed = 200;
        tesla.electricEnginePower = 300;
        System.out.println("Electric car created with max speed: " + tesla.maxSpeed + " km/h and engine power: " + tesla.electricEnginePower + " kW");
    }
}

class Vehicle {
    double maxSpeed;
}

class Car extends Vehicle {
    int wheelCount;
    double weight;
}

class ElectricCar extends Car {
    int electricEnginePower;
}
