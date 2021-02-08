package Week13;

import java.util.*;

class Board {
	private String writer; // �۾���
	private String title; // ����

	public Board(String writer, String title) {
		this.writer = writer;
		this.title = title;
	}

	public String toString() {
		return "Board [writer=" + writer + ", title=" + title + "]";
	}
}

public class VectorExam {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		list.add(new Board("java", "List"));
		list.add(new Board("js", "Event"));
		list.add(new Board("C++", "Virtual"));
		System.out.println("----- ���� �� -----");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i).toString());
		list.remove(1);
		System.out.println("----- ���� �� -----");
		for (Board b : list)
			System.out.println(b.toString());
	}
}
