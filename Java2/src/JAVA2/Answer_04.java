package JAVA2;

public class Answer_04 {
	static int max_index(int[] arr) { // ������ ���� ���� ���� å�� ������ �����ϴ� �Լ�
		int max = arr[0]; // �ִ밪 ����
		int index = 0; // �ִ밪�� �ε��� �ʱ�ȭ
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) { // �ִ밪�� ã���ݴϴ�.
				max = arr[i]; // max�� �ִ밪 ����
				index = i; // �ִ밪�� �ε��� ����
			}
		}
		return index; // ����
	}
	
	public static void main(String[] args) {
		String[] title = { "�ڹ�", "���̽�", "�ڵ�", "�ڹٽ�ũ��Ʈ", "�ڷᱸ��" };
		int[] pages = { 150, 100, 120, 200, 180 };
		int max_page = max_index(pages);
		System.out.println("�ִ� ������ �� : " + pages[max_page]);
		System.out.println("�ִ� ���������� ���� å : " + title[max_page]);
	}
}
