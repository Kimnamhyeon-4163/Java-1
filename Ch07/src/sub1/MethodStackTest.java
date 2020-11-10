package sub1;

/*
 * 날짜 : 2020/11/05
 * 이름 : 김철학
 * 내용 : 메서드 실행순서와 스택 실습하기 교재 p159
 */
public class MethodStackTest {
	
	// 전역변수 : 클래스에서 선언한 변수
	int num = 1;
	
	public static void main(String[] args) {
		// 지역변수 : 메서드에서 선언한 변수, 메서드가 종료되면 메모리에서 제거
		int result = 0;
		int start = 1;
		int end = 10;
		
		result = sum(start, end);
		
		System.out.println("결과 : "+result);
		
	}// main 끝
	
	public static int sum(int s, int e) {
		// 지역변수
		int sum = 0;
		
		for(int k=s ; k<=e ; k++) {
			sum += k;
		}
		
		return sum;
	}
}
