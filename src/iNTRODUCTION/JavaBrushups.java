 package iNTRODUCTION;

import java.util.ArrayList;

public class JavaBrushups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum = 5;
		String website = "Rahul shetty academy";
		char  letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum +" "+ "is the value stored in myNum variable");
		System.out.println("website");
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1,2,3,4,6};
		System.out.println(arr2[2]);
		
		for(int i=0;i<arr.length;i++)
		{
			 System.out.println(arr[i]);
		}
		String[] name = {"rahul","arshiya","muin"};
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		for( String s: name)
		{
			System.out.println(s );
		}
	// add values dynamically	
		ArrayList<String> a = new ArrayList<String>();
		a.add("arshiya");
		a.add("muin");
		a.add("academy") ;
		System.out.println("********************************************************");
	
	//String literal and using new operator
		
		String s ="rahul shetty academy";
		//String s1 ="rahul shetty academy";
		String s2 ="hello";
		
		String s3 = new String("welcome");
		String s4 = new String("welcome");
		
		String s5 ="Arshiya Muin Pirzada";
		String[] splittedString = s5.split("Muin");
		System.out.println(splittedString[1]);
		System.out.println(splittedString[0]);
		//System.out.println(splittedString[2]);
		System.out.println(splittedString[1].trim());
		for(int i=s5.length()-1;i>=0;i--)
		{
			System.out.println(s5.charAt(i));
		}
		
		
		
		
		
		

	}

}
