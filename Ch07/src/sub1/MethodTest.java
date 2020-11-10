package sub1;

/*
 * 날짜 : 2020/11/05
 * 이름 : 김철학
 * 내용 : 메서드 실습하기 교재 p152
 * 
 * Method(함수)
 *  - 일련의 코드 로직을 모듈화 시킨것
 *  - 정의(define)한 메서드를 호출(call)해서 실행
 */
public class MethodTest {
	public static void main(String[] args) {
		
		// 메서드 호출(실행)
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 : "+y1);
		System.out.println("y2 : "+y2);
		System.out.println("y3 : "+y3);
		
		// add 메서드 호출
		int z1 = add(1, 2);
		int z2 = add(2, 3);
		int z3 = add(3, 4);
		
		System.out.println("z1 : "+z1);
		System.out.println("z2 : "+z2);
		System.out.println("z3 : "+z3);
		
		// sub 메서드 호출
		int r1 = sub(1, 2);
		int r2 = sub(2, 3);
		int r3 = sub(3, 5);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		
		// sum 메서드 호출
		int result1 = sum(1, 10);
		int result2 = sum(1, 100);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		
		
	}// main 끝
	
	// f 메서드 정의
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
	}
	
	// add 메서드 정의
	public static int add(int x, int y) {
		int z = x + y;
		return z;
	} 
	
	// sub 메서드 정의
	public static int sub(int a, int b) {
		int result = a - b;
		return result;
	}
	
	// sum 메서드 정의
	public static int sum(int start, int end) {
	
		int sum = 0;
		
		for(int k=start ; k<=end ; k++) {
			sum += k;			
		}
		
		return sum;		
	}
	
}













