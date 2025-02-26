package naturalnumber;

public class FirstTenNaturalNumbers {

	
	
	public int getSum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
            //1+2+3+4+5+6+7+8+9+10
        }
        return sum;
    }
	
	
	public static void main(String[] args) {
		
		FirstTenNaturalNumbers fn = new FirstTenNaturalNumbers();
		
		System.out.println("sum of the first 10 natural numbers is " + fn.getSum());
		
	}
	
	
	
}
