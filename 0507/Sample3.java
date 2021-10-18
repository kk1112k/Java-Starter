package sample1;
import java.util.*;
public class Sample3 {

	public static void main(String[] args) {
		/*
		 * 문제)정수 2개를 입력받아서 큰수와 작은수를 차례로 출력하는
		 * 프로그램
		 * 힌트 - 입력도 변수 a,b / 출력도 변수 a,b
		 * 입력 예) 2 9
		 * 출력 예) 입력받은 수 중 큰수는 9이고, 작은 수는 2 입니다.
		 */
		Scanner scn = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요. : ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int tmp;
		
		if(a<b)
		{
			tmp=a;
			a=b;
			b=tmp;
		}
			System.out.printf("입력받은 수 중 큰수는 %d이고, 작은 수는 %d입니다.",a,b);
		
	}

}
