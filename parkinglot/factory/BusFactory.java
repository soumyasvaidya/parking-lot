package parkinglot.factory;

import parkinglot.vehicle.Bus;
import parkinglot.vehicle.Vehicle;

public class BusFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle(String licenseNumber) {
        // TODO Auto-generated method stub
        return new Bus(licenseNumber);
    }
    
}
