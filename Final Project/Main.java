import java.io.*;
import java.util.*;

/**
 * Driver for app
 */
public class Main {

    private ArrayList<Customer> cust;
    private ArrayList<ParkingLot> lots;
    private Admin admin;

    /**
     * Constructor
     * @throws FileNotFoundException
     */
    public Main() throws FileNotFoundException{
        this.cust = popCustomers();
        this.lots = popLots();
        this.admin = popAdmin();
    }

    /**
     * populate the custs list
     * @return ArrayList<Customer>
     * @throws FileNotFoundException
     */
    public ArrayList<Customer> popCustomers() throws FileNotFoundException{
        File obj = new File("customer.txt");
        Scanner in = new Scanner(obj);
        ArrayList<Customer> output = new ArrayList<Customer>();
        while (in.hasNextLine()){
            if (in.next().equals("STOP")){
                break;
            }
            // String firstName = in.nextLine();
            // String lastName = in.nextLine();
            // String name = firstName +" "+ lastName;
            String name = in.nextLine();

            // System.out.println(name);
            String pass = in.nextLine();
            String type = in.nextLine();
            String make = in.nextLine();
            String model = in.nextLine();
            int year = in.nextInt();
            in.nextLine();
            String loc = in.nextLine();
            Customer toAdd = new Customer(name, pass, new Vehicle(type,make,model,year));
            toAdd.setCarLoc(loc);
            output.add(toAdd);
        }
        in.close();
        return output; 
    }

    /**
     * populate the ParkingLot list
     * @return ArrayList<ParkingLot>
     */
    public ArrayList<ParkingLot> popLots() throws FileNotFoundException{
        File obj = new File("parkinglots.txt");
        Scanner in = new Scanner(obj);
        ArrayList<ParkingLot> output = new ArrayList<ParkingLot>();
        while (in.hasNext()){
            if(in.next().equals("STOP")){
                break;
            }
            String name = in.nextLine();
            String pass = in.nextLine();
            int spots = in.nextInt();
            Steward tmp = new Steward(spots, name,pass);

            output.add((ParkingLot)tmp);
        }
        in.close();
        return output;
    }

    /**
     * populate admin from admin.txt
     * @return Admin
     * @throws FileNotFoundException
     */
    public Admin popAdmin() throws FileNotFoundException{
        File obj = new File("admin.txt");
        Scanner in = new Scanner(obj);
        if (!in.hasNext()){
            in.close();
            return new Admin();
        }
        else{
            String pass = in.nextLine();
            in.close();
            return new Admin(pass);
        }

        
    }
    

    /**
     * checks for password match
     * @param String pass
     * @return boolean
     */
    public boolean passMatchAdmin(String pass){
        return admin.getPass().equals(pass);
    }

    /**
     * gets customer list
     * @return ArrayList<Customer>
     */
    public ArrayList<Customer> getCust(){
        return this.cust;
    }

    /**
     * gets lots list
     * @return ArrayList<ParkingLot>
     */
    public ArrayList<ParkingLot> getLots(){
        return this.lots;
    }

    /**
     * saves data
     * @throws FileNotFoundException
     */
    public void save() throws FileNotFoundException{
        this.saveCust();
        this.saveLots();
        this.saveAdmin();
        System.out.println("Goodbye!");
    }

    /**
     * saves customer data to customer.txt
     * @throws FileNotFoundException
     */
    public void saveCust() throws FileNotFoundException{
        PrintWriter wr = new PrintWriter(new File("customer.txt"));
        for (int i = 0; i < cust.size();i++){
            Customer tmp = cust.get(i);
            wr.println("name " + tmp.getName().substring(1,tmp.getName().length()));
            wr.println(tmp.getPass());
            wr.println(tmp.getCar().getType());
            wr.println(tmp.getCar().getMake());
            wr.println(tmp.getCar().getModel());
            wr.println(tmp.getCar().getYear());
            wr.println(tmp.getCarLoc());
        }
        wr.print("STOP");
        wr.close();
    }

