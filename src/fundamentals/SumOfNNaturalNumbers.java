package fundamentals;
import java.util.*;
public class SumOfNNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		sc.close();
		int sum = 0;
		int i =1;
		while(i<=n) {
			
			sum+=i;
			i++;
		}
		System.out.println("The sum of "+ n + "natural numbers is " + sum);
	}

}
