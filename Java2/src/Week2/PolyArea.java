package Week2;

import java.util.*;
class Circle {
	static final double PI = 3.14;
	private double radius;
	public Circle(double radius) { // 생성자
		this.radius = radius;
	}
	double area() { // 원의 넓이를 계산하는 메소드
		return radius*radius*PI;
	}
	public double getRadius() { // 반지름의 게터 메소드
		return radius;
	}
	public void setRadius(double radius) { // 반지름의 세터 메소드
		this.radius = radius;
	}
	@Override
	public String toString() { // 출력 메소드
		return "Circle [radius = " + radius + ", area = " + area() + "]";
	}
}
class Rectangle {
	private double ga, se;
	public Rectangle(double ga, double se) { // 생성자
		this.ga = ga;
		this.se = se;
	}
	double area() { // 사각형 넓이 계산 메소드
		return ga*se;
	}
	@Override
	public String toString() { // 출력 메소드
		return "Rectangle [ga = " + ga + ", se = " + se + ", area = " + area() + "]";
	}
}
public class PolyArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rect = null;
		Circle circle = null;
		System.out.print("원 넓이는 1, 사각형 넓이는 2를 입력 : ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.print("반지름 입력 : ");
			double ra = sc.nextDouble();
			circle = new Circle(ra);
			System.out.println(circle);
			break;
		case 2:
			System.out.println("가로와 세로 값을 순차적으로 입력 : ");
			double ga = sc.nextDouble();
			double se = sc.nextDouble();
			rect = new Rectangle(ga, se);
			System.out.println(rect);
			break;
		default:
			System.out.println("1이나 2가 아닌 다른 숫자를 입력했습니다.");
		}
		System.out.println("프로그램 종료");
	}
}
