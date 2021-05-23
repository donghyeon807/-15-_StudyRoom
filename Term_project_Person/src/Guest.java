import java.util.Scanner;

public class Guest extends Person{
	private static int guestCount = 0;
    private int guestID;

    //default constructor
    public Guest(){
        super();
        guestID = 0000;
    }

    //constructor
    public Guest(String nameinput, int IDinput){
        super(nameinput);
        guestID = IDinput;
    }
    
    //get guest ID
    public int getGuestID(){
        return guestID;
    }
    
    //create new guest
    public static Guest newGuest(){
        String inputname;
        int inputID;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("\t===Creating new guest account===");
        System.out.println("-Enter your name");
        inputname = keyboard.next();
        
        inputID = guestCount + 1;
        
        guestCount++;
        
        Guest tempGuestUser = new Guest(inputname, inputID);
        
        System.out.println("-" + tempGuestUser.getName() + ", Your temporary guest ID is: " + tempGuestUser.getGuestID());

        return tempGuestUser;
    }
}