package Week9;

class Calculator {
	Control control; // �������̽� Control Ÿ���� ���� �ʵ� ����
	
	void setControl(Control control) {
		this.control = control;
	}
	
	void compute(int a, int b) { 
		control.run(a, b);
	}
	
	static interface Control { // ���� �������̽� ��� Control
		void run(int a, int b);
	}
}

class Add implements Calculator.Control { // ���� �������̽� ��� Control�� �����ϴ� Add Ŭ���� - ���� ����մϴ�.
	public void run(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
	}
}

class Exp implements Calculator.Control { // ���� �������̽� ��� Control�� �����ϴ� Exp Ŭ���� - �ŵ������� ����մϴ�.
	public void run(int a, int b) {
		int c = 1;
		for(int i = 0; i < b; i++) {
			c *= a; // a�� b�� ���մϴ�.
		}
		System.out.println(a + " ** " + b + " = " + c);
	}
}

public class Answer_02 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.setControl(new Add());
		cal.compute((int)(Math.random()*10)+1, (int)(Math.random()*10)+1); // 1 ~ 10�� ������ �Է°����� �ݴϴ�.
		cal.setControl(new Exp());
		cal.compute(5, 3);
	}
}
