package Exercise4_4;

public class FujiApple extends Apple{
	
	public FujiApple(String n, int q, double p){
		super(n,q,p);
	}
	
	public String printBenefit() { //overriding method
		return "Fuji apples can boosts brain health.";
	}
	
	public String toString() {
		return printBenefit();
	}

}
