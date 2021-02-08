package week6;
class TV implements RemoteControl {
	private int volume;
	@Override
	public void turnOn() { // 추상메소드의 실체 메소드
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void turnOff() { // 추상메소드의 실체 메소드
		System.out.println("TV를 끕니다.");
	}
	@Override
	public void setVolume(int volume) { // 추상메소드의 실체 메소드
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨 : " + this.volume);
	}
}
class SmartPhone implements RemoteControl {
	private int volume;
	@Override
	public void turnOn() { // 추상메소드의 실체 메소드
		System.out.println("스마트폰을 켭니다.");
	}
	@Override
	public void turnOff() { // 추상메소드의 실체 메소드
		System.out.println("스마트폰을 끕니다.");
	}
	@Override
	public void setVolume(int volume) { // 추상메소드의 실체 메소드
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨 : " + this.volume);
	}
}
public class Lec_02 {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new TV();
		rc.turnOn();
		System.out.println("----- TV 볼륨을 10으로 합니다 -----");
		rc.setVolume(10);
		System.out.println("----- TV 볼륨을 무음으로 합니다 -----");
		rc.setMute(true);
		rc = new SmartPhone();
		rc.turnOn();
		System.out.println("----- SmartPhone 볼륨을 50으로 합니다 -----");
		rc.setVolume(50);
		RemoteControl.changeBattery();
		int a = SmartPhone.MIN_VOLUME;
	}
}
