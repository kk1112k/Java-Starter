package sample1;
import java.util.*;
public class Sample3 {

	public static void main(String[] args) {
		/*
		 * ����)���� 2���� �Է¹޾Ƽ� ū���� �������� ���ʷ� ����ϴ�
		 * ���α׷�
		 * ��Ʈ - �Էµ� ���� a,b / ��µ� ���� a,b
		 * �Է� ��) 2 9
		 * ��� ��) �Է¹��� �� �� ū���� 9�̰�, ���� ���� 2 �Դϴ�.
		 */
		Scanner scn = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���. : ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int tmp;
		
		if(a<b)
		{
			tmp=a;
			a=b;
			b=tmp;
		}
			System.out.printf("�Է¹��� �� �� ū���� %d�̰�, ���� ���� %d�Դϴ�.",a,b);
		
	}

}
