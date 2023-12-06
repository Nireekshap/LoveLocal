import java.util.Scanner;

public class Hard2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				String s= sc.nextLine();
				String result = shortestPalindrome(s);
				System.out.println(result);
				sc.close();
	}
	public static String shortestPalindrome(String s) {
		int i=0;
		for(int j=s.length()-1;j>=0;j--) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				}
		}
		if(i==s.length()) {
			return s;
		}
		String suffix = s.substring(i);
		return new StringBuilder(suffix).reverse().toString()+shortestPalindrome(s.substring(0,i)) + suffix;
	}

}
