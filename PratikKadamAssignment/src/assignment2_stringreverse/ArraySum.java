package assignment2_stringreverse;

public class ArraySum {

	
	public static void main(String[] args) {
		

		 
		 int[] array= {1, 4, 6, 8, 10};
		 int temp2=0;
		 int cont=0;

		 
		 for(int i = 0 ;i<array.length; i++) {
			 
			 for(int j = 0 ;j<array.length; j++) {
			 
			 
			 cont = array[i] + array[j];
			 
			if (cont==10) {
				System.out.println("Pair is "+ array[i] +" , "  + array[j]);
				return;
			}
			 
		 }
		 
		 }
		 
		
	}
}
