package Week9;
class Car {
	private String color;
	Tire t; // 인스턴스 멤버 클래스 객체 참조
	Car(String color) {
		this.color = color;
		t = new Tire("한국타이어");
	}
	void carShow() {
		System.out.println("색상 : " + color);
		t.tireShow();
	}
	class Tire { // 인스턴스 멤버 클래스
		String company;
		Tire(String company) {
			this.company = company;
		}
		void tireShow() {
			System.out.println("제조사  : " + company);
		}
	}
	static class Engine { // 정적 멤버 클래스
		int num; // 인스턴스 필드
		static int year; // 정적 필드
		Engine(int y , int num) {
			year = y;
			this.num = num;
		}
		void numShow() {
			System.out.println("인스턴스 멤버 num : " + num);
			System.out.println("정적 멤버 클래스 year : " + year); // 인스턴스 메소드에서 정적 멤버 사용 가능
		}
		static void engineShow() { // 정적 메소드
			// System.out.println("인스턴스 멤버 num : " + num); // 정적 메소드에서 인스턴스 멤버 사용 불가능
			System.out.println("정적 멤버 클래스 year : " + year);
		}
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		Car car = new Car("black"); // 외부 클래스 객체 생성
		Car.Tire tire = car.new Tire("넥슨"); // 인스턴스 멤버 클래스 객체 생성
		Car.Engine engine = new Car.Engine(2020,  25461);
		car.carShow();
		tire.tireShow();
		engine.engineShow();
		Car.Engine.engineShow();
	}
}
