package Week9;
class Button {
	Onclick onclick;
	void setOnclick(Onclick onclick) {
		this.onclick = onclick;
	}
	void touch() {
		onclick.onClick();
	}
	// �ַ� ���� ��� �������̽��� ���� ���
	static interface Onclick {
		void onClick();
	}
}
class Call implements Button.Onclick {
	public void onClick() {
		System.out.println("��ȭ�� �̴ϴ�");
	}
}

class Message implements Button.Onclick {
	public void onClick() {
		System.out.println("�޼����� �����ϴ�");
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		Button btn = new Button();
		btn.setOnclick(new Message());
		btn.touch();
		btn.setOnclick(new Call());
		btn.touch();
	}
}
