package Week2;

import java.util.*;
class Circle {
	static final double PI = 3.14;
	private double radius;
	public Circle(double radius) { // ������
		this.radius = radius;
	}
	double area() { // ���� ���̸� ����ϴ� �޼ҵ�
		return radius*radius*PI;
	}
	public double getRadius() { // �������� ���� �޼ҵ�
		return radius;
	}
	public void setRadius(double radius) { // �������� ���� �޼ҵ�
		this.radius = radius;
	}
	@Override
	public String toString() { // ��� �޼ҵ�
		return "Circle [radius = " + radius + ", area = " + area() + "]";
	}
}
class Rectangle {
	private double ga, se;
	public Rectangle(double ga, double se) { // ������
		this.ga = ga;
		this.se = se;
	}
	double area() { // �簢�� ���� ��� �޼ҵ�
		return ga*se;
	}
	@Override
	public String toString() { // ��� �޼ҵ�
		return "Rectangle [ga = " + ga + ", se = " + se + ", area = " + area() + "]";
	}
}
public class PolyArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rect = null;
		Circle circle = null;
		System.out.print("�� ���̴� 1, �簢�� ���̴� 2�� �Է� : ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.print("������ �Է� : ");
			double ra = sc.nextDouble();
			circle = new Circle(ra);
			System.out.println(circle);
			break;
		case 2:
			System.out.println("���ο� ���� ���� ���������� �Է� : ");
			double ga = sc.nextDouble();
			double se = sc.nextDouble();
			rect = new Rectangle(ga, se);
			System.out.println(rect);
			break;
		default:
			System.out.println("1�̳� 2�� �ƴ� �ٸ� ���ڸ� �Է��߽��ϴ�.");
		}
		System.out.println("���α׷� ����");
	}
}
