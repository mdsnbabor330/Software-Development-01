package Rated_Problems;
import java.util.Scanner;
public class Problems550_ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int totalPages = n*1000;
		int totalNotebooks = totalPages/100;
		System.out.println("Total Notebooks: "+totalNotebooks);
	}
}