import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends Person implements PersonInterface{
	private int managerID;
    private int managerKey;

    //default constructor
    public Manager() {
    	super();
    	managerID = 0000;
    	managerKey = 0000;
    }
    
    //constructor
    public Manager(String nameinput, int IDinput, int keyinput){
        super(nameinput);
        managerID = IDinput;
        managerKey = keyinput;
    }

    //get manager key
    public int getKey(){
        return managerKey;
    }
    
    //get manager id
    public int getID() {
    	return managerID;
    }
    
    //manager login
    public static boolean login(ArrayList<Manager> testmanager) {
    	int IDinput;
    	int PWinput;
        System.out.println("\t===Manager Login===");

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter ID");
        IDinput = keyboard.nextInt();
        System.out.println("Enter password");
        PWinput = keyboard.nextInt();

        while(findID(testmanager, IDinput, PWinput) != true) {
    		System.out.println("ID or PW mismatch");
    		System.out.println("Enter ID");
        	IDinput = keyboard.nextInt();
        	System.out.println("Enter password");
        	PWinput = keyboard.nextInt();
    	}

        return true;	
    }
    
    
    public static boolean findID(ArrayList<Manager> testmanager, int inputID, int inputPW) {
    	for(int i = 0; i < testmanager.size(); i++) {
    		if(inputID == testmanager.get(i).managerID && inputPW == testmanager.get(i).managerKey) {
    			return true;
    		}
    	}
		return false;
    }

}
