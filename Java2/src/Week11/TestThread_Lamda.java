package Week11;

public class TestThread_Lamda {
	public static void main(String[] args) {
		Thread th1 = new Thread( () -> { // 람다식으로 구현하는 Runnable 인터페이스
			try {
				char[] ch = {'★', '♨', '●', '◇', '■', '▼', '♠', '♣', '▣', '◈' };
				for(int i = 0; i < ch.length; i++) {
					System.out.println("lamda1 : " + ch[i]); // 특수문자 출력
					Thread.sleep(500);
				}
			}catch(InterruptedException e) {}	
		});
		
		Thread th2 = new Thread( () -> {
			try {
				String str = "university";
				for(int i = 0; i < str.length(); i++) {
					System.out.println("lamda2 : " + str.charAt(i)); // 영문자 출력
					Thread.sleep(500);
				}
			}catch(InterruptedException e) {}	
		});
		
		th1.start();
		th2.start();
	}
}
