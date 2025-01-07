import java.util.Scanner;

public class calculator{
	public static float addition(float a,float b){
		return a+b;
	}
	public static float substraction(float a,float b){
		return a-b;
	}

	public static void main(String []args){
		System.out.println("welcome to calculator");
		Scanner sc=new Scanner(System.in);
		float a,b;
		System.out.println("Enter 1st number:");
		a=sc.nextFloat();
		System.out.println("Enter 2nd number:");
		
		b=sc.nextFloat();
	
	}
}