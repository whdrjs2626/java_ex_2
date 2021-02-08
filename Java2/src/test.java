import java.util.StringTokenizer;

public class test {
	public static void main(String[] args) {
		String str="java";

		System.out.println(str.length());
		System.out.println("java programming".substring(5,10));
		StringTokenizer stok = new StringTokenizer("사과 배 복숭아");

		System.out.println(stok.countTokens());
		System.out.println(Math.round(7.5));
		System.out.println(Math.floor(7.9));
	}
}
