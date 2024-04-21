package FactoryPattern;

public class AutoFactory extends VehicleFactory {

    @Override
    Vehicle getVehicle() {
        // TODO Auto-generated method stub
        return new Auto();
    }

}