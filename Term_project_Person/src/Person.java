
public class Person {
	private String name;
	
	//default constructor
	public Person(){
	    name = null;
	}
	
	//constructor
	public Person(String nameinput){
	    name = nameinput;
	}

	//get object's name
	public String getName(){
        return name;
    }

}