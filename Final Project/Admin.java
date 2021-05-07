

/**
 * admin class
 */
public class Admin { 

    private String password;
    
    /**
     * Constructor
     * @param String
     */
    public Admin(String pass){
        this.password = pass;
    }

    /**
     * constructor
     */
    public Admin(){

        this.password = "password";
    }

    /**
     * gets password
     * @return String
     */
    public String getPass(){
        return this.password;
    }

    /**
     * change password
     * @param String
     */
    public void changePass(String pass){
        this.password = pass;
    }

    /**
     * add customer obj to DNR list
     * @param Customer obj
     * @param ParkingLot Pobj
     */
    public void addDNR(Customer obj, ParkingLot Pobj){
        Pobj.addDNR(obj.getName());
    }

    /**
     * add/remove parking spots
     * @param int 
     * @param ParkingLot obj
     */
    public void changeSpots(int amount, ParkingLot obj){
        obj.setSpots(amount);
    }

    /**
     * resets steward
     * @param ParkingLot
     */
    public void changeSteward(ParkingLot obj){
        ((Steward)obj).resetPass();
    }
    
}
