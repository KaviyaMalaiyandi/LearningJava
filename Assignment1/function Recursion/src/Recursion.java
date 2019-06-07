import java.util.*;
public class Recursion {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String  s=input.nextLine();
		String reverse=reverseString(s);
		System.out.print(reverse);
		/*for(int i=s.length()-1;i>=0;i--) {
			//System.out.print(c[i]);
		}*/
	}

	private static String reverseString(String s) {
		if(s==null||s.length()<=1) {
			return s;
		}
		else {
			return reverseString(s.substring(1))+s.charAt(0);
		}
		
	}
}