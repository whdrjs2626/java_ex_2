package Week10;
// 라이브러리 사용 금지
import java.util.Scanner;

public class Answer_02 {
	
	public static void reverse(String str) {
		for(int i = str.length()-1; i >= 0; i--) { // 문자열의 마지막 인덱스부터 1씩 줄입니다. 
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = in.next();
			if(str.equals("finish")) { // 입력한 문자열이 finish라면 프로그램을 종료시킵니다.
				System.out.println("프로그램 종료");
				break;
			}
			else {
				reverse(str);
			}
		}
	}
}
