package assignment2_stringreverse;

public class StringReverse {
	
	
	
	public static void main(String[] args)
	{
		String a = "hello";
		char b;
		String r="";
		
	

		
		for(int i =0 ; i<a.length() ; i++)
		{
			
			b = a.charAt(i);
			//System.out.println(b);
			r = b + r; 
		
		}
	
		System.out.println(r);

	
		
	}

}
