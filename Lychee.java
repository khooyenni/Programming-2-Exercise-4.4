package Exercise4_4;

public class Lychee extends Fruits {

	private String type;
	private String seed; 
	private String placeofOrigin;
	
	public Lychee(String n, String ty, String s, String o) {//constructor with 4 arguments
		super(n);
		type = ty;
		seed = s;
		placeofOrigin = o;
		
		System.out.print("Fruit\t\t: " + n);
		switch(type) {
		case "Souey Tung":
			System.out.print(Info());
			break;
		case "Wai Chee":
			System.out.print(Info("South-East Qld"));
			break;
		case"Tai So":
			System.out.print(Info("Yellow", "Small"));
			break;
		}
		
	}
	
	public String Info() {
		return "\nType\t\t: " + type + "\nSize of Seed\t: " + seed + "\nPlace of Origin\t: " + placeofOrigin;
	}
		
	public String Info(String o) {
		return "\nType\t\t: " + type + "\nSize of Seed\t\t: " + seed + "\nPlace of Origin\t: " + o;
	}
		
	public String Info(String s, String o) {
		return "\nType\t\t: " + type + "\nSize of Seed\t\t: " + s + "\nPlace of Origin\t: " + o;
	}
	
	public String printBenefit() { //overriding method
		return "\nLychee contain Magnesium, copper, iron, vitamin C, manganese and folate.";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}

}
