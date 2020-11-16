package sub1;
//중첩클래스
public class Outer {
	private int x;
	
	public Outer(int x) {
		this.x = x;
	}
	public void show() {
		System.out.println("Outer x : "+x);
	}
	
	// 내부클래스
	public class Inner {
		private int x;
		
		public Inner(int x) {
			this.x = x;
		}
		public void show() {
			System.out.println("Inner x : "+x);
		}
	}
}
