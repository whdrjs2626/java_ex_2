package Week7;

interface Operation {
	void cut();

	void wash();
}

class Hair implements Operation { // Operation을 구현하는 Hair클래스
	private String type;

	public Hair(String type) {
		this.type = type;
	}

	public void tint(String color) {
		System.out.println(type + " 을(를) " + color + " 색으로 염색하다.");
	}

	@Override
	public void cut() {
		System.out.println(type + " 을(를) 자르다.");
	}

	@Override
	public void wash() {
		System.out.println(type + " 을(를) 감다.");
	}

}

class Fruit implements Operation {
	private String type;

	public Fruit(String type) {
		this.type = type;
	}

	public void pack(int cnt) {
		System.out.println(type + " 을(를) " + cnt + " 개 포장하다.");
	}

	@Override
	public void cut() {
		System.out.println(type + " 을(를) 자르다.");
	}

	@Override
	public void wash() {
		System.out.println(type + " 을(를) 씻다.");
	}

}

public class Answer_03 {

	public static void run(Operation oper) {
		oper.cut();
		oper.wash();
		if (oper instanceof Hair) {
			((Hair) oper).tint("Brown");
		} else {
			((Fruit) oper).pack(10);
		}
	}

	public static void main(String[] args) {
		Operation oper = null;
		oper = new Hair("긴 머리");
		run(oper);
		oper = new Fruit("사과");
		run(oper);
	}
}
