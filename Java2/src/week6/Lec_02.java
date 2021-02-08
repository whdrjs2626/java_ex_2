package week6;
class TV implements RemoteControl {
	private int volume;
	@Override
	public void turnOn() { // �߻�޼ҵ��� ��ü �޼ҵ�
		System.out.println("TV�� �մϴ�.");
	}
	@Override
	public void turnOff() { // �߻�޼ҵ��� ��ü �޼ҵ�
		System.out.println("TV�� ���ϴ�.");
	}
	@Override
	public void setVolume(int volume) { // �߻�޼ҵ��� ��ü �޼ҵ�
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("���� ���� : " + this.volume);
	}
}
class SmartPhone implements RemoteControl {
	private int volume;
	@Override
	public void turnOn() { // �߻�޼ҵ��� ��ü �޼ҵ�
		System.out.println("����Ʈ���� �մϴ�.");
	}
	@Override
	public void turnOff() { // �߻�޼ҵ��� ��ü �޼ҵ�
		System.out.println("����Ʈ���� ���ϴ�.");
	}
	@Override
	public void setVolume(int volume) { // �߻�޼ҵ��� ��ü �޼ҵ�
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("���� ���� : " + this.volume);
	}
}
public class Lec_02 {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new TV();
		rc.turnOn();
		System.out.println("----- TV ������ 10���� �մϴ� -----");
		rc.setVolume(10);
		System.out.println("----- TV ������ �������� �մϴ� -----");
		rc.setMute(true);
		rc = new SmartPhone();
		rc.turnOn();
		System.out.println("----- SmartPhone ������ 50���� �մϴ� -----");
		rc.setVolume(50);
		RemoteControl.changeBattery();
		int a = SmartPhone.MIN_VOLUME;
	}
}
