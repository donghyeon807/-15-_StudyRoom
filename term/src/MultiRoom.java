

public class MultiRoom extends Room implements Roominter{
	private int numberOfpeople;
	private boolean isBoard;
	
	public MultiRoom()
	{
		super();
	}
	
	public MultiRoom(int a, int b, boolean c)
	{
		super(a,b,c);
	}

	public void setNumberOfPeople(int numberOfpeople)
	{
		this.numberOfpeople = numberOfpeople;
	}
	
	public int getNumberOfPeople()
	{
		return this.numberOfpeople;
	}
	
	@Override
	public void printRoom() {
		System.out.println("This Room is Multi Room");
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
