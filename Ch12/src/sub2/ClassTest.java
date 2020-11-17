package sub2;

import sub1.Apple;

/*
 * 날짜 : 2020/11/17
 * 이름 : 김철학
 * 내용 : Class 클래스 실습하기 교재 p295
 */
public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		// 정적객체
		Apple a1 = new Apple("한국", 3000);
		a1.toString();
		
		// 동적로딩 객체
		Class object = Class.forName("sub1.Apple");
		Apple a2 = (Apple) object.newInstance();
		
		a2.toString();
	}
}







