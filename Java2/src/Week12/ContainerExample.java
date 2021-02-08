package Week12;

class Container <T> {
	private T t; 
	void set(T t) { // ������� t�� �ʱ�ȭ�ϴ� ������ �޼ҵ��Դϴ�.
		this.t = t;
	}
	T get() { // t�� �������ִ� ������ �޼ҵ��Դϴ�.
		return t;
	}
}

public class ContainerExample {
	public static void main(String[] args) {
		Container<String> con1 = new Container<>(); 
		con1.set("ȫ�浿"); 
		String str = con1.get();
		System.out.println(str);
		
		Container<Integer> con2 = new Container<>();
		con2.set(6);
		Integer ig = con2.get();
		System.out.println(ig);
	}
}
