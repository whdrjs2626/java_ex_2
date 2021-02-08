package Week7;

@FunctionalInterface
interface Vehicle {
	void run(int num);
}

abstract class Person {
	String dept;

	Person(String dept) {
		this.dept = dept;
	}

	void work() {
		System.out.println("����մϴ�.");
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		Vehicle taxi = new Vehicle() {
			public void run(int num) {
				System.out.println(num + "���� �ýð� �޸��ϴ�.");
				power();
			}

			public void power() {
				System.out.println("�ýô� LPG�� ����մϴ�.");
			}
		};

		Vehicle bus = num -> {
			System.out.println(num + "���� ������ �޸��ϴ�");
		};

		Person java = new Person("Hallym") {
			void time(int t) {
				System.out.println("��� �ð��� " + t + "�� �Դϴ�.");
			}

			void work() {
				System.out.println(dept + "���� �ٹ��մϴ�.");
				time(13);
			}
		};

		bus.run(3);
		taxi.run(5);
		java.work();
	}
}
