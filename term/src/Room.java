
public class Room{
	private int roomNumber;
	private int capacity; //최대 인원
	private boolean isUsed;
	
	public Room()
	{
		this.roomNumber = 0;
		this.capacity = 0;
		this.isUsed = false;
	}
	
	public Room(int roomNumber, int capacity, boolean isUsed)
	{
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.isUsed = isUsed;
	}
	
	public void setRoom(int roomNumber, int capacity, boolean isUsed)
	{
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.isUsed = isUsed;
	}
	
	
	public void setUsed()
	{
		this.isUsed = true;
	}
	
	public int getroomNumber()
	{
		return 	this.roomNumber;
	}
	
	public int getcapacity()
	{
		return 	capacity;
	}
	
	public boolean getUsed()
	{
		return this.isUsed;
	}
}

