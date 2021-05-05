package Exercise4_4;

public class Cherry extends Fruits{
	
	private String type;
	private String colour; 
	private String placeofOrigin;
	
	public Cherry(String n, String ty, String c, String o) {//constructor with 4 arguments
		super(n);
		type = ty;
		colour = c;
		placeofOrigin = o;
		
		System.out.print("Fruit\t\t: " + n);
		switch(placeofOrigin) {
		case "Russia":
			System.out.print(Info());
			break;
		case "Turkey":
			System.out.print(Info("Dark Sweet Cheries"));
			break;
		case"Washington":
			System.out.print(Info("Rainier", "Yellow"));
			break;
		}
		
	}
	
	public String Info() {
		return "\nType\t\t: " + type + "\nColour\t\t: " + colour + "\nPlace of Origin\t: " + placeofOrigin;
	}
		
	public String Info(String ty) {
		return "\nType\t\t: " + ty + "\nColour\t\t: " + colour + "\nPlace of Origin\t: " + placeofOrigin;
	}
		
	public String Info(String ty, String c) {
		return "\nType\t\t: " + ty + "\nColour\t\t: " + c + "\nPlace of Origin\t: " + placeofOrigin;
	}
	
	
	public String printBenefit() { //overriding method
		return "\nCherries contain vitamin C, A, K, potassium, magnesium, and calcium.";
	}
	
	public String toString() {
		return printBenefit();
	}

}
