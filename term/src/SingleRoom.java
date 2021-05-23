
public class SingleRoom extends Room implements Roominter{
	
	public SingleRoom()
	{
		super();
	}
	
	public SingleRoom(int a, int b, boolean c)
	{
		super(a,b,c);
	}
	
	@Override
	public void printRoom() {
		System.out.println("This Room is Single Room");
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