package parkinglot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import parkinglot.parkingslot.ParkingSlot;
import parkinglot.vehicle.Vehicle;

public class ParkingLot {
    private List<ParkingSlot> parkingslots=new ArrayList<>();
    private Map<Vehicle,ParkingSlot> parkedVehicle=new HashMap<>();
    private int capacity;
    private static ParkingLot instance;
    
    private ParkingLot(List<ParkingSlot> parkingslots, Map<Vehicle, ParkingSlot> parkedVehicle, int capacity) {
        this.parkingslots = parkingslots;
        this.parkedVehicle = parkedVehicle;
        this.capacity = capacity;
    }
   
    public ParkingLot() {
    }
    public List<ParkingSlot> getParkingslots() {
        return parkingslots;
    }
    public void setParkingslots(List<ParkingSlot> parkingslots) {
        this.parkingslots = parkingslots;
    }
    public Map<Vehicle, ParkingSlot> getParkedVehicle() {
        return parkedVehicle;
    }
    public void setParkedVehicle(Map<Vehicle, ParkingSlot> parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    public int getAvailableCapacity(){
        return capacity-parkedVehicle.size();
    }

    public boolean parkVehicle(Vehicle vehicle,ParkingSlot ps){
            if(ps.slotAvailable()){
                parkedVehicle.put(vehicle, ps);
                ps.setAvailable(false);
                System.out.println("parked:: "+vehicle.getLicensePlate()+" at::"+ps.getSlotId());
                return true;
            }
            else{
                System.out.println("slot occupied");
                return false;
            }

    }

    public void removeVehicle(Vehicle vehicle){
        var slot=parkedVehicle.get(vehicle);
        slot.setAvailable(true);
    }

    public static ParkingLot getParkingLot(List<ParkingSlot> ps,Map<Vehicle,ParkingSlot> vp,int capacity ){
        if(instance==null){
            instance=new ParkingLot(new ArrayList<>(), new HashMap<>(), capacity);
            
        }
        return instance;
    }
    
}
