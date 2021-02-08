package week6;

abstract class Animal {
	private String type; // ����
	public Animal(String type) { // ������
		this.type = type;
	}
	public String getType() {
		return type;
	}
	abstract void run();
	abstract void sound();
}

class Baby extends Animal {
	public Baby(String type) { // ������
		super(type);
	}
	@Override
	void run() { // �޼ҵ� ������
		System.out.println(super.getType() + " : ���ٴմϴ�.");
	}
	@Override
	void sound() { // �޼ҵ� ������
		System.out.println(super.getType() + " : �˾��̸� �մϴ�.");
	}
}

class Dog extends Animal {
	public Dog(String type) { // ������
		super(type);
	}
	@Override
	void run() { // �޼ҵ� ������
		System.out.println(super.getType() + " : �� �߷� �ٴմϴ�.");
	}
	@Override
	void sound() { // �޼ҵ� ������
		System.out.println(super.getType() + " : �۸� �Ҹ��� ���ϴ�.");
	}
}

public class Answer_04 {
	public static void play(Animal ani) {
		ani.run(); // run�޼ҵ� ȣ��
		ani.sound(); // sound�޼ҵ� ȣ��
	}

	public static void main(String[] args) {
		Animal animal = new Baby("�Ż���");
		play(animal);
		animal = new Dog("������");
		play(animal);
	}
}
