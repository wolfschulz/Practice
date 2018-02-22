
public class Tax {
	int numberOfDependents;
	double grossIncome;
	String state;
	
	Tax(int depen, double gross, String st){
		numberOfDependents = depen;
		grossIncome = gross;
		state = st;
	}
	
	public double calcTax() {
		
		if (grossIncome < 50000) {
			return grossIncome*0.06;
		}else {
			return grossIncome*0.08; 
		}
	}
}
