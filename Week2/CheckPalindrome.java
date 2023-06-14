/* Write a java program to check whether a given string is palindrome. */

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String args[]) {

		String str, rev = "";
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = sc.nextLine();
		int length = str.length();

		for (int i = length - 1; i >= 0; i--)
			rev = rev + str.charAt(i);

		if (str.equals(rev))
			System.out.println(str + " is a palindrome.");
		else
			System.out.println(str + " is not a palindrome.");

		sc.close();
	}
}
