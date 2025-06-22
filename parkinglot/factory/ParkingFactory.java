package parkinglot.factory;

import parkinglot.parkingslot.ParkingSlot;

public interface ParkingFactory {
    public ParkingSlot createParkingSlot(String slotId);
}
