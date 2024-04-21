package FactoryPattern;

public class CarFactory extends VehicleFactory {

    @Override
    Vehicle getVehicle() {
        return new Car();
    }
}
