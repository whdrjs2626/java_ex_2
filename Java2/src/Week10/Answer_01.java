package Week10;
//charAt() or indexOf("") 사용
import java.util.Scanner;

public class Answer_01 {
	
	public static void find(String str, char ch) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) { // str의 첫 글자부터 하나하나 비교합니다.
				System.out.println(ch + " 는(은) " + (i+1) + "번째에 있습니다.");
				return; // 있으면 출력 후 메소드 종료
			}
		}
		System.out.println(ch + " 는(은) 해당 문자열에 없습니다."); // 없는 경우
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = "자바 프로그램은 재미 없습니다. 어렵습니다";
		System.out.print("문자를 입력하세요 >>>> ");
		char ch = in.next().charAt(0);
		find(str,ch);
		System.out.println("프로그램을 종료합니다.");
	}
}
