package sub4;

public class Calc {
	
	// 싱글톤 객체생성
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	// 외부에서 객체생성을 할 수 없게 private 생성자를 선언
	private Calc() {}
	
	
	public int plus(int x, int y) {
		return x+y;
	}
	
	public int minus(int x, int y) {
		return x-y;
	}
	
	public int multi(int x, int y) {
		return x*y;
	}
	
	public int div(int x, int y) {
		return x/y;
	}
}
