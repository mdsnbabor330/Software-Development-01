package Easy_Problems;
import java.util.Scanner;
public class smallest_num_inArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int [n];
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n; i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.print(min);
	}
}