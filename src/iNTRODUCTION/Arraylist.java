package iNTRODUCTION;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList();
		a.add("arshiya");
		a.add("muin");
		a.add("kashaf");
		a.add("beleville");
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("***************************************************");
		
		for(String val:a)
		{
			System.out.println(val);
		}
		
		//item contains value
		
		System.out.println(a.contains("arshiya"));

	}

}
