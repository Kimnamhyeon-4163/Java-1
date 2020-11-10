package sub4;

public class Increment {

	public int num1;
	public static int num2;
	
	public Increment(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
	
	public static void add() {
		// 정적메서드에서 none static 변수를 참조 할 수 없다.
		num2++;
	}
	
}