    /**
     * saves parking lot data to parkinglots.txt
     */
    public void saveLots() throws FileNotFoundException{
        PrintWriter wr = new PrintWriter(new File("parkinglots.txt"));
        for (int i = 0; i < lots.size();i++){
            ParkingLot tmp = lots.get(i);
            wr.println("name " + tmp.getName().substring(1,tmp.getName().length()));
            wr.println(((Steward)tmp).getPass());
            wr.println(tmp.getSpots());
        }
        wr.print("STOP");
        wr.close();
    }

    /**
     * saves admin info to admin.txt
     * @throws FileNotFoundException
     */
    public void saveAdmin() throws FileNotFoundException{
        PrintWriter wr = new PrintWriter(new File("admin.txt"));
        wr.println(admin.getPass());
        wr.close();
    }

    /**
     * log in customer
     * @param name
     * @return Customer
     */
    public Customer custLogin(String name,Scanner in){
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter name:");
        // String name = in.nextLine();
        // in.nextLine();
        for (int i = 0; i < cust.size();i++){
            if (cust.get(i).getName().equals(name)){
                Customer tmp = cust.get(i);
                System.out.println("Enter Password");
                String pass = in.nextLine();
                if (tmp.passMatch(pass)){
                    // in.close();
                    return tmp;
                }
            }
        }
        // in.close();
        return null;
    }

    /**
     * running customer account
     */
    public void runCust(Scanner in){
        // in.nextLine();
        // Scanner in = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String tmpName = in.nextLine();
        String name = " " + tmpName;
        // System.out.println("input"  + name );
        // in.close();
        Customer user = custLogin(name,in);
        if (user == null){
            System.out.println("Name not in system or Password did not match");
            // in.close();
            return;
        }
        // in.nextLine();
        String menu = "1: Park\n2: Retrive Vehicle\n3: Pay invoice\n4: Change password\n5: Log out";
        boolean run = true;
        while (run){
        
            // if (user == null){
            //     System.out.println("Name not in system or Password did not match");
            //     break;
            // }
            // Scanner it = new Scanner(System.in);
            System.out.println(menu);
            // String no = in.nextLine();
            int choice = in.nextInt();
            // int choice = Integer.parseInt(no);
            if (choice == 1){
                
                if (!user.getCarLoc().equals("")){
                    System.out.println("Vehicle already parked");
                }
                else{
                    in.nextLine();
                    listLots();
                    System.out.println("Enter Parking lot name");
                    String Name = in.nextLine();
                    String lotName = " " + Name;
                    ParkingLot ToPark = findLot(lotName);
                    if (ToPark != null){
                        // ToPark.getSteward().receiveRequest(user, "park");
                        ((Steward)ToPark).receiveRequest(user, "park");
                        System.out.println("Request sent");
                    }
                }
                // in.close();
            }
            else if(choice == 2){
                if (user.getCarLoc().equals("")){
                    System.out.println("Vehicle not parked");
                }
                else{
                    ParkingLot toGet = findLot(user.getCarLoc());
                    // toGet.getSteward().receiveRequest(user,"retreive");
                    ((Steward)toGet).receiveRequest(user, "retreive");
                    System.out.println("Request sent");
                }
                // in.close();
            }
            else if(choice == 3){
                if (user.getBalance() != 0){
                    System.out.println("Current Balance: " + user.getBalance());
                    System.out.println("Enter pay amount");
                    int amount = in.nextInt();
                    user.subBalance(amount);
                    System.out.println(amount + " paid");
                }
                else{
                    System.out.println("No balance to pay");
                }
                // in.close();
            }
            else if(choice == 4){
                
                user.changePass(in);
                // in.close();
            }
            else if(choice == 5){
                run = false;
                // in.close();
            }
            else{
                System.out.println("Choice unavailable");
                // in.close();
            }
            // it.close();
        }
        // in.close();
    }

    /**
     * finds the parking lot with the arg name
     * @param String name
     * @return ParkingLot
     */
    public ParkingLot findLot(String name){
        for (int i = 0;i < lots.size();i++){
            if (lots.get(i).getName().equals(name)){
                return lots.get(i);
            }
        }
        System.out.println("No Parking Lot with name " + name);
        return null;
    }

