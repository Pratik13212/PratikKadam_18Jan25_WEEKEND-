package packprimenumber;

public class PrimeNumberProgram {
	
	
	
	public static void main(String[] args) {
		
		
		int number =19;
		int result =0;
		result=number%2;
		
		if (number == 0 || number == 1) {
			
			
			System.out.println(number+" is not a Prime number");
			
		}
		
		else if(result==0) {
			System.out.println(number+" is  a Prime number");
		}
		else {
			System.out.println(number+" is not a Prime number");
		}
			
		
	}

}
