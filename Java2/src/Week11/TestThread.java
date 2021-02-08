package Week11;

class Thread1 implements Runnable {
	@Override
	public void run() {
		try {
			char[] ch = {'★', '♨', '◇', '■', '♣', '▣', '◈' };
			for(int i = 0; i < ch.length; i++) {
				System.out.println("lamda1 : " + ch[i]); // 특수문자 출력
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {}	
	}
	
}

class Thread2 implements Runnable {
	@Override
	public void run() {
		try {
			String str = "hallym";
			for(int i = 0; i < str.length(); i++) {
				System.out.println("lamda2 : " + str.charAt(i)); // 영문자 출력
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {}	
	}
	
}

public class TestThread {
	public static void main(String[] args) {
		Thread th1 = new Thread(new Thread1());
		Thread th2 = new Thread(new Thread2());
		th1.start();
		th2.start();
	}
}
