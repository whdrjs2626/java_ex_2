

public class Answer_01 {
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

	static void init(int[] arr) {
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 20);
		}
	}
	
	static void reverse(int[] arr) {
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}
	}
}
