package sub1;

/*
 * 날짜 : 2020/11/10
 * 이름 : 김철학
 * 내용 : 클래스 상속 실습하기 교재 p196
 */
public class InheritanceTest {

	public static void main(String[] args) {
		
		StockAccount kb = new StockAccount("KB증권", "123-11-1234", "김유신", 1000000, "삼성전자", 10, 53000);
		
		kb.sell(5, 51000);
		kb.buy(10, 50100);
		
		kb.show();
		
		
	}
}
