package JAVA2;

public class Answer_01 {
	static void init(int[] arr) { // �迭�� ������ �ʱ�ȭ�ϴ� �Լ�
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 50); // ������ 0~49���� ������ �����߽��ϴ�.
		}
	}
	
	static void reverse(int[] arr) { // �迭�� ����� ����ϴ� �Լ�
		for(int i = arr.length-1; i >= 0; i--) { // ������ �ε������� ���ҽ�������ϴ�.
			System.out.print(arr[i] + "\t");
		}
	}

	public static void main(String[] args) {
		int[] data = new int[10]; // int �迭 ���� & ����
		init(data); // ������ �迭 �ʱ�ȭ

		System.out.println("------- �ʱ�ȭ �� �迭 ��� -----------");
		for (int temp : data)
			System.out.print(temp + "\t");
		System.out.println();

		System.out.println("------- �������� ��� -----------");
		reverse(data);
	}
}
