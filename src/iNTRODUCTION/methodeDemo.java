package iNTRODUCTION;

public class methodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodeDemo d = new methodeDemo();
		String name = d.getdata();// same class
		System.out.println(name);
		
		methodsDemo2 d2 =new methodsDemo2();
		d2.getUserdata();// other class
		
		getData2();//static method without objects
		

	}
	
	public String getdata()
	{
		System.out.println("Hello world");
		return "arshiya";
	}
	public static void getData2()
	{
		System.out.println("hello friend static");
	}

}
