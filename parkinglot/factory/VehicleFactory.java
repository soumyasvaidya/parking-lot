package parkinglot.factory;

import parkinglot.vehicle.Vehicle;

public interface VehicleFactory {
    
    public Vehicle createVehicle(String licenseNumber);
}
