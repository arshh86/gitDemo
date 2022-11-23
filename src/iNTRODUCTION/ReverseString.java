package iNTRODUCTION;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Arshiya";
		
		for(int i=s.length()-1;i>=0;i--)
			//6;6>0;5 ==s[6]=a
			//5;5>0;4 ==s[5]=y
			//4;4>0;3 ==s[4]=i
			//3;3>0;2 ==s[3]=h
			//2;2>0;1 ==s[2]=s
			//1;1>0;0 ==s[1]=r
			//0;0=0;0 ==s[0]=a
		{
			System.out.println(s.charAt(i));
		}

	}

}
