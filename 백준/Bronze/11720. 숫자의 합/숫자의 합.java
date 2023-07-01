import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();          // 숫자의 개수
		String num = s.next();    // 공백 없이 숫자 여러개를 입력			
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum += num.charAt(i)-48;
		}
		System.out.println(sum);

	}
}