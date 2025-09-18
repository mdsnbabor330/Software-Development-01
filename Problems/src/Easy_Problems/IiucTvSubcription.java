package Easy_Problems;
import java.util.Scanner;
public class IiucTvSubcription {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int subscription = (int) Math.ceil((double) n/6);
		int cost =sc.nextInt();
		int totalCost = subscription*cost;
		System.out.println(totalCost);
	}
}