package Week9;
class Button {
	Onclick onclick;
	void setOnclick(Onclick onclick) {
		this.onclick = onclick;
	}
	void touch() {
		onclick.onClick();
	}
	// 주로 정적 멤버 인터페이스를 많이 사용
	static interface Onclick {
		void onClick();
	}
}
class Call implements Button.Onclick {
	public void onClick() {
		System.out.println("전화를 겁니다");
	}
}

class Message implements Button.Onclick {
	public void onClick() {
		System.out.println("메세지를 보냅니다");
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
