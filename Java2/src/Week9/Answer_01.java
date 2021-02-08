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

class Hair extends Tool { // Tool을 상속받는 Hair 클래스
	private String style;

	public Hair(String type, String style) {
		super(type);
		this.style = style;
	}

	void tint(String color) {
		System.out.println(super.getType() + "을(를) " + color + " 색으로 염색하다.");
	}

	@Override
	void write() {
		System.out.println("type >> " + super.getType());
		System.out.println("style >> " + style);
	}

	@Override
	public void cut() {
		System.out.println(super.getType() + "을(를) 자르다.");
	}

	@Override
	public void dry() {
		System.out.println(super.getType() + "을(를) 말리다.");
	}
}

class Paper extends Tool {

	private String size;

	public Paper(String type, String size) {
		super(type);
		this.size = size;
	}

	void draw() {
		System.out.println(size + "에 그림을 그리다.");
	}

	@Override
	void write() {
		System.out.println("type >> " + super.getType());
		System.out.println("size >> " + size);
	}

	@Override
	public void cut() {
		System.out.println(super.getType() + "을(를) 자르다.");
	}

	@Override
	public void dry() {
		System.out.println(super.getType() + "을(를) 말리다.");
	}

}

public class Answer_01 {
	public static void run(Tool[] tool) {
		for(int i = 0; i < tool.length; i++) {
			System.out.println("=== " + tool[i].getType() + " 클래스 ===");
			tool[i].write();
			if(tool[i] instanceof Hair) { // tool의 객체의 타입이 Hair인 경우 염색을 실행합니다.
				((Hair) tool[i]).tint("Blue");
			}
			else {                        // tool의 객체의 타입이 Paper인 경우 그림을 그립니다.
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
