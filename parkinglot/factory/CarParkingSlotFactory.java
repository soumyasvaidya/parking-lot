package parkinglot.factory;

import parkinglot.parkingslot.CarParkingSlot;
import parkinglot.parkingslot.ParkingSlot;

public class CarParkingSlotFactory implements ParkingFactory {

    @Override
    public ParkingSlot createParkingSlot(String slotId) {
        // TODO Auto-generated method stub
        return new CarParkingSlot(slotId);
    }
    
}
