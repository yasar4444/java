class Animal{
	String color="brown";
	String display()
	{
		return(color);
	}
}
public class classEx2{
	public static void main(String args[]){

	Animal a=new Animal();
	Animal cat=new Animal();
	cat.color="white";
	System.out.println(a.display());
	System.out.println(cat.display());
	System.out.println("hello");
	}
}
