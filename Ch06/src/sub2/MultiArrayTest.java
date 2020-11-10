package sub2;

/*
 * 날짜 : 2020/11/04
 * 이름 : 김철학
 * 내용 : 다차원 배열 실습하기 교재 p118
 */
public class MultiArrayTest {
	public static void main(String[] args) {
		// 1차원 배열
		int scores[] = {80, 60, 78, 62, 92}; 
		int sum = 0;
		
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println("배열 scores의 총합 : "+sum);
		
		// 2차원 배열
		int arr2d[][] = {{1,  2,  3,  4},
				         {5,  6,  7,  8},
				         {9, 10, 11, 12}};
		
		for(int a=0 ; a<3 ; a++) {
			for(int b=0 ; b<4 ; b++) {
				System.out.println("배열 arr2d["+a+"]["+b+"] : "+arr2d[a][b]);
			}
		}
		
		// 3차원 배열
		int arr3d[][][] = {{{ 1,  2,  3},
			                { 4,  5,  6},
			                { 7,  8,  9}},
				           {{10, 11, 12},
			                {13, 14, 15},
			                {16, 17, 18}},
				           {{19, 20, 21},
			                {22, 23, 24},
			                {25, 26, 27}}};
		
		System.out.println("3차원 배열 arr3d[0][0][0] : "+arr3d[0][0][0]);
		System.out.println("3차원 배열 arr3d[1][0][1] : "+arr3d[1][0][1]);
		System.out.println("3차원 배열 arr3d[1][2][2] : "+arr3d[1][2][2]);
		System.out.println("3차원 배열 arr3d[2][1][1] : "+arr3d[2][1][1]);
	}
}