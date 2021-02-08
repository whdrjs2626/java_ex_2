package JAVA2;
import java.util.Scanner;

public class Answer_03 {
    static boolean search(int[] arr, int a) { // ���� Ȯ�� �޼ҵ�
    	if(arr[a] == 1) return false; // �����Ϸ��� �ڸ��� 1�̸�(�̹� ����Ǿ� ������) false�� �������ݴϴ�.
    	else { // �����Ϸ��� �ڸ��� 0�̸�(���������) true�� �������ݴϴ�.
    		arr[a] = 1;
    		return true;
    	}
    }
    
    static void display(int[] arr) { // ���� ��Ȳ�� ����ϴ� �޼ҵ�
    	for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + " : " + arr[i] + "\t");
    	}
		System.out.println();
    }
    
	public static void main(String[] args) {
		int[] seat = { 0, 0, 1, 0, 1, 1, 0, 0, 1, 0 }; // 1:����� �¼�, 0:���డ���� �¼�
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("�¼� ��ȣ�� �Է��ϼ���(����� 0) >> ");
			int number = in.nextInt();
			if (number <= 0)
				break;
			if (search(seat, number - 1))
				System.out.println("���� �Ϸ�");
			else
				System.out.println("���� �Ұ� : ����� �¼�");

			System.out.println("---------- ���� ��Ȳ -----------");
			display(seat);
		}
	}
}
