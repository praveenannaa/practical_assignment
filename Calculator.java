import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter the operator");
		char op=sc.next().charAt(0);
		double Ans=0;
		
		switch(op){
		case '+' : Ans=a+b;
		break;  
		case '-' : Ans=a-b;
		break;  
		case '*' : Ans=a*b;
		break;  
		case '/' : Ans=a/b;
		break;  
		}
		
		System.out.println("The answer is" + Ans);
		
		
		
		
	}
}
