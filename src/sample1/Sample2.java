package sample1;
import java.util.*;

public class Sample2 {

	public static void main(String[] args) {
		// 비교연산자 ==, !=
		/*
		 * 정수 3(a,b,c)개를 입력받아 a와 b,c를 각각 비교하여 같으면 1, 
		 * 같지않으면 0을 출력하고, 다음에는 같지 않으면 1, 같으면 0을 출력
		 * 입력예 10 20 20
		 * 출력예 0 1 1 0
		 */
		boolean	result1, result2, result3, result4;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하세요. : ");
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		result1 = (a == b);
		result2 = (b == c);
		result3 = (a != b);
		result4 = (b != c);
				
		System.out.printf("%b %b %b %b \n",
				result1, result2, result3, result4);
		
		/*
		 * 3개의 정수를 a, b, c를 입력받아서 a가 b보다 큰지, b가 c보다
		 * 크거나 같은지, a가 b보다 작거나 같은지, b가 c보다 작은지
		 * 비교하여 참이면 true, 거짓이면 false를 각각 출력
		 * 입력예) 1 2 2
		 * 출력예) f t t f
		 */
		
		System.out.print("3정수를 입력하세요. : ");
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
				
		result1 = (a > b);
		result2 = (b >= c);
		result3 = (a <= b);
		result4 = (b < c);
						
		System.out.printf("%b %b %b %b \n",
				result1, result2, result3, result4);
		
		

	}

}
