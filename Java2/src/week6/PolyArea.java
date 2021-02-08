package week6;
import java.util.Scanner;
abstract class Shape { // 추상 클래스
	abstract double area(); // 추상 메소드 area()
	abstract void write(); // 추상 메소드 write()
}

class Circle extends Shape{
	static final double PI = 3.14;
	double r;

	public Circle(double r) {
		this.r = r;
	}
	@Override
	double area() { // 재정의
		return r * r * PI;
	}
	@Override
	void write() { // 재정의
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
	double area() {  // 재정의
		return d1 * d2;
	}
	@Override
	void write() {  // 재정의
		System.out.print("Rectangle  [ga=" + d1 + "\tse=" + d2);
		System.out.printf("\tarea = %.2f ]\n", area());
	}
}

class PolyArea {
	public static void write(Shape[] sh) { // Shape배열의 원소들의 write메소드를 호출해 문장출력
		for(Shape obj : sh) {
			if(obj != null) 
				obj.write();
		}
	}
	public static double input(String str, Scanner in) { // 매개변수로 입력받은 문자열을 출력하고 Double형 입력
		System.out.print(str);
		return in.nextDouble();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Shape[] sh = new Shape[10];
		boolean flag = true;
		int i = 0;
		while(flag) {
			System.out.print("1. 원넓이       2. 사각형넓이     3. 종료    : ");
			int num = in.nextInt();
			switch(num) {
			case 1:
				double r = input("반지름 입력 : ", in);
				sh[i++] = new Circle(r);
				break;
			case 2:
				double ga = input("가로 값을 입력 : ", in);
				double se = input("세로 값을 입력 : ", in);
				sh[i++] = new Rectangle(ga, se);
				break;
			case 3:
				flag = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		write(sh);
		in.close();
		System.out.println("프로그램 종료");
	}
}
