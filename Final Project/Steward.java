import java.util.*;

/**
 * steward class extends ParkingLot
 * only 1 steward per Parkinglot
 */
public class Steward extends ParkingLot {
    
    private Map<Customer,String> custRequest;
    private String password;

    /**
     * constructor 
     * @param String password
     */
    public Steward(String pass){
        super();
        this.password = pass;
        custRequest = new HashMap<Customer,String>();
    }

    /**
     * Constructor
     */
    public Steward(int spots, String name, String pass){
        super(name, spots);
        this.password = pass;
        custRequest = new HashMap<Customer,String>();
    }

    /**
     * Constructor
     */
    public Steward(int spots,String name){
        super(name,spots);
        this.password = "password";
        custRequest = new HashMap<Customer,String>();
    }


    /**
     * constructor
     */
    public Steward(){
        super();
        this.password = "password";
        custRequest = new HashMap<Customer,String>();
    }

    /**
     * sets a new password for Steward
     * @param String password
     */
    private void setPassword(String pass){
        this.password = pass;
    }

    /**
     * changes password of steward
     */
    public void changePass(Scanner in){
        // Scanner in = new Scanner(System.in);
        in.nextLine();
        System.out.println("Enter Current Password: ");
        String old = in.nextLine();
        if (this.password.equals(old)){
            System.out.println("Enter New Password: ");
            String NewPass = in.nextLine();
            this.setPassword(NewPass);
            System.out.println("PassWord Has Been Changed.");
        }
        else{
            System.out.println("Password Does Not Match Current");
        }
        // in.close();
    }

    /**
     * responds yes or no to customer's request
     * @param Customer obj
     * @return boolean
     */
    public void respond(Customer obj){
        boolean DNR = this.checkDNR(obj);
        // System.out.println(super.getSpots());
        // System.out.println(super.getName());
        if (!DNR && super.getSpots() > 0 && super.getTakenSpots().size() < super.getSpots()){
            this.takeVehicle(obj);
            System.out.println("Vehicle parked");
        }
        else{
            System.out.println("Unable to park");
        }
    }

    /**
     * check pass password
     * @param String
     * @return boolean
     */
    public boolean checkPass(String pass){
        return this.password.equals(pass);
    }
    /**
     * check DNR list
     * @return boolean
     */
    public boolean checkDNR(Customer obj){
        ArrayList<String> tmp = super.getDNR();
        if (!(tmp == null)){
            for (int i = 0; i< tmp.size();i++){
                if (tmp.get(i).equals(obj.getName())){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * takes the customers vehicle
     * @param Customer obj
     */
    public void takeVehicle(Customer obj){
        obj.setCarLoc(super.getName());
    }

    /**
     * return the vehicle to customer
     * @param Customer obj
     */
    public void returnVehicle(Customer obj){
        obj.setCarLoc("");
        invoice(obj);
    }

    /**
     * sends invoice to customer
     * @param Customer obj
     */
    public void invoice(Customer obj){
        obj.addBalance(10);
    }

    /**
     * gets the payment from customer obj
     * @param Customer obj
     */
    public void getPayment(Customer obj){
        obj.subBalance(10);
    }

    /**
     * moves vehicle to make space for bigger vehicle
     */
    public void move(){
        //TODO
    }

    /**
     * gets password
     * will try to chagne it to have encryption if time allows
     * @return String
     */
    public String getPass(){
        return this.password;
    }

    /**
     * gets hashmap of customer request
     * @return HashMap<Customer,String>()
     */
    public Map<Customer,String> getReq(){
        return custRequest;
    }

    /**
     * receives the request from customer
     * @param Customer
     * @param String
     */
    public void receiveRequest(Customer obj, String request){
        custRequest.put(obj, request);
    }
    
    /**
     * shows inbox for steward
     * @param Scanner in
     */
    public void inbox(Scanner in){
        in.nextLine();
        int i = 1;
        if (custRequest.size() == 0){
            System.out.println("No requests");
            return;    
        }
        else{
            for (Customer customer: custRequest.keySet()){
                System.out.println(i + ": " + customer.toString()+". Request: " + custRequest.get(customer));
                i++;
            }
        }
        // Scanner in = new Scanner(System.in);
        System.out.println("Enter Customer name to respond.");
        String tmpchoice = in.nextLine();
        String choice = " " + tmpchoice;
        boolean found = false;
        for (Customer customer:custRequest.keySet()){
            if (customer.getName().equals(choice)){
                found = true;
                // System.out.println(customer.getName());
                if (custRequest.get(customer).equals("park")){
                    this.respond(customer);
                    custRequest.put(customer,"Completed");
                }
                if (custRequest.get(customer).equals("retreive")){
                    this.returnVehicle(customer);
                    custRequest.put(customer,"Completed");
                }
            }
        }
        if (found == false){
            System.out.println("Invalid choice");
        }
        // in.nextLine();
        // in.close();
    }
    
    /**
     * resets password 
     */
    public void resetPass(){
        this.password = "password";
    }

}
