
public class NJTax extends Tax {
	
	NJTax(int depen, double gross, String st) {
		super(depen, gross, st);
		numberOfDependents = depen;
		grossIncome = gross;
		state = st;
		
	}

	public double adjustForStudents(double tax) {
		return tax - 500;
	}
	
public double calcTax() {
		
		if (grossIncome < 50000) {
			return grossIncome*0.10;
		}else {
			return grossIncome*0.13; 
		}
	}
}
