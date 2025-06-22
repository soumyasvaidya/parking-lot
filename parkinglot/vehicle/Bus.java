package parkinglot.vehicle;

public class Bus extends Vehicle{

    public Bus(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public String getVehicleType() {
        return "BUS";
    }
    
}
