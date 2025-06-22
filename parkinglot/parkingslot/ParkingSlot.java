package parkinglot.parkingslot; 

public abstract class ParkingSlot{
        protected String slotId;
        protected boolean isAvailable;

        public ParkingSlot(String slotId) {
            this.slotId = slotId;
            this.isAvailable = true;
        }
        public String getSlotId() {
            return slotId;
        }

        public void setSlotId(String slotId) {
            this.slotId = slotId;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailable(boolean isAvailable) {
            this.isAvailable = isAvailable;
        }

        public boolean slotAvailable(){
            return this.isAvailable;
        }

        public String getSlot(){
            return this.slotId;
        }

        public abstract String getSlotType();

}