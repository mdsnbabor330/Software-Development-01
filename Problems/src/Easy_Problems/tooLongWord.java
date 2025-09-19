package Easy_Problems;
import java.util.Scanner;
public class tooLongWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String str=sc.nextLine();
			int ln=str.length();
			if (ln > 10) {
				System.out.println(""+str.charAt(0) + (ln-2) + str.charAt(ln-1));
			}
			else {
				System.out.println(str);
			}
		}
	}
}
