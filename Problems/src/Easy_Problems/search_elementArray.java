package Easy_Problems;
import java.util.Scanner;
public class search_elementArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Target : ");
		int target=sc.nextInt();
		int found=0;
		for(int i=0;i<n;i++) {
			if (arr[i] == target) {
				System.out.println("found");
				found++;
				break;
			}

		}
		if(found==0){
			System.out.println("Not Found");
		}

	}
}