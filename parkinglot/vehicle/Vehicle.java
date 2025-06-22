package parkinglot.vehicle;

public abstract class Vehicle {
    private String licensePlate;


    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }


    public abstract String getVehicleType();


    public String getLicensePlate() {
        return licensePlate;
    }


    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

}
