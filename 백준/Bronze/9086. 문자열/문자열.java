import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for (int i = 0; i < T; i++) {
			String str = s.next();
			System.out.print(str.charAt(0));
			System.out.println(str.charAt(str.length() - 1));

		}
	}
}