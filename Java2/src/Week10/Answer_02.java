package Week10;
// ���̺귯�� ��� ����
import java.util.Scanner;

public class Answer_02 {
	
	public static void reverse(String str) {
		for(int i = str.length()-1; i >= 0; i--) { // ���ڿ��� ������ �ε������� 1�� ���Դϴ�. 
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("���ڿ� �Է� : ");
			String str = in.next();
			if(str.equals("finish")) { // �Է��� ���ڿ��� finish��� ���α׷��� �����ŵ�ϴ�.
				System.out.println("���α׷� ����");
				break;
			}
			else {
				reverse(str);
			}
		}
	}
}
