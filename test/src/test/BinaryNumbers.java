package test;

import java.util.Scanner;

public class BinaryNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String binaryNoString = Integer.toBinaryString(n);
		System.out.println(binaryNoString);
		char[] ch = new char[binaryNoString.length()];
		int count = 0, count2 = 0;

		for (int i = 0; i < binaryNoString.length(); i++) {
			ch[i] = binaryNoString.charAt(i);
		}
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '1') {
				count++;
				count2 = count;
			} else {
				count = 0;
			}
		}
		System.out.println(count2);
	}

}
