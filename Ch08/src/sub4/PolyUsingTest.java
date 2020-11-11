package sub4;

/*
 * 날짜 : 2020/11/11
 * 이름 : 김철학
 * 내용 : 다형성 활용 실습하기
 */
public class PolyUsingTest {
	public static void main(String[] args) {
		
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		Shark shark = new Shark();
		
		// 다형성을 이용한 객체배열
		Animal animal[] = {tiger, eagle, shark};
		
		animal[0].move();
		animal[0].hunt();

		animal[1].move();
		animal[1].hunt();
		
		animal[2].move();
		animal[2].hunt();		
	}
}
