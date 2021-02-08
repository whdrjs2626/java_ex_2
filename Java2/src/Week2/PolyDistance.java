package Week2;

import java.util.*;

class Distance{
	private String name;   //이름
	private int dist;        //통학거리
	public Distance(String name, int dist) { 
		this.name = name;
		this.dist = dist;
	}
	//이름과 통학거리 필드에 대한 getter, setter 메소드 – 본인작성
	public String getName() {
		return name;
	}
	public int getDistance() {
		return dist;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDistance(int dist) {
		this.dist = dist;
	}
	@Override
	public String toString() { //객체 내용(이름과 통학거리)를 문자열로 반환하는 toString() 메소드 – 본인작성
		return "[Name : " + name +  ",   Distance : " + dist + "]";
	}
}

class DistanceComp{	
//객체 배열을 매개변수로 받아 통학 거리가 가장 긴 객체를 반환하는  longdistance 정적 메소드 – 본인 작성
	public static Distance longdistance(Distance[] dim) {
		Distance max = dim[0];
		for(int i = 0; i < dim.length; i++) {
			if(max.getDistance() < dim[i].getDistance()) max = dim[i]; 
		}
		return max;
	}
//객체 배열을 매개변수로 받아 통학 거리가 가장 짧은 객체를 반환하는 shortdistance() 정적 메소드 – 본인 작성
	public static Distance shortdistance(Distance[] dim) {
		Distance min = dim[0];
		for(int i = 0; i < dim.length; i++) {
			if(min.getDistance() > dim[i].getDistance()) min = dim[i]; 
		}
		return min;
	}
	// 매개 변수로 받는 두 객체의 거리를 비교해 차이를 리턴해주는 distanceDifference메소드
	public static int distanceDifference(Distance l, Distance s) {
		return l.getDistance() - s.getDistance();
	}
}
public class PolyDistance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("객체 수 입력 : ");
		int a = sc.nextInt();
		Distance[] dist = new Distance[a];

		for (int i = 0; i < dist.length; i++) {
			System.out.print("이름, 거리 입력 : ");
			dist[i] = new Distance(sc.next(), sc.nextInt());
		}
		Distance longest = DistanceComp.longdistance(dist); // 통학 거리가 가장 긴 학생을 longest에 저장합니다.
		Distance shortest = DistanceComp.shortdistance(dist); // 통학 거리가 가장 긴 학생을 shortest에 저장합니다.
		System.out.println("통학 거리가 가장 긴   학생 : " + longest);
		System.out.println("통학 거리가 가장 짧은 학생 : " + shortest);
		System.out.println("두 학생 거리의 차 : " + DistanceComp.distanceDifference(longest , shortest)); // 메소드를 이용한 방법
		System.out.println("두 학생 거리의 차 : " + (longest.getDistance() - shortest.getDistance())); // 차이를 직접 출력하는 방법
	}
}

