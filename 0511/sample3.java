package sample1;

import java.util.Scanner;

public class sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �ΰ��� ������ �Է¹޾� ���׿����ڸ� �̿��� �μ���
		 * ū ���� ����ϴ� ���α׷�
		 * �Է¿�) 89 100
		 * ��¿� )100
		 */

		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int maxData;
		
		maxData = (a > b) ? a : b;
		
		System.out.println(maxData);
		
		
	}
	

}
