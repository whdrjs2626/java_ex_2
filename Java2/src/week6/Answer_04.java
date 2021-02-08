package week6;

abstract class Animal {
	private String type; // 유형
	public Animal(String type) { // 생성자
		this.type = type;
	}
	public String getType() {
		return type;
	}
	abstract void run();
	abstract void sound();
}

class Baby extends Animal {
	public Baby(String type) { // 생성자
		super(type);
	}
	@Override
	void run() { // 메소드 재정의
		System.out.println(super.getType() + " : 기어다닙니다.");
	}
	@Override
	void sound() { // 메소드 재정의
		System.out.println(super.getType() + " : 옹알이를 합니다.");
	}
}

class Dog extends Animal {
	public Dog(String type) { // 생성자
		super(type);
	}
	@Override
	void run() { // 메소드 재정의
		System.out.println(super.getType() + " : 네 발로 다닙니다.");
	}
	@Override
	void sound() { // 메소드 재정의
		System.out.println(super.getType() + " : 멍멍 소리를 냅니다.");
	}
}

public class Answer_04 {
	public static void play(Animal ani) {
		ani.run(); // run메소드 호출
		ani.sound(); // sound메소드 호출
	}

	public static void main(String[] args) {
		Animal animal = new Baby("신생아");
		play(animal);
		animal = new Dog("강아지");
		play(animal);
	}
}
