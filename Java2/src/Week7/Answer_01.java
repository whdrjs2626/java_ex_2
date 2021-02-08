package Week7;

@FunctionalInterface
interface Action {
	void move();
}

public class Answer_01 {
	public static void main(String[] args) {
		Action front = new Action() { // �͸� ���� ��ü
			public void move() {
				System.out.println("������ �����Դϴ�.");
			}
		};

		Action back = () -> { // ���ٽ����� ����
			System.out.println("�ڷ� �����Դϴ�.");
		};

		front.move(); // �͸� ���� ��ü�� �޼ҵ� ȣ��
		back.move(); // ���ٽ����� �޼ҵ� ȣ��

	}
}
