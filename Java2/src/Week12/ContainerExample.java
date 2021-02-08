package Week12;

class Container <T> {
	private T t; 
	void set(T t) { // 멤버변수 t를 초기화하는 설정자 메소드입니다.
		this.t = t;
	}
	T get() { // t를 리턴해주는 접근자 메소드입니다.
		return t;
	}
}

public class ContainerExample {
	public static void main(String[] args) {
		Container<String> con1 = new Container<>(); 
		con1.set("홍길동"); 
		String str = con1.get();
		System.out.println(str);
		
		Container<Integer> con2 = new Container<>();
		con2.set(6);
		Integer ig = con2.get();
		System.out.println(ig);
	}
}
