package Week12;

public class ExTest {
	public static void main(String[] args) {
		sub();
	}
	public static void sub() {
		int[] array = new int[] {34, 56, 12, 87, 34, 78};
		try { // ���ܰ� �߻��ϴ� ������ ���� ó���ϴ� ����Դϴ�.
		System.out.println("array[array.length] : " + array[array.length]);
		} catch(ArrayIndexOutOfBoundsException e) { // �迭 �ε��� ���� ���� �߻��� �� catch���� ����˴ϴ�.
			System.out.println(e.getMessage());
			System.out.println("�迭�� �ִ� �ε��� " + array.length + " ��(��) �ʰ��Ͽ� �����߽��ϴ�.");
		}
	}
}
// ���� ó�����  1 ���� ó��(try catch�� sub�ȿ� �־����) 2 throw�� ������(sub()�ڿ� throwsŰ���� ������ try�� ���ξȿ� sub()�� ���Ѵ�.
