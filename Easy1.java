import java.util.Scanner;

public class Easy1 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(LengthOfLastWord(s));
	}
	public static int LengthOfLastWord(String s) {
		String word[]=s.split(" ");
		String lastWord = word[word.length-1];
		return lastWord.length();
	}

}
