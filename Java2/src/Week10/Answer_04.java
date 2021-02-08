package Week10;

import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Answer_04 {
	public static void number(StringTokenizer s) { // ���ڿ��� ���� ��ȣ, ���� �ĺ� ��ȣ, ������ ��ȣ�� ������ ����ϴ� �޼ҵ�
		System.out.println("���� ��ȣ : " + s.nextToken());
		System.out.println("���� �ĺ� ��ȣ : " + s.nextToken());
		System.out.println("������ ��ȣ : " + s.nextToken() + " " + s.nextToken());
	}
	
	public static void today(Calendar now) { // ���� ��¥�� ����ϴ� �޼ҵ�
		int year = now.get(Calendar.YEAR);  // now���� �⵵�� �����մϴ�.
		int month = now.get(Calendar.MONTH) + 1;  // now���� ���� �����մϴ�.
		int date = now.get(Calendar.DATE);  // now���� �ϸ� �����մϴ�.
		System.out.println(year + "�� " + month + "�� " + date + "��");
	}
	
	public static void word() { // 3���� �����ڷ� �����ϴ� �ܾ �Է��ϴ� �޼ҵ�
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			char ch = (char) ((Math.random() * 26) + 65);
			System.out.print(ch + "�� �����ϴ� �ܾ� >> ");
			String a = in.next();
		}
		
	} 
	
	public static void cal(String str) { // ���� ���ڿ��� ����ϴ� �޼ҵ�
		StringTokenizer ST = new StringTokenizer(str);
		int num = Integer.parseInt(ST.nextToken()); // ó���� ������ ���ڸ� �����մϴ�.
		int result = num; // ����� ������ ����
		
		while(ST.hasMoreTokens()) { // ��ū�� ������ �� ����
			String a = ST.nextToken(); // ������ ���� ������ ��ū�̹Ƿ� �����ڰ� ������ �˴ϴ�.
			char ch = a.charAt(0); // ������
			if(ch == '+') { 
				result += Integer.parseInt(ST.nextToken()); // ������ ������ ���ڸ� result�� ���մϴ�.
			}
			else if(ch == '-') {
				result -= Integer.parseInt(ST.nextToken()); // ������ ������ ���ڸ� result�� ���ϴ�.
			}
			else if(ch == '*') {
				result *= Integer.parseInt(ST.nextToken()); // ������ ������ ���ڸ� result�� ���մϴ�.
			}
			else if(ch == '/') {
				result /= Integer.parseInt(ST.nextToken()); // ������ ������ ���ڸ� result�� �����ϴ�.
			}
		}
		System.out.println(str + " = " + result); // ��� ���
	}
	
	public static void main(String[] args) {
		StringTokenizer stok = new StringTokenizer("082-2-777-5566", "-");
		number(stok);
		
		Calendar now = Calendar.getInstance();
		today(now);
		
		word();
		
		cal("34 + 56 - 12 * 4 / 2 - 16");
		
		System.out.println("���α׷��� �����մϴ�.");
	}
}
