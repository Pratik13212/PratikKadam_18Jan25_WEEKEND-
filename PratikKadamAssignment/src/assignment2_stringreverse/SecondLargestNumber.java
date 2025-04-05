package assignment2_stringreverse;

public class SecondLargestNumber {
	
	
	public static void main(String[] args) 
	{
		int [] array = {10, 20, 4, 45, 99};
		int size = array.length;
		int zeroindex;
		int firstindex;
		int secondindex;
		int thirdindex;
		int fourthindex;
		int fifthindex;
		int temp;
		
	
		 zeroindex= array[0];
		 firstindex = array[1];
		 secondindex = array[2];
		 thirdindex = array[3];
		 fourthindex = array[4];
		
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		
		
		
	      System.out.println("Second Largest Element in an Array: "+array[size-2]);
	      
			

	}
	

	

}
