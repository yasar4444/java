class rectangle{
	int length =2;
	int breadth=4;
	int area()
	{
		int area= lenght * breadth;
		return(area);
	}
}
public class classex3{
	public static void main(String args[]){

	rectangle a=new rectangle();
	rectangle b=new rectangle();
	b.length=10;
	b.breadth=5;
	System.out.println(a.area());
	System.out.println(b.area());
	System.out.println("hello");
	}
}
