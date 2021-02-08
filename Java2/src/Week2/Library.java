package Week2;

import java.util.*;

class Book {
	private String name;
	private int pages;
	private int year;

	public Book(String name, int pages, int year) { // 생성자 
		this.name = name;
		this.pages = pages;
		this.year = year;
	}
	// name, pages, year의 getter, setter 메소드
	public String getName() {
		return name;
	}
	public int getPages() {
		return pages;
	}
	public int getYear() {
		return year;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() { //객체 내용를 문자열로 반환하는 toString() 메소드 – 본인작성
		return "이름 : " + name + "  ,페이지 : " + pages + "  ,출판 년도 : " + year;
	}
	
	static void search(String book, Book[] arr) { // Book 객체 배열과 문자열(책 이름)을 받아 원하는 책을 찾는 search메소드
		for (int i = 0; i < arr.length; i++) {
			if (book.equals(arr[i].name) == true) { // book과 arr[i]의 이름이 같은 경우 = 원하는 책을 찾은 경우
				System.out.println(arr[i]);
				return;
			}
		}
		System.out.println("해당 도서가 없습니다.");
	}
}

public class Library {
	public static void main(String[] args) {
		Book[] book = { new Book("자바", 150, 2016), new Book("파이썬", 100, 2019), new Book("자바스크립트", 200, 2018) };
		Scanner in = new Scanner(System.in);
		System.out.print("검색하고자 하는 제목을 입력하세요 >> ");
		String title = in.nextLine();
		Book.search(title, book);
	}
}
