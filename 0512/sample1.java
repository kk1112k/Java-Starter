package sample1;

import java.util.Scanner;

public class sample1 {

	public static void main(String[] args) {
		//���� ������
		/*
		 * ���� ) 3���� ������ �Է¹޾� ���׿����ڸ� �̿��Ͽ� �Է¹���
		 * ���� �� �ּҰ��� ����ϴ� ���α׷�
		 * �Է¿�)18 -5 10
		 * ��¿�)-5
		 */
		
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int min;
		
		//min = (a<b) ? a :b ;
		// min = (min<c ) ? min : c;
		
		min = (a<b) ? ((a<c)? a : c)  : ((b<c)? b : c) ;
		System.out.println("�ּҰ���  : " + min);
	}
}
