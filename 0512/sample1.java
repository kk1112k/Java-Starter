package sample1;

import java.util.Scanner;

public class sample1 {

	public static void main(String[] args) {
		//삼항 연산자
		/*
		 * 문제 ) 3개의 정수를 입력받아 삼항연산자를 이용하여 입력받은
		 * 수들 중 최소값을 출력하는 프로그램
		 * 입력예)18 -5 10
		 * 출력예)-5
		 */
		
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int min;
		
		//min = (a<b) ? a :b ;
		// min = (min<c ) ? min : c;
		
		min = (a<b) ? ((a<c)? a : c)  : ((b<c)? b : c) ;
		System.out.println("최소값은  : " + min);
	}
}
