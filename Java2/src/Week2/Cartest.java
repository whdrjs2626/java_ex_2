package Week2;

class Car {
	int mileage;
	String color;

	public void setmileage(int mileage) {

		this.mileage = mileage;

	}

}

public class Cartest {
	public static void main(String[] args) {
		Car car = new Car();
		car.color = "blue";
		System.out.println(car.color);
		car.setmileage(100002);
		System.out.println(car.mileage);
	}
}
