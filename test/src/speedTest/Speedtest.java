package speedTest;

import java.io.IOException;

public class Speedtest {
	public static void main(String[] args) throws InterruptedException, IOException {
		Process process = java.lang.Runtime.getRuntime().exec("ping www.geeksforgeeks.org");
		int x = process.waitFor();
		int count=0;
		if (x == 0) {
			System.out.println("Connection Successful, " + "Output was " + x);
			count++;
		} else {
			System.out.println("Internet Not Connected, " + "Output was " + x);
		}
		System.out.println(count);
	}
}
