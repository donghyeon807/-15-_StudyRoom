import java.util.ArrayList;
import java.util.Scanner;

public class Member extends Person implements PersonInterface{
	private int memberID;
    private int memberPW;
    private int memberWallet;

    //default constructor
    public Member(){
        super();
        memberWallet = 0;
        memberID = 0;
        memberPW = 0;
    }

    //constructor
    public Member(String nameInput, int IDinput, int PWinput, int moneyInput){
        super(nameInput);
        memberID = IDinput;
        memberPW = PWinput;
        memberWallet = moneyInput;
    }

    //get PW
    public int getPW(){
        return memberPW;
    }
    
    //get ID
    public int getID() {
    	return memberID;
    }
    
    //get balance
    public int getMoney() {
    	return memberWallet;
    }
    
    //create new member
    public static Member newUser(ArrayList<Member> testmember){
        String inputname;
        int inputID;
        int inputPW;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("\t===Creating new member account===");
        System.out.println("-Enter your name");
        inputname = keyboard.next();
        System.out.println("-Enter your ID, ID should be an unique integer number");
        inputID = keyboard.nextInt();
        //check for duplicate ID
        while(findID(testmember, inputID) == true) {
        	System.out.println("-ID already exists. Enter new ID");
            inputID = keyboard.nextInt();
        }
        System.out.println("-Enter your password, Password should be longer than 8 digits");
        inputPW = keyboard.nextInt();
        //check for PW length
        while((int)(Math.log10(inputPW) + 1) < 8){
        	System.out.println("-Error: Password should have 8 letters or more, Enter new password");
        	inputPW = keyboard.nextInt();
        }

        Member tempRegUser = new Member(inputname, inputID, inputPW, 0);

        return tempRegUser;
    }
    
    //charge money to account's balance
    public static void chargeWallet(ArrayList<Member> testmember) {
    	int IDinput;
    	int moneyInput;
    	Scanner keyboard = new Scanner(System.in);
    	
    	System.out.println("\t===Charging balance===");
    	System.out.println("-Enter ID to charge");
    	IDinput = keyboard.nextInt();
    	
    	while(findID(testmember, IDinput) != true) {
    		System.out.println("-ID not found. Enter ID to charge");
        	IDinput = keyboard.nextInt();
    	}
    	
    	System.out.println("-Insert bill, in 1000won increment");
    	moneyInput = keyboard.nextInt();
    	
    	for(int i = 0; i < testmember.size(); i++) {
    		if(IDinput == testmember.get(i).memberID) {
    			testmember.get(i).memberWallet = moneyInput + testmember.get(i).memberWallet;
    			System.out.println("-Charging Complete. " + testmember.get(i).getName() + " , Your balance is now " + testmember.get(i).memberWallet + " won.");
    		}
    	}
    }
    
    //registered user login
    public static boolean login(ArrayList<Member> testmember) {
    	int IDinput;
    	int PWinput;
        System.out.println("\t===Member Login===");

        Scanner keyboard = new Scanner(System.in);
       
        System.out.println("-Enter ID");
        IDinput = keyboard.nextInt();
        System.out.println("-Enter password");
        PWinput = keyboard.nextInt();

        while(findID(testmember, IDinput, PWinput) != true){
        	System.out.println("-ID or PW mismatch");
    		System.out.println("-Enter ID");
        	IDinput = keyboard.nextInt();
        	System.out.println("-Enter password");
        	PWinput = keyboard.nextInt();
        }

        return true;
    }
    
    //check for existence of user ID
    public static boolean findID(ArrayList<Member> testmember, int inputID) {
    	for(int i = 0; i < testmember.size(); i++) {
    		if(inputID == testmember.get(i).memberID) {
    			return true;
    		}
    	}
		return false;
    }
    
    //overloading findID method, adding PW match
    public static boolean findID(ArrayList<Member> testmember, int inputID, int inputPW) {
    	for(int i = 0; i < testmember.size(); i++) {
    		if(inputID == testmember.get(i).memberID && inputPW == testmember.get(i).memberPW) {
    			return true;
    		}
    	}
		return false;
    }

}
