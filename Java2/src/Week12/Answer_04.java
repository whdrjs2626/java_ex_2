package Week12;

class Shared {
	int sum, i;
	Shared() {
		sum = 0; // 1 ~ i������ ���� ������ �����Դϴ�.
		i = 1;
	}
	
	public synchronized void sharedM(String srName) { // �Ӱ迵���� ����ȭ���ݴϴ�.
		sum += i; // sum�� i�� �����ݴϴ�.
		System.out.println(srName + " : " + i++ + " -> " + sum); // ����� �� ������ i�� 1������ŵ�ϴ�.
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
		for(int i = 0; i < 5; i++) { // �ϳ��� �����帶�� 5���� �޼ҵ� ȣ��
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
