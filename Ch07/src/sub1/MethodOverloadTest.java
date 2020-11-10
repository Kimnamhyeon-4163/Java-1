package sub1;

/*
 * 날짜 : 2020/11/05
 * 이름 : 김철학
 * 내용 : 오버로드 메서드 실습하기 교재 p162
 * 
 * Overload Method
 *  - 메서드 이름이 똑같고 매개변수의 갯수와 타입으로 구분하는 메서드
 * 
 */
public class MethodOverloadTest {
	
	public static void main(String[] args) {
		
		int r1 = add(1);
		System.out.println("r1 : "+r1);
	
		int r2 = add(1, 2);
		System.out.println("r2 : "+r2);
		
		String r3 = add("홍길동");
		System.out.println("r3 : "+r3);
		
	}
	
	public static int add(int a) {
		return a++;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static String add(String name) {
		return name+"님 반갑습니다.";
	}
}
