package Exercise4_4;

public class Fruits {
	
	private String name;
	
	public Fruits() { //constructor with no argument
		name=" ";
	}
	
	public Fruits(String n) {//constructor with argument
		name = n;
	}
	
	public String printBenefit() {
		return "People who eat more fruits as part of an overall healthy diet are likely to have a reduced risk of some chronic diseases.";
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {//overriding method
		return name + " constructor is invoked" + "\nFruits\t\t: " + getName();
	}
	
}
