package parkinglot.vehicle;

public class Car extends Vehicle{

    public Car(String licensePlate) {
        super(licensePlate);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getVehicleType() {
        // TODO Auto-generated method stub
        return "CAR";
    }
    
}
