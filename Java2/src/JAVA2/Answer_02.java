package JAVA2;

public class Answer_02 {
	static int max(int... a) { // �������ڸ� ����Ͽ��� ������ �Ű������� ���� �� �ְ� �Ͽ����ϴ�.
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i]; // �ִ밪 �ʱ�ȭ
		}
		return max;
	}

	static double max(double... a) { // �������ڸ� ����Ͽ��� ������ �Ű������� ���� �� �ְ� �Ͽ����ϴ�.
		double max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i]; // �ִ밪 �ʱ�ȭ
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("���� �ִ� ��1 : " + max(4, 6, 5, 9, 23, 6));
		System.out.println("���� �ִ� ��2 : " + max(48, 24, 15, 36, 54, 89, 69, 82));
		System.out.println("�Ǽ� �ִ� ��1 : " + max(4.5, 8.6, 12.3, 7.3, 2.4));
		System.out.println("�Ǽ� �ִ� ��2 : " + max(12.6, 8.5, 46.5, 12.4, 6.41, 4.2, 9.5, 3.4));
	}

}