    /**
     * logs in steward
     * @return ParkingLot
     */
    public ParkingLot stewLogin(String name,Scanner in){
        // Scanner in = new Scanner(System.in);
        for (int i = 0; i < lots.size();i++){
            // System.out.println(lots.get(i).getName());
            if (lots.get(i).getName().equals(name)){
                ParkingLot tmp = lots.get(i);
                System.out.println("Enter Password");
                String pass = in.nextLine();
                if (((Steward)tmp).checkPass(pass)){
                    // in.close();
                    return tmp;
                }
            }
        }
        // in.close();
        return null;
    }

    /**
     * steward menu
     */
    public void runSteward(Scanner in){
        // Scanner in = new Scanner(System.in);
        in.nextLine();
        System.out.println("Enter Parking Lot name:");
        String tmpName = in.nextLine();
        String name = " " + tmpName;
        ParkingLot user = this.stewLogin(name,in);
        boolean run = true;
        String menu = "1: Respond requests\n2: Change password\n3: Log out";
        while (run){
            if (user == null){
                System.out.println("User not in system or Password not matched");
                run = false;
                break;
            }
            System.out.println(menu);
            
            int choice = in.nextInt();
            if (choice == 1){
                ((Steward)user).inbox(in);
                // in.nextLine();
                
            }
            else if(choice == 2){
                // user.getSteward().changePass(in);
                ((Steward)user).changePass(in);
            }
            else if(choice == 3){
                run = false;
            }
            else {
                System.out.println("Choice not valid");
            }
        }
        // in.nextLine();
        // in.close();
    }
    
    /**
     * admin menu
     */
    public void runAdmin(Scanner in) throws FileNotFoundException{
        // Scanner in = new Scanner(System.in);
        in.nextLine();
        System.out.println("Enter Password");
        String pass = in.nextLine();
        Admin user;
        if (passMatchAdmin(pass)){
            user = this.admin;
        }else{
            System.out.println("Password does not match");
            // in.close();
            return;
        }
        boolean start = true;
        String menu = "1: Edit Steward\n2:Edit Parking Lots\n3: Change Password\n4: Add Parking lot\n5: Log out";
        // String sub1 = "1: Add Steward\n2: Remove Steward";
        String sub2 = "1:Change number of spots\n2: Add to DNR\n3:Remove Parking lot";
        // in.nextLine();
        while (start){
            System.out.println(menu);
            int choice = in.nextInt();
            if (choice == 1 || choice == 2){
                this.listLots();
                in.nextLine();
                System.out.println("Enter name of Parking Lot");
                String tmpName = in.nextLine();
                String name = " " + tmpName;
                ParkingLot toEdit = findLot(name);
                if (toEdit != null){
                    if (choice == 1){
                        // System.out.println(sub1);
                        System.out.println("Erase current Steward?\n1: yes\n 2:no");
                        int stewChoice = in.nextInt();
                        if (stewChoice == 1){
                            // if (toEdit.hasSteward()){
                            //     System.out.println("Parking Lot already has Steward");
                            // }
                            // else{
                            //     toEdit.setSteward(new Steward());
                            //     System.out.println("Steward added");
                            // }
                            user.changeSteward(toEdit);
                        }
                        else if (stewChoice == 2){
                            // toEdit.removeSteward();
                            // System.out.println("Steward removed");

                        }
                        else{
                            System.out.println("Invalid Choice");
                        }

                    }
                    else if(choice == 2){
                        System.out.println(sub2);
                        int lotChoice = in.nextInt();
                        
                        if (lotChoice == 1){
                            System.out.println("Enter amount to change (negative number if subtracting)");
                            int amount = in.nextInt();
                            toEdit.setSpots(amount);
                            System.out.println("Spots changed to " + toEdit.getSpots());
                        }
                        else if (lotChoice == 2){
                            in.nextLine();
                            System.out.println("Enter name of customer");
                            String tmpDNRname = in.nextLine();
                            String DNRname = " " + tmpDNRname;
                            if (!isCustomer(DNRname)){
                                System.out.println("No customer with that name");
                            }
                            else{
                                toEdit.addDNR(DNRname);
                                System.out.println("Name added to DNR list");
                            }
                        }
                        else if (lotChoice == 3){
                            lots.remove(toEdit);
                            System.out.println("Parking lot removed");
                        }
                        else{
                            System.out.println("Invalid choice");
                        }
                    }
                }
            }
            else if (choice == 3){
                in.nextLine();
                System.out.println("Enter new password");
                String newPass = in.nextLine();
                user.changePass(newPass);
            }
            else if(choice == 4){
                in.nextLine();
                System.out.println("Enter name of new parking lot");
                String tmpname = in.nextLine();
                String name = " " + tmpname;
                System.out.println("Enter spot count");
                int spot = in.nextInt();
                lots.add((ParkingLot)new Steward(spot, name));
                System.out.println("Parking lot added");
                in.nextLine();
            }
            else if (choice == 5){
                start = false;
            }

            else{
                System.out.println("Choice invalid");
            }
        }
        // in.close();
    }


