package Week12;

class Shared {
	int sum, i;
	Shared() {
		sum = 0; // 1 ~ i까지의 합을 저장할 변수입니다.
		i = 1;
	}
	
	public synchronized void sharedM(String srName) { // 임계영역을 동기화해줍니다.
		sum += i; // sum에 i를 더해줍니다.
		System.out.println(srName + " : " + i++ + " -> " + sum); // 출력을 할 때마다 i를 1증가시킵니다.
	}
}

class MyThread extends Thread {
	private String str;
	private Shared s;
	MyThread(String str, Shared s) {
		this.str = str;
		this.s = s;
	}
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) { // 하나의 스레드마다 5번씩 메소드 호출
			s.sharedM(str);
		}
	}
}

public class Answer_04 {
	public static void main(String[] args) {
		Shared res = new Shared();
		MyThread my_thread1 = new MyThread("thd1", res);
		MyThread my_thread2 = new MyThread("thd2", res);
		MyThread my_thread3 = new MyThread("thd3", res);
		my_thread1.start();
		my_thread2.start();
		my_thread3.start();
	}
}
