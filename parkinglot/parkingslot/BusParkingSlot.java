package parkinglot.parkingslot;

public class BusParkingSlot extends ParkingSlot{

    public BusParkingSlot(String slotId) {
        super(slotId);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getSlotType() {
        // TODO Auto-generated method stub
        return "BUS";
    }
    
}
