package sample1;
import java.util.*;

public class Sample2 {

	public static void main(String[] args) {
		// �񱳿����� ==, !=
		/*
		 * ���� 3(a,b,c)���� �Է¹޾� a�� b,c�� ���� ���Ͽ� ������ 1, 
		 * ���������� 0�� ����ϰ�, �������� ���� ������ 1, ������ 0�� ���
		 * �Է¿� 10 20 20
		 * ��¿� 0 1 1 0
		 */
		boolean	result1, result2, result3, result4;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("���� 3���� �Է��ϼ���. : ");
		
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
		 * 3���� ������ a, b, c�� �Է¹޾Ƽ� a�� b���� ū��, b�� c����
		 * ũ�ų� ������, a�� b���� �۰ų� ������, b�� c���� ������
		 * ���Ͽ� ���̸� true, �����̸� false�� ���� ���
		 * �Է¿�) 1 2 2
		 * ��¿�) f t t f
		 */
		
		System.out.print("3������ �Է��ϼ���. : ");
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
