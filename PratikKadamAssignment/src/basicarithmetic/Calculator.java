package basicarithmetic;

public class Calculator {

	int sumInt;
	double sumDouble;
	int subInt;
	double subDouble;
	public void additionInt(int a, int b) {
		
		sumInt= a+ b; 
		System.out.println("Addition of two Integer Number are : "+sumInt);
	}
	
	public void additionDouble(double c, double d) {
		sumDouble= (c + d); 
		System.out.println("Addition of two Double Number are : "+sumDouble);
	}
	
	public void substractionInt(int e, int f) {
		subInt= (e - f); 
		System.out.println("Substraction of two Integer Number are : "+subInt);
	}

	
	public void substractionDouble(double g, double h) {
		subDouble= (g - h); 
		System.out.println("Substraction of two Double Number are : "+subDouble);
	}
	
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
				c.additionInt(5, 5);
				c.additionDouble(5.1, 5.1);
				c.substractionInt(5, 5);
				c.substractionDouble(6.1, 5.1);
		
		
		
		
	}
}
