package parkinglot.factory;

import parkinglot.vehicle.Car;
import parkinglot.vehicle.Vehicle;

public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle(String licenseNumber) {
        return new Car(licenseNumber);
    }

   
    
}
