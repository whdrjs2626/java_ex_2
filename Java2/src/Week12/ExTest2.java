package Week12;

public class ExTest2 {
	public static void main(String[] args) {
		try {
			sub(); // �� �޼ҵ� ���� �� ���ܰ� �߻��ߴٸ�
		}
		catch(ArrayIndexOutOfBoundsException e) { // �� ���ܰ� �迭�� �ε��� ���� ������� �� catch���� ����˴ϴ�.
			System.out.println(e.getMessage());
			System.out.println("�迭�� �ִ� �ε����� �ʰ��Ͽ� �����߽��ϴ�.");
		}
	}
	public static void sub() throws ArrayIndexOutOfBoundsException { // ���ܸ� �� �޼ҵ带 ȣ���� ������ ó���ϰ� �ϴ� ����Դϴ�.
		int[] array = new int[] {34, 56, 12, 87, 34, 78};
		System.out.println("array[array.length] : " + array[array.length]);
	}
}
// ���� ó�����  1 ���� ó��(try catch�� sub�ȿ� �־����) 2 throw�� ������(sub()�ڿ� throwsŰ���� ������ try�� ���ξȿ� sub()�� ���Ѵ�.
