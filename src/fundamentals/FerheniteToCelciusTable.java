package fundamentals;
import java.util.*;
public class FerheniteToCelciusTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting value of Fahenite: ");
		int s = sc.nextInt();
		System.out.println("Enter the ending value of Ferhanite: ");
		int e = sc.nextInt();
		System.out.println("Enter the stpe-size: ");
		int w = sc.nextInt();
		while(s<=e) {
			int cel = (int)(s-32*5)/9;
			System.out.println(s+" "+cel);
			s+=w;
		}
	}

}
