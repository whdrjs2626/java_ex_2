package Week11;
class ThreadA extends Thread {
	public void run() {
		try {
			for(char ch = 'A'; ch <= 'M'; ch++) {
				System.out.print(ch);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {}
	}
}

class ThreadB implements Runnable {
	@Override
	public void run() {
		try {
			for(int i = 1; i <= 10; i++) {
				System.out.print(i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {}	
	}
	
}

public class ThreadExam {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); // �� �ڵ带 �����ϴ� ������ ��ü ���
		System.out.println("���α׷� ���� ������ : " + mainThread.getName());
		ThreadA th1 = new ThreadA();
		Thread th2 = new Thread(new ThreadB());
		System.out.println("�۾� ������ �̸� : " + th1.getName());
		System.out.println("�۾� ������ �̸� : " + th2.getName());
		th1.start();
		th2.start();
	}
}
