package fundamentals;
import java.util.*;
public class PermiabliityCheck {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int div=2;
		while(div<=n/2) {
			if(n%div==0) {
				System.out.println("composite");
				return;
			}
			div++;
		}
		System.out.println("PRIME");
	}

}
