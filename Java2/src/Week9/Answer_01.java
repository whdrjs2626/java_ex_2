package Week9;

abstract class Tool {
	private String type;

	public Tool(String type) {
		this.type = type;
	}

	String getType() {
		return type;
	}

	void write() {
		System.out.println("type >> " + type);
	}

	abstract public void cut();
	abstract public void dry();
}

class Hair extends Tool { // Tool�� ��ӹ޴� Hair Ŭ����
	private String style;

	public Hair(String type, String style) {
		super(type);
		this.style = style;
	}

	void tint(String color) {
		System.out.println(super.getType() + "��(��) " + color + " ������ �����ϴ�.");
	}

	@Override
	void write() {
		System.out.println("type >> " + super.getType());
		System.out.println("style >> " + style);
	}

	@Override
	public void cut() {
		System.out.println(super.getType() + "��(��) �ڸ���.");
	}

	@Override
	public void dry() {
		System.out.println(super.getType() + "��(��) ������.");
	}
}

class Paper extends Tool {

	private String size;

	public Paper(String type, String size) {
		super(type);
		this.size = size;
	}

	void draw() {
		System.out.println(size + "�� �׸��� �׸���.");
	}

	@Override
	void write() {
		System.out.println("type >> " + super.getType());
		System.out.println("size >> " + size);
	}

	@Override
	public void cut() {
		System.out.println(super.getType() + "��(��) �ڸ���.");
	}

	@Override
	public void dry() {
		System.out.println(super.getType() + "��(��) ������.");
	}

}

public class Answer_01 {
	public static void run(Tool[] tool) {
		for(int i = 0; i < tool.length; i++) {
			System.out.println("=== " + tool[i].getType() + " Ŭ���� ===");
			tool[i].write();
			if(tool[i] instanceof Hair) { // tool�� ��ü�� Ÿ���� Hair�� ��� ������ �����մϴ�.
				((Hair) tool[i]).tint("Blue");
			}
			else {                        // tool�� ��ü�� Ÿ���� Paper�� ��� �׸��� �׸��ϴ�.
				((Paper) tool[i]).draw();
			}
			tool[i].cut();
			tool[i].dry();
		}
	}
	public static void main(String[] args) {
		Tool[] tool = { new Hair("Hair", "wave"), new Paper("Paper", "A3") };
		run(tool);
	}
}
