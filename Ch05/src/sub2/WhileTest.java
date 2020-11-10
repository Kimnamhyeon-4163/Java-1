package sub2;

/*
 * 날짜 : 2020/11/04
 * 이름 : 김철학
 * 내용 : 반복문 While 실습하기 교재 p92
 */
public class WhileTest {
	public static void main(String[] args) {
		
		// 1부터 10까지 합
		int k = 1;
		int sum = 0;
		
		while(k <= 10) {
			sum += k;
			k++;
		}
		
		System.out.println("1부터 10까지 합 : "+sum);
				
		// do ~ while : 최초 한번은 무조건 실행하는 반복문
		int eSum = 0;
		int i = 1;
		
		do{
			if(i%2 == 0) {
				eSum += i;				
			}
			
			i++;
		}while(i <= 10);
		
		System.out.println("1부터 10까지 짝수합 : "+eSum);
		
		// break : 반복문 종료
		int num = 1;
		
		while(true) {
			
			num++;
			
			if(num % 5 == 0  && num % 7 == 0) {
				break;
			}
		}
		
		System.out.println("5와 7의 최소공배수 : "+num);
		
		// continue : 반복문의 끝으로 이동(상위로 이동)
		int total = 0;
		
		for(int j=1 ; j<=10 ; j++) {
			
			if(j%2 == 1) {
				// j가 홀수이면 반복문의 상위로 이동, 아래의 연산로직으로 이동하지 않음
				continue;
			}
			
			total += j;			
		}
		
		System.out.println("1부터 10까지 짝수 합 : "+total);
	}
}








