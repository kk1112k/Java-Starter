package sample1;
import java.util.*;

/* ���(���ǹ�) */
public class Sample1 {

	public static void main(String[] args) {
		/*
		 * �Ѱ��� ������ �Է¹��� �� �Է¹��� ���� ����ϰ� �� ����
		 * 10���� ũ�� ���� �ٿ� "10���� ū ���� �Է��ϼ̽��ϴ�."���
		 * �޼����� ����ϴ� ���α׷�
		 * �Է� ��) 15
		 * ��� ��) 15
		 * 		10���� ū ���� �Է��ϼ̽��ϴ�.
		 */

		/*
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		System.out.println(num);
		
		if(num > 10)
		{
			System.out.println("10���� ū ���� �Է��ϼ̽��ϴ�.");
		}
		*/
		
		/* 
		 * ���� ) ������ �Է¹޾� ���ٿ� �Է¹��� ���ڸ� ����ϰ�
		 * �����̸� "minus"��� ����ϴ� ���α׷� �ۼ�
		 * �Է� ��)-5
		 * ��� �� )-5
		 * 		minus
		 */
	
		/*
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		System.out.println(num);
	
		if(num<0)
		{
			System.out.println("minus");
		}*/
		
		/*
		 * ����)���� 2���� �Է¹޾Ƽ� ū���� �������� ���ʷ� ����ϴ�
		 * ���α׷�
		 * ��Ʈ - �Էµ� ���� a,b / ��µ� ���� a,b
		 * �Է� ��) 2 9
		 * ��� ��) �Է¹��� �� �� ū���� 9�̰�, ���� ���� 2 �Դϴ�.
		 */
		/*
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int tmp;
		
	
		if(a < b)
		{
			tmp = a;
			a = b;
			b = tmp;
		}
		
		System.out.printf("�Է¹��� �� �� ū���� %d�̰�, ���� ���� %d �Դϴ�.",a,b);
	*/
		/*
		 * ����)������ �Է¹޾� 80�� �̻��̸� �հ� �ƴϸ� ���հ���
		 * ����ϴ� ���α׷�
		 * �Է� ��) ������ �Է��ϼ���. : 89
		 * ��� ��) �����մϴ�. �հ��Դϴ�.
		 * 
		 * �Է� ��)������ �Է��ϼ���.  : 70
		 * ��� ��)�˼��մϴ�. ���հ� �Դϴ�.
		 */
		
		/*Scanner scn = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int a = scn.nextInt();
		
		if(a >= 80)
		{
			System.out.println("�����մϴ�. �հ��Դϴ�.");
		}
		else
		{
			System.out.println("�˼��մϴ�.���հ��Դϴ�.");
			
		}*/
		/*
		 *����) ���̸� �Է� �޾� 20�� �̻��̸� "adult"��� ����ϰ�
		 *�׷��� ������ ����Ŀ� ���� �Ǵ����� "_years later"�ϴ�
		 *�޼����� ����ϴ� ���α׷� �ۼ�
		 *�Է� ��) ���̸� �Է��ϼ���. : 19
		 *��� ��) 1 years later
		 *
		 *�Է� ��)���̸� �Է��ϼ��� : 22
		 *��� �� ) adult
		 */
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ���. : ");
		
		int a = scn.nextInt();
		
		if(a>=20)
		{
			System.out.println("adult");
		}
		else
		{
			System.out.printf("%d years later \n", 20 -a );
			
		}
	
	}
		
}
	