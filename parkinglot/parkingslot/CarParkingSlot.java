package parkinglot.parkingslot;

public class CarParkingSlot extends ParkingSlot{

    public CarParkingSlot(String slotId){
        super(slotId);
    }

    @Override
    public String getSlotType() {
        // TODO Auto-generated method stub
        return "CAR";
    }
    
}
