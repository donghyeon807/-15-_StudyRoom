import java.util.*;

public class PersonDemo{
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int membercount = 0;
		int guestcount = 0;
		int sel;
		

		//initialize objects
        ArrayList<Manager> testmanager = new ArrayList<Manager>();
        Manager manager1 = new Manager("Kim", 111, 12345);
        testmanager.add(manager1);
        ArrayList<Member> testmember = new ArrayList<Member>();
        ArrayList<Guest> testguest = new ArrayList<Guest>();
        
        //test all methods
        while(true) {
        	System.out.println("Input 0 to end cycle and exit, input else to keep running program");
        	sel = keyboard.nextInt();
        	
        	if(sel == 0) {
        		System.exit(0);
        	}
        	else {
        		
        		//test manager login method
                if(Manager.login(testmanager) == true) {
                	System.out.println("Manager login successful");
                }
                
                //test member creating method
                System.out.print("Input numbers of members to create: ");
                membercount = keyboard.nextInt();
                for(int i = 0; i < membercount; i++) {
                	Member newmember;
                	newmember = Member.newUser(testmember);
                	
                	testmember.add(newmember);
                }
                
                //print all members
                for(int i = 0; i < testmember.size(); i++) {
                	System.out.println(testmember.get(i).getName() + " " + testmember.get(i).getID() + " " + testmember.get(i).getPW() + " " + testmember.get(i).getMoney());
                }
                
                //test member login method
                if(Member.login(testmember) == true) {
                	System.out.println("Member login successful");
                }
                
                //test member charging method
                Member.chargeWallet(testmember);
                
                //test guest creating method
                System.out.print("Input numbers of guest to create: ");
                guestcount = keyboard.nextInt();
                for(int i = 0; i < guestcount; i++) {
                	Guest newguest;
                	newguest = Guest.newGuest();
                	
                	testguest.add(newguest);
                }
                
                //print all guests
                for(int i = 0; i < testguest.size(); i++) {
                	System.out.println(testguest.get(i).getName() + " " + testguest.get(i).getGuestID());
                }
                
        	}
        	
        }
        
	}
}
