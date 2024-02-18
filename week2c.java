public class week2c{
public static void main(String[] args){

int n=12;
double sum=0;
for(double i = 1;i<=n;i++){
	sum=sum+(1/i);
	}
System.out.println("Sum of harmonic series till 1/n is : " +sum);
}
}