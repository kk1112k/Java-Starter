package sample1;
import java.util.*;

public class sample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		// switch�� ���
		/*
		 * �Ʒ��� �޴��� �����ְ� ������ �޴��� �˷��ִ� ���α׷� �ۼ�.
		 * ��¿�)1. ����
		 * 		2. ����
		 * 		3. ����
		 * �Է¿�) ���ڸ� �����ϼ���. : 2
		 * ��¿��� ������ �����ϼ̽��ϴ�.
		 * 		 
		
		
		int num;
		

		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("���ڸ� �����ϼ���. : ");
		
		num = scn.nextInt();
		
		switch(num)
		{
		case 1:
			System.out.println("������ �����ϼ̽��ϴ�. ");
			break;
		case 2:
			System.out.println("������ �����ϼ̽��ϴ�.");
			break;
		case 3 :
			System.out.println("������ �����ϼ̽��ϴ�. ");
			break;
		default:
			System.out.println("���ڸ� �� �� �Է��ϼ̽��ϴ�.");
		} */
		 /*
		  * ����) ���� �빮�ڸ� �Է¹޾� 'A'�̸� "�Ǹ��մϴ�.",
		  * 'b'�̸� "�����ϴ�.", 'c'�̸� "�����Դϴ�.",
		  * 'd'�̸� "����ϼ���.", �� �� ���ڴ� "�߸��Է��Ͽ����ϴ�."
		  * �Է¿�)b
		  * ��¿�)�����ϴ�.
		  */
		/*
		char a = scn.next().charAt(0);
		
		
		switch(a)
		
		{
			case 'A' :
				System.out.println("�Ǹ��մϴ�.");
				break;
			case 'B'
			:
				System.out.println("�����ϴ�.");
				break;
			case 'C' :
				System.out.println("�����Դϴ�.");
				break;
			case 'D' :
				System.out.println("����ϼ���.");
			default :
				System.out.println("���ڸ� �� �� �Է��ϼ̽��ϴ�.");
		}
		*/
		
		/*
		 * ����) ������ �Է¹޾� " ����̾簡"�� ���ϴ� ���α׷�
		 * �Է¿�) ������ �Է��ϼ���. :
		 * ��¿�) ��
		 */
		
		
		
		/*
		System.out.println("������ �Է��ϼ���. : ");
		int num = scn.nextInt();
		switch (num/10)
		{
			case 10 :
			case 9 :
				System.out.println("��");
			break;
			
			case 8 :
				System.out.println("��");
				break;
			case 7 : 
				System.out.println("��");
				break;
			case 6 :
				System.out.println("��");
				break;
			default :
			 System.out.println("��");
			
				
		}
	*/
		
		/*'
		 * ����) ���� ���� �Է¹޾� �Է� ���� ���� �ش��ϴ� ������
		 * ����ϴ� ���α׷�
		 * 3~5 "���� ������ ���Դϴ�."
		 * 6~8 "���� ������ �����Դϴ�."
		 * 9~11 "���� ������ �����Դϴ�."
		 * 12~2 "���� ������ �ܿ��Դϴ�."
		 * �Է¿�) ���� ���� �Է��ϼ���, : 3
		 * ���) ���� ������ ���Դϴ�.
		 * 
		 */
		
		/*System.out.println("���� ���� �Է��ϼ��� : ");
		int month = scn.nextInt();
		
		
		switch (month)
		{
			case 3,4,5 :
				System.out.println("���� ������ ���Դϴ�.");
			break;
			
			case 6 :
			case 7 :
			case 8 :
				System.out.println("���� ������ �����Դϴ�.");
				break;
				
			case 9,10,11 :
				System.out.println("���� ������ �����Դϴ�.");
			break;
			
			default :
			System.out.println("���� ������ �ܿ��Դϴ�.");
			
		}
	*/
		
		System.out.println("���� ���� �Է��ϼ��� : ");
		int month = scn.nextInt();
		
		if(month < 6)
		{
			System.out.println("���� ������ ���Դϴ�.");
		}
		else if ( month < 9)
		{
			System.out.println("���� ������ �����Դϴ�.");
		}
		else if(month < 12)
		{
			System.out.println("���� ������ �����Դϴ�.");
		}
		else 
		{
			System.out.println("���� ������ �ܿ��Դϴ�.");
		}
	}
	
	
	

}


















