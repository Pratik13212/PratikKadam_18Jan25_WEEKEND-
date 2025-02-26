package minmaxnumber;

public class MinMaxNumber {

	
	
	public static void getMinValue(int a , int b, int c) {
		int min=a;

		
		if (b < min) {
			min = b;
        }
        if (c < min) {
            min = c;
 
        }

         System.out.println("Maximum value: " + min);
		
	}
	
	
	
	public static void getMaxValue(int a , int b, int c) {
		int max=a;

		
		if (b > max) {
			max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Maximum value: " + max);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		getMinValue(11,25,24) ;
		getMaxValue(11,25,24) ;
		
		
	}
}
