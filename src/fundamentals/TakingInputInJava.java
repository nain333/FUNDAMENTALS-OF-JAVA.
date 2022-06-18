package fundamentals;
import java.util.*;

public class TakingInputInJava {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number: ");
		
		int i = sc.nextInt();
		System.out.println("Enter the operant: ");
		String str= sc.next();
		char o = str.charAt(0);
		int j= sc.nextInt();
		int res;
		
		if(o=='+'){
			res=i+j;
			System.out.println(res);
		}
		else if (o=='-') {
			res=i-j;
			System.out.println(res);
		}
		else if (o=='*') {
			res = i*j;
			System.out.println(res);
		}
		else if (o=='/') {
			res = i/j;
			System.out.println(res);
		}
		else
		{
			System.out.println("invalid operation");
		}
		System.out.println("Thanks for using NAIN's calci");
		
		
	}

}
