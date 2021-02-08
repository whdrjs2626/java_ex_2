package JAVA2;

public class Answer_04 {
	static int max_index(int[] arr) { // 페이지 수가 가장 높은 책의 순서를 리턴하는 함수
		int max = arr[0]; // 최대값 설정
		int index = 0; // 최대값의 인덱스 초기화
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) { // 최대값을 찾아줍니다.
				max = arr[i]; // max에 최대값 저장
				index = i; // 최대값의 인덱스 저장
			}
		}
		return index; // 리턴
	}
	
	public static void main(String[] args) {
		String[] title = { "자바", "파이썬", "코딩", "자바스크립트", "자료구조" };
		int[] pages = { 150, 100, 120, 200, 180 };
		int max_page = max_index(pages);
		System.out.println("최대 페이지 수 : " + pages[max_page]);
		System.out.println("최대 페이지수를 가진 책 : " + title[max_page]);
	}
}
