import java.util.*;

/**
 * customer class
 */
public class Customer{
    
    private String name;
    private String pass;
    private Vehicle car;
    private String carLocation ="";
    private int balance = 0;

    /**
     * constructor
     * @param name
     * @param pass
     * @param obj
     */
    public Customer(String name, String pass,Vehicle obj){
        this.name = name; 
        this.pass = pass;
        this.car = obj;
    }

    

    /**
     * gets balance
     * @return int
     */
    public int getBalance(){
        return balance;
    }

    /**
     * gets vehicle
     * @return Vehicle
     */
    public Vehicle getCar(){
        return car;
    }

    /**
     * sets car location
     * @param String name
     */
    public void setCarLoc(String name){
        this.carLocation = name;
    }

    /**
     * gets car location
     * @return string
     */
    public String getCarLoc(){
        return carLocation;
    }

    /**
     * adds to balance
     * @param int bal
     */
    public void addBalance(int bal){
        this.balance += bal;
    }

    /**
     * subtracts from balance
     * @param int bal
     */
    public void subBalance(int bal){
        this.balance -= bal;
    }
    
    /**
     * request to park at parking lot
     * @param ParkingLot obj
     */
    public void request(ParkingLot obj){
        // obj.getSteward().receiveRequest(this,"park");
        ((Steward)obj).receiveRequest(this, "park");
    }

    /**
     * retreive car 
     * @param ParkingLot obj
     */
    public void retreive(ParkingLot obj){
        // obj.getSteward().receiveRequest(this, "retreive");
        ((Steward)obj).receiveRequest(this, "retreive");
    }

    /**
     * pay for parking
     * @param ParkingLot obj
     */
    public void pay(ParkingLot obj){
        // obj.getSteward().getPayment(this);
        ((Steward)obj).getPayment(this);
        System.out.println("Payment Successful");
    }

    /**
     * gets name of customer
     * @return String
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * toString method
     * @return String
     */
    public String toString(){
        return this.name + " " + this.car.getYear() + " " + this.car.getModel() + " " + this.car.getMake();
    }


    /**
     * checks password
     * @param String password
     * @return boolean
     */
    public boolean passMatch(String password){
        return this.pass.equals(password);
    }

    /**
     * sets the password
     * @param String
     */
    private void setPass(String pass){
        this.pass = pass;
    }

    /**
     * tmp method to get pass word 
     * Will change to have encryption if time allows
     * @return String
     */
    public String getPass(){
        return this.pass;
    }

    /**
     * changes password
     */
    public void changePass(Scanner in){
        // Scanner in = new Scanner(System.in);
        System.out.println("Enter Old Password: ");
        String old = in.next();
        if (passMatch(old)){
            System.out.println();
            System.out.println("Enter New Passwrod: ");
            String newPass = in.next();
            this.setPass(newPass);
            System.out.println("Password Changed!");
        }
        else{
            System.out.println("Password Does Not Match");
        }
        // in.close();
    }

     
}