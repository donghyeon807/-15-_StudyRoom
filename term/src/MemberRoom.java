
public class MemberRoom extends Room implements Roominter{
	
	public MemberRoom()
	{
		super();
	}
	
	public MemberRoom(int a, int b, boolean c)
	{
		super(a,b,c);
	}
	
	@Override
	public void printRoom() {
		System.out.println("This Room is Member Room");
		System.out.println("Room Number : " + this.getroomNumber());
		System.out.println("Capacity : " + this.getcapacity());
		if(this.getUsed() == true)
			System.out.println("This room is Used");
		else
			System.out.println("This room is empty");
	}

	@Override
	public void assignRoom() {
		System.out.println("Member Room Assign");
	}
}