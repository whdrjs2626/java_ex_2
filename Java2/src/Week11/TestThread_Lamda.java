package Week11;

public class TestThread_Lamda {
	public static void main(String[] args) {
		Thread th1 = new Thread( () -> { // ���ٽ����� �����ϴ� Runnable �������̽�
			try {
				char[] ch = {'��', '��', '��', '��', '��', '��', '��', '��', '��', '��' };
				for(int i = 0; i < ch.length; i++) {
					System.out.println("lamda1 : " + ch[i]); // Ư������ ���
					Thread.sleep(500);
				}
			}catch(InterruptedException e) {}	
		});
		
		Thread th2 = new Thread( () -> {
			try {
				String str = "university";
				for(int i = 0; i < str.length(); i++) {
					System.out.println("lamda2 : " + str.charAt(i)); // ������ ���
					Thread.sleep(500);
				}
			}catch(InterruptedException e) {}	
		});
		
		th1.start();
		th2.start();
	}
}
