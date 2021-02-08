package Week9;
class Car {
	private String color;
	Tire t; // �ν��Ͻ� ��� Ŭ���� ��ü ����
	Car(String color) {
		this.color = color;
		t = new Tire("�ѱ�Ÿ�̾�");
	}
	void carShow() {
		System.out.println("���� : " + color);
		t.tireShow();
	}
	class Tire { // �ν��Ͻ� ��� Ŭ����
		String company;
		Tire(String company) {
			this.company = company;
		}
		void tireShow() {
			System.out.println("������  : " + company);
		}
	}
	static class Engine { // ���� ��� Ŭ����
		int num; // �ν��Ͻ� �ʵ�
		static int year; // ���� �ʵ�
		Engine(int y , int num) {
			year = y;
			this.num = num;
		}
		void numShow() {
			System.out.println("�ν��Ͻ� ��� num : " + num);
			System.out.println("���� ��� Ŭ���� year : " + year); // �ν��Ͻ� �޼ҵ忡�� ���� ��� ��� ����
		}
		static void engineShow() { // ���� �޼ҵ�
			// System.out.println("�ν��Ͻ� ��� num : " + num); // ���� �޼ҵ忡�� �ν��Ͻ� ��� ��� �Ұ���
			System.out.println("���� ��� Ŭ���� year : " + year);
		}
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		Car car = new Car("black"); // �ܺ� Ŭ���� ��ü ����
		Car.Tire tire = car.new Tire("�ؽ�"); // �ν��Ͻ� ��� Ŭ���� ��ü ����
		Car.Engine engine = new Car.Engine(2020,  25461);
		car.carShow();
		tire.tireShow();
		engine.engineShow();
		Car.Engine.engineShow();
	}
}
