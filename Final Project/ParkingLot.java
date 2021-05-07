import java.util.ArrayList;

public class ParkingLot {

    private String name;
    private int spots;
    private ArrayList<Vehicle> takenSpots;
    // private Steward steward;
    private ArrayList<String> DNR;
    
    /**
     * constructor
     * @param int spots
     * @param String name
     * @param Steward obj 
     */
    public ParkingLot(String name,int spots/**,Steward steward*/){
        this.name = name;
        this.spots = spots;
        // this.steward = steward;
        this.takenSpots = new ArrayList<Vehicle>();
        this.DNR = new ArrayList<String>();
    }

    /**
     * add to dnr list
     * @param obj
     */
    public void addDNR(String obj){
        String objName = " " + obj;
        this.DNR.add(objName);
    }

    /**
     * gets dnr list
     * @return DNR
     */
    public ArrayList<String> getDNR(){
        return this.DNR;
    }

    public String getName(){
        return name;
    }
 
    /**
     * constructor
     */
    public ParkingLot(){
        this.spots = 0;
        this.takenSpots = new ArrayList<Vehicle>();
    }

    /**
     * gets spots 
     * @return int spots
     */
    public int getSpots(){
        return this.spots;
    }

    /**
     * sets parking spots
     * @param int 
     */
    public void setSpots(int amount){
        this.spots += amount;
    }

    /**
     * gets arraylist of vehicles
     *@return ArryaList<Vehicle> takenspots;
     */
    public ArrayList<Vehicle> getTakenSpots(){
        return this.takenSpots;
    }

    /**
     * adds vehicle to takenspots
     *@param Vehicle obj
     */
    public void addVehicle(Vehicle obj){
        this.takenSpots.add(obj);
    }

    /**
     * toString method
     * @return String 
     */
    public String toString(){
        return this.name + " " + this.spots;
    }


    

}
