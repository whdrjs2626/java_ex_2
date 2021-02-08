package week6;
import java.util.Scanner;
abstract class Shape { // �߻� Ŭ����
	abstract double area(); // �߻� �޼ҵ� area()
	abstract void write(); // �߻� �޼ҵ� write()
}

class Circle extends Shape{
	static final double PI = 3.14;
	double r;

	public Circle(double r) {
		this.r = r;
	}
	@Override
	double area() { // ������
		return r * r * PI;
	}
	@Override
	void write() { // ������
		System.out.print("Circle     [radius= " + r);
		System.out.printf("\t\tarea = %.2f ]\n", area());
	}
}

class Rectangle extends Shape {
	private double d1, d2;

	public Rectangle(double d1, double d2) {
		this.d1 = d1;
		this.d2 = d2;
	}
	@Override
	double area() {  // ������
		return d1 * d2;
	}
	@Override
	void write() {  // ������
		System.out.print("Rectangle  [ga=" + d1 + "\tse=" + d2);
		System.out.printf("\tarea = %.2f ]\n", area());
	}
}

class PolyArea {
	public static void write(Shape[] sh) { // Shape�迭�� ���ҵ��� write�޼ҵ带 ȣ���� �������
		for(Shape obj : sh) {
			if(obj != null) 
				obj.write();
		}
	}
	public static double input(String str, Scanner in) { // �Ű������� �Է¹��� ���ڿ��� ����ϰ� Double�� �Է�
		System.out.print(str);
		return in.nextDouble();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Shape[] sh = new Shape[10];
		boolean flag = true;
		int i = 0;
		while(flag) {
			System.out.print("1. ������       2. �簢������     3. ����    : ");
			int num = in.nextInt();
			switch(num) {
			case 1:
				double r = input("������ �Է� : ", in);
				sh[i++] = new Circle(r);
				break;
			case 2:
				double ga = input("���� ���� �Է� : ", in);
				double se = input("���� ���� �Է� : ", in);
				sh[i++] = new Rectangle(ga, se);
				break;
			case 3:
				flag = false;
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		write(sh);
		in.close();
		System.out.println("���α׷� ����");
	}
}
