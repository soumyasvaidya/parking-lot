package parkinglot;

import parkinglot.factory.BusFactory;
import parkinglot.factory.BusParkingSlotFactory;
import parkinglot.factory.CarFactory;
import parkinglot.factory.CarParkingSlotFactory;
import parkinglot.factory.ParkingFactory;
import parkinglot.factory.VehicleFactory;
import parkinglot.parkingslot.ParkingSlot;
import parkinglot.vehicle.Vehicle;

public class ParkingClient {
    public static void main(String[] args) {
        ParkingLot parkingLot=ParkingLot.getParkingLot(null, null, 10);
        ParkingFactory cpf=new CarParkingSlotFactory();
        ParkingFactory bpf=new BusParkingSlotFactory();

        ParkingSlot ps1=cpf.createParkingSlot("slot1");
        ParkingSlot ps2=bpf.createParkingSlot("slot2");

        VehicleFactory cvf=new CarFactory();
        VehicleFactory bvf=new BusFactory();

        Vehicle car=cvf.createVehicle("1234");
        Vehicle bus=bvf.createVehicle("82657");

        var parked=parkingLot.parkVehicle(bus, ps2);
        var parkedCar=parkingLot.parkVehicle(car, ps1);

        Vehicle car2=cvf.createVehicle("1102233");
        var parkedcar2=parkingLot.parkVehicle(car2, ps1);

        parkingLot.removeVehicle(car);
        parkedcar2=parkingLot.parkVehicle(car2, ps1);



    }
}
