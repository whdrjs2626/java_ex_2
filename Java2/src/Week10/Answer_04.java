package Week10;

import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Answer_04 {
	public static void number(StringTokenizer s) { // 문자열을 국가 번호, 도시 식별 번호, 가입자 번호로 나눠서 출력하는 메소드
		System.out.println("국가 번호 : " + s.nextToken());
		System.out.println("도시 식별 번호 : " + s.nextToken());
		System.out.println("가입자 번호 : " + s.nextToken() + " " + s.nextToken());
	}
	
	public static void today(Calendar now) { // 오늘 날짜를 출력하는 메소드
		int year = now.get(Calendar.YEAR);  // now에서 년도만 저장합니다.
		int month = now.get(Calendar.MONTH) + 1;  // now에서 월만 저장합니다.
		int date = now.get(Calendar.DATE);  // now에서 일만 저장합니다.
		System.out.println(year + "년 " + month + "월 " + date + "일");
	}
	
	public static void word() { // 3개의 영문자로 시작하는 단어를 입력하는 메소드
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			char ch = (char) ((Math.random() * 26) + 65);
			System.out.print(ch + "로 시작하는 단어 >> ");
			String a = in.next();
		}
		
	} 
	
	public static void cal(String str) { // 수식 문자열을 계산하는 메소드
		StringTokenizer ST = new StringTokenizer(str);
		int num = Integer.parseInt(ST.nextToken()); // 처음에 나오는 숫자를 저장합니다.
		int result = num; // 결과를 저장할 변수
		
		while(ST.hasMoreTokens()) { // 토큰이 없어질 때 까지
			String a = ST.nextToken(); // 무조건 숫자 다음의 토큰이므로 연산자가 나오게 됩니다.
			char ch = a.charAt(0); // 연산자
			if(ch == '+') { 
				result += Integer.parseInt(ST.nextToken()); // 연산자 다음의 숫자를 result에 더합니다.
			}
			else if(ch == '-') {
				result -= Integer.parseInt(ST.nextToken()); // 연산자 다음의 숫자를 result에 뺍니다.
			}
			else if(ch == '*') {
				result *= Integer.parseInt(ST.nextToken()); // 연산자 다음의 숫자를 result에 곱합니다.
			}
			else if(ch == '/') {
				result /= Integer.parseInt(ST.nextToken()); // 연산자 다음의 숫자를 result에 나눕니다.
			}
		}
		System.out.println(str + " = " + result); // 결과 출력
	}
	
	public static void main(String[] args) {
		StringTokenizer stok = new StringTokenizer("082-2-777-5566", "-");
		number(stok);
		
		Calendar now = Calendar.getInstance();
		today(now);
		
		word();
		
		cal("34 + 56 - 12 * 4 / 2 - 16");
		
		System.out.println("프로그램을 종료합니다.");
	}
}