    /**
     * checks if name given is a current customer
     * @param String name
     * @return boolean
     */
    public boolean isCustomer(String name){
        for (int i = 0; i < cust.size();i++){
            if (cust.get(i).getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    /**
     * list the current parking lots
     */
    public void listLots(){
        for (int i = 0; i < lots.size();i++){
            System.out.println(lots.get(i).getName() + " spots: "+ lots.get(i).getSpots());
        }
    }


    /**
     * creates new customer accoutn
     * @param Scanner
     */
    public void create(Scanner in){
        // Scanner it = new Scanner(System.in);
        // ArrayList<String> outp = new ArrayList<String>(Arrays.asList("Enter Name","Enter Password","Enter Vehicle type","Enter Make","Enter Model","Enter year"));
        // System.out.println("");
        System.out.println("Enter Name");
        String TMpname = in.nextLine();
        String name = " " + TMpname;
        System.out.println("Enter Password");
        String pass = in.nextLine();
        System.out.println("Enter Vehicle type");
        String type = in.nextLine();
        System.out.println("Enter Make");
        String make = in.nextLine();
        System.out.println("Enter Model");
        String model = in.nextLine();
        System.out.println("Enter year");
        int year = in.nextInt();
        if (isCustomer(name)){
            System.out.println("Account already exists");
        }
        else{
            Customer newCust = new Customer(name,pass,new Vehicle(type,make,model,year));
            cust.add(newCust);
            // in.close();
            System.out.println("Account created succesfully");
        }
    }

    

    /**
     * starts program and saves when quit
     */
    public static void main(String[] args) throws FileNotFoundException{
        Main test = new Main();
        Scanner in = new Scanner(System.in);
        // ArrayList<Customer> cut = test.getCust();
        // ArrayList<ParkingLot> lot = test.getLots();
        String mainMenu = "1: Log in as Customer\n2: Log in as Steward\n3: Log in as Admin\n4: Create account\n5: To quit";
        boolean running = true;
        while (running){
            // Scanner in = new Scanner(System.in);
            System.out.println(mainMenu);
            int choice = in.nextInt();
            // in.nextLine();
            if (choice == 1){
                // in.close();
                in.nextLine();
                test.runCust(in);
            }
            else if(choice == 2){
                // in.close();
                test.runSteward(in);
            }
            else if(choice == 3){
                // in.close();
                test.runAdmin(in);
            }
            else if (choice == 4){
                // in.close();
                in.nextLine();
                test.create(in);
            }
            else if (choice == 5){
                // in.close();
                running = false;
            }
            else{
                // in.close();
                System.out.println("Choice not valid");
            }
        }
        // for (int i = 0; i < test.lots.size();i++){
        //     System.out.println(test.lots.get(i).getName() + " " + test.lots.get(i).getSpots());
        // }
        // System.out.println(test.admin.getPass());
        in.close();
        test.save();
    }
}