package iNTRODUCTION;

public class dividby2 {

	public static void main(String[] args) {
		// Check yhis array has multiple of 2
		
		int[] arr = {1,2,3,4,5,6,8,22,44,66};
		
		for(int i= 0 ;i<arr.length;i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
				// if you use break it will display 1st value and then exit from the loop.
				//break;
			}
			else
			{
				System.out.println(arr[i] +" "+  "is not multiple of 2");
			}
		}

	}

}
