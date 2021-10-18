package sample1;

import java.util.Scanner;

public class sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 두개의 정수를 입력받아 삼항연산자를 이용해 두수중
		 * 큰 수를 출력하는 프로그램
		 * 입력예) 89 100
		 * 출력예 )100
		 */

		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int maxData;
		
		maxData = (a > b) ? a : b;
		
		System.out.println(maxData);
		
		
	}
	

}
