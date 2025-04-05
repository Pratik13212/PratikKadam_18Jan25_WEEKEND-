package assignment2_stringreverse;

public class MissingNumberArray {
	
	
	public static void main(String[] args) {
		

		int [] array = {1, 2, 4, 5, 6};
		int missingnumber=0;
			
		int sumofarrayvalue= array[0] +array[1]+array[2]+array[3]+array[4];
		//System.out.println(sumofarrayvalue);
		int ActualTotal=0;
		

		for(int i = 0 ; i<=array.length+1;i++) {
			
			ActualTotal += i; 
	

		}
		//System.out.println(ActualTotal);
		
		missingnumber=ActualTotal-sumofarrayvalue;
		
		System.out.println("Missing Number is Array is " + missingnumber);
	}
}
