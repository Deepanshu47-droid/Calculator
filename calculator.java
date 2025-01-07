import java.util.Scanner;

public class calculator{
	public static float addition(float a,float b){
		return a+b;
	}
	public static float substraction(float a,float b){
		return a-b;
	}
	public static float multiplication(float a,float b){
		return a*b;
	}
	public static float division(float a,float b){
		return a/b;
	}
	public static void answer(float a,float b){
		Scanner sc=new Scanner(System.in);

		System.out.println("choose an operation:\npress 1 for addition,\n2 for substraction,\n3 for multiplication,\n4 for division ");
		int choice=sc.nextInt();
		switch(choice){
			case 1:{
				System.out.println(addition(a,b));
				break;
			}
			case 2:{
				System.out.println(substraction(a,b));
				break;
			}
			case 3:{
				System.out.println(multiplication(a, b));
				break;
			}
			case 4:{
				System.out.println(division(a, b));
				break;
			}
			default:
			System.out.println("wrong choice...");
		}
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