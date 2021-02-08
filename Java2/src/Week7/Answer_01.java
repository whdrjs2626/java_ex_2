package Week7;

@FunctionalInterface
interface Action {
	void move();
}

public class Answer_01 {
	public static void main(String[] args) {
		Action front = new Action() { // 익명 구현 객체
			public void move() {
				System.out.println("앞으로 움직입니다.");
			}
		};

		Action back = () -> { // 람다식으로 구현
			System.out.println("뒤로 움직입니다.");
		};

		front.move(); // 익명 구현 객체로 메소드 호출
		back.move(); // 람다식으로 메소드 호출

	}
}
