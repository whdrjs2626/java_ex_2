package Week10;
//charAt() or indexOf("") ���
import java.util.Scanner;

public class Answer_01 {
	
	public static void find(String str, char ch) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) { // str�� ù ���ں��� �ϳ��ϳ� ���մϴ�.
				System.out.println(ch + " ��(��) " + (i+1) + "��°�� �ֽ��ϴ�.");
				return; // ������ ��� �� �޼ҵ� ����
			}
		}
		System.out.println(ch + " ��(��) �ش� ���ڿ��� �����ϴ�."); // ���� ���
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = "�ڹ� ���α׷��� ��� �����ϴ�. ��ƽ��ϴ�";
		System.out.print("���ڸ� �Է��ϼ��� >>>> ");
		char ch = in.next().charAt(0);
		find(str,ch);
		System.out.println("���α׷��� �����մϴ�.");
	}
}
