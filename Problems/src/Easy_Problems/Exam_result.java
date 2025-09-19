package Easy_Problems;
import java.util.Scanner;
public class Exam_result {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int totalStu= x*y;
		int z=sc.nextInt();
		if(z > totalStu/2) {
			System.out.println("YES, More then 50% passed");
		}
		else {
			System.out.println("Not more then 50% passed");
		}
	}
}
