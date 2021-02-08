package Week9;

class Calculator {
	Control control; // 인터페이스 Control 타입을 갖는 필드 변수
	
	void setControl(Control control) {
		this.control = control;
	}
	
	void compute(int a, int b) { 
		control.run(a, b);
	}
	
	static interface Control { // 정적 인터페이스 멤버 Control
		void run(int a, int b);
	}
}

class Add implements Calculator.Control { // 정적 인터페이스 멤버 Control을 구현하는 Add 클래스 - 합을 계산합니다.
	public void run(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
	}
}

class Exp implements Calculator.Control { // 정적 인터페이스 멤버 Control을 구현하는 Exp 클래스 - 거듭제곱을 계산합니다.
	public void run(int a, int b) {
		int c = 1;
		for(int i = 0; i < b; i++) {
			c *= a; // a를 b번 곱합니다.
		}
		System.out.println(a + " ** " + b + " = " + c);
	}
}

public class Answer_02 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.setControl(new Add());
		cal.compute((int)(Math.random()*10)+1, (int)(Math.random()*10)+1); // 1 ~ 10의 난수를 입력값으로 줍니다.
		cal.setControl(new Exp());
		cal.compute(5, 3);
	}
}
