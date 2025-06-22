package parkinglot.factory;

import parkinglot.parkingslot.BusParkingSlot;
import parkinglot.parkingslot.ParkingSlot;

public class BusParkingSlotFactory implements ParkingFactory {

    @Override
    public ParkingSlot createParkingSlot(String slotId) {
        // TODO Auto-generated method stub
        return new BusParkingSlot(slotId);
    }
    
}
