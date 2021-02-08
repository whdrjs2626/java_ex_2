package Week14;

import java.io.*;
import java.util.*;

class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name; // 책의 이름 멤버 변수
	private String author; // 저자 이름 멤버 변수 

	public String getAuthor() { // 저자 이름 접근자
		return author;
	}

	public Book(String name, String author) { // 생성자
		this.name = name; 
		this.author = author;
	}

	public void disPlay() { // 객체 출력 메소드
		System.out.print("도서명 : " + name);
		System.out.println("\t저자명 : " + author);
	}
}
class Manage {

	public void print(List<Book> list) {
		for(int i = 0; i < list.size(); i++) {
			list.get(i).disPlay();
		}
	}
    public void search(List<Book> list, Scanner in) {
    	System.out.println("dlqfur : ");
    	String str = in.next();
    	if(list.contains(str)) {
    		list.get(list.indexOf(str)).disPlay();
    	}
    	else {
    		System.out.println();
    	}
    }
	static List<Book> read() throws Exception {
    	ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat")); // ObjectInputStream이 역직렬화 함
    	@SuppressWarnings("unchecked") // 타입 체킹이 안전하기에 체크할 필요가 없다라는 표시를 해두는 어노테이션 
    	List<Book> list = (List<Book>)in.readObject(); // 원래 객체의 타입 List<Book>으로 강제 형변환 해줘야 Book클래스의 필드 사용 가능
    	in.close();
    	return list; // 파일에서 읽어온 객체를 리턴해줍니다. 
    }
	
	static void write(List<Book> list) throws Exception {
    	ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.dat"));
    	out.writeObject(list);
    	out.flush();
    	out.close();
    }
	
	public Book push(Scanner in) {
		Book log = new Book("qkrwhdrjs", "whdrjs");
		return log;
	}
}
public class Answer_03 {
	public static void main(String[] args) throws Exception {
		/*List<Book> list = new ArrayList<>();
		try {
			list = readList(); // 파일에 저장된 ArrayList객체를 가져와 저장합니다.
			System.out.println("--- 파일에 저장된 값을 출력합니다. ---");
			for(Book obj : list) {
				obj.disPlay(); // 출력
			}
			System.out.println();
		} catch(IOException e) { // 읽을 객체가 없을 시 예외가 발생합니다.
			System.out.println("저장된 값이 없습니다.\n");
		}
		writeList(list); // 프로그램 종료 전에 Book 객체가 저장된 list를 파일에 저장해줍니다.
		*/
		List<Book> list2 = null;
		Scanner key = new Scanner(System.in);
		Manage mg = new Manage();
		Book log = null;
		list2 = mg.read();
		while(true) {
			System.out.println("1,23");
			int answer = key.nextInt();
			if(answer == 4) break;
			switch(answer) {
			case 1: log = mg.push(key); list2.add(log); break;
			case 2: mg.search(list2, key); break;
			case 3: mg.print(list2);
			}
		}

		System.out.println("all");
		mg.write(list2);
		key.close();
	}
    static List<Book> readList() throws Exception {
    	ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat")); // ObjectInputStream이 역직렬화 함
    	@SuppressWarnings("unchecked") // 타입 체킹이 안전하기에 체크할 필요가 없다라는 표시를 해두는 어노테이션 
    	List<Book> list = (List<Book>)in.readObject(); // 원래 객체의 타입 List<Book>으로 강제 형변환 해줘야 Book클래스의 필드 사용 가능
    	in.close();
    	return list; // 파일에서 읽어온 객체를 리턴해줍니다. 
    }

    static void writeList(List<Book> list) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int a = 1;
    	while(a != -1) {
    		System.out.print("도서명 , 저자를 입력하세요 : ");
    		list.add(new Book(sc.next(), sc.next())); // 읽어온 객체에 새로 저장할 객체를 추가해줍니다. 
    		System.out.print("더 이상 리스트에 저장을 원하지 않으면 -1 입력 : ");
    		a = sc.nextInt();
    	}
    	System.out.println("리스트에 파일을 저장합니다.");
    	// 파일을 읽어와 객체에 저장하고 그 객체를 다시 파일에 저장해주는 것이므로 덮어씌우지 않고 추가해주기 위한 true인자는 넣지 않았습니다. 
    	ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.dat"));
    	out.writeObject(list);
    	out.flush();
    	out.close();
    }
}
