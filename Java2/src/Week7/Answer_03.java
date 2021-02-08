package Week7;

interface Operation {
	void cut();

	void wash();
}

class Hair implements Operation { // Operation�� �����ϴ� HairŬ����
	private String type;

	public Hair(String type) {
		this.type = type;
	}

	public void tint(String color) {
		System.out.println(type + " ��(��) " + color + " ������ �����ϴ�.");
	}

	@Override
	public void cut() {
		System.out.println(type + " ��(��) �ڸ���.");
	}

	@Override
	public void wash() {
		System.out.println(type + " ��(��) ����.");
	}

}

class Fruit implements Operation {
	private String type;

	public Fruit(String type) {
		this.type = type;
	}

	public void pack(int cnt) {
		System.out.println(type + " ��(��) " + cnt + " �� �����ϴ�.");
	}

	@Override
	public void cut() {
		System.out.println(type + " ��(��) �ڸ���.");
	}

	@Override
	public void wash() {
		System.out.println(type + " ��(��) �Ĵ�.");
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
		oper = new Hair("�� �Ӹ�");
		run(oper);
		oper = new Fruit("���");
		run(oper);
	}
}
