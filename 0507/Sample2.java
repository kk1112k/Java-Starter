package sample1;
import java.util.*;
public class Sample2 {

	public static void main(String[] args) {
		//if~else if~
		/*
		 * ����)������ �Է¹޾� "����̾簡"�� ���ϴ� ���α׷�
		 * �Կ���)������ �Է��ϼ���. : 89
		 * ��¿�) ��
		 */

	/*	Scanner scn = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. : ");
		int score = scn.nextInt();
		
		if(score >= 90)
		{
			System.out.println("��");
		}
		else if(score >= 80)
		{
			System.out.println("��");
		}
		else if(score >=80 )
		{
			System.out.println("��");
		
		}
		else if(score >= 70)
		{
			System.out.println("��");
		}
		else
		{
			System.out.println("��");
		}
		*/
		/*
		 *  ����)�ֻ����� �ι� ������ ���¼��� �Է¹޾� �� ���� ���
		 *  4�̻��̸� "�̰���ϴ�." �Ѱ��� 4�̻��̸� "�����ϴ�."
		 *  ��� 4�̸��̸� "�����ϴ�."��� ����ϴ� ���α׷�
		 *  �Է� ��) �ֻ����� ���� ����� �Է��ϼ���. : 3 4
		 *  ��� ��) �����ϴ�. 
		 *  if ~ else if~ �̿�
		 */
	Scanner scn = new Scanner(System.in);
	
	System.out.print("�ֻ����� ���� ����� �Է��ϼ���. : ");
	int a = scn.nextInt();
	int b = scn.nextInt();
	
	if(a>=4 && b>=4 )
	{
		System.out.println("�̰���ϴ�.");
	}
	else if(a>=4 || b >= 4)
	{
		System.out.println("�����ϴ�.");
	}
	else
	{
		System.out.println("�����ϴ�.");
	}
		
			
	}
	
}
