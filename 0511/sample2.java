package sample1;
import java.util.*;

public class sample2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		// switch
		/*
		 * ����)����,����,�� ����
		 * 		���� (1),����(2), ��(3)�� �Է¹޾�
		 * 		��ǻ�ʹ� �������� �߻��Ͽ� ���� ���� �� ������ ����.
		 * �Է¿�) ���� (1), ���� (2), ��(3) �� �ϳ��� �Է��ϼ���. :
		 * ��¿�) ����� 1�Դϴ�.
		 * 		 ���� 1�Դϴ�.
		 * 		 �����ϴ�.
		 * 
		 * �Է¿�) ���� (1), ���� (2), ��(3) �� �ϳ��� �Է��ϼ���. :
		 * ��¿�) ����� 3�Դϴ�.
		 * 		 ���� 2�Դϴ�.
		 * 		 ����� �̰���ϴ�.
		 */
		/*
		System.out.println("����(1) ����(2) ��(3) �� �ϳ��� �Է��ϼ��� : ");
		
		int user = scn.nextInt();
		int com = (int)(Math.random()*3) +1;
		
		System.out.printf("����� %d�Դϴ�. \n", user);
		System.out.printf("���� %d�Դϴ�. \n", com);
		
		switch(user-com)
		{
		case -2:
		case 1 :
			System.out.println("����� �̰���ϴ�.");
			break;
			
		case -1 :
		case 2 :
			System.out.println("����� �����ϴ�.");
			break;
		case 0 :
			System.out.println("�����ϴ�.");
		break;
		}
		*/
		/* ����) �ֹε�� ��ȣ�� �Է¹޾� �������� �������� �����ϴ� ���α׷�
		 * �Է¿�) ����� �ֹι�ȣ�� �Է��ϼ���. : 100203-4157321 //Ư����ġ�� ���� �о���� ! (char)
		 * ��¿�) ����� �����Դϴ�.
		 * ���� : 1, 3 ���� : 2,4
		 * 
		 */
		
		
		/*
		System.out.println("����� �ֹι�ȣ�� �Է��ϼ���. :      ");
		String num = scn.nextLine();
		
		char gender = num.charAt(7);
		
		switch(gender)
		{
		case '1':
		case '3':
			System.out.println("����� �����Դϴ�");
		break;
		
		case '2':
		case '4':
			System.out.println("����� �����Դϴ�.");
		default :
			System.out.println("�ֹι�ȣ�� �� �� �Ǿ����ϴ�");
		}
	*/
		/*
		System.out.println("����� �ֹε�Ϲ�ȣ�� �Է��ϼ��� : ");
		String num = scn.nextLine();
		
		char gender = num.charAt(7);
		
		if( gender == '1' || gender =='3')
		{
			System.out.println("����� �����Դϴ�.");
			
		}
		else if (gender == '2' || gender == '4')
		{
			System.out.println("����� �����Դϴ�.");
		}
	
		*/
		/*
		 * ����)1���� ������, 2���� �����, 3���� ���Ƹ��� ���ϰ� 
		 * ��ȣ �Է��ϸ� �ش絿���� ����� ���
		 * �ش��ȣ ������ "��ȣ�� �߸��Ǿ����ϴ�."
		 * ������ dog ����� cat ���Ƹ� chick
		 * �Է¿�) ��ȣ�� �Է��ϼ���. : 2
		 * ��¿�) cat
		 * 
		*/ 
			/*
		System.out.print("��ȣ�� �Է��ϼ��� : ");
			
			int ani = scn.nextInt();
			
			switch(ani)
			{
			case 1 :
				System.out.println("dog");
				break;
				
			case 2 :
				System.out.println("cat");
				break;
				
			case 3 :
				System.out.println("chick");
			}
	
	*/
		
		/*
		 * ����)1~12 ������ ������ �Է¹޾� ����� ��� �Է¹��� ���� ������ 
		 * ����ϴ� ���α׷�
		 * 2�� 28�� (���)
		 * 1,3,5,7,8,10,12�� 31��
		 * 4,6,9,11�� 30��
		 * �Է¿�) 2��
		 * ��¿�) 28
		 * 
		 * �⵵�� ���� �Է¹޾� �ش�⵵�� �����̸� 2�� 29�Ϸ� ���
		 * �Է�)2020 2
		 *  ��¿�)2020���� �������� 29���Դϴ�.
		 *  2021���� ������� 28�� �Դϴ�.
		 */
	
		
		
		System.out.print("������ �Է��ϼ���. ");
		
		int year = scn.nextInt();
		int month = scn.nextInt();
		int day = 30;
		String info = "���";
		
		
		if( (year % 400 == 0 )
				|| (year % 4 == 0 && year % 100 != 0)) 
		{ 
			info = "����";
			
		}
		if(month == 2)
		{
			if( (year % 400 == 0 )
					|| (year % 4 == 0 && year % 100 != 0)) 
			{ 
				day = 29;
				
			}
			else
			{
				day = 28;
			}
			System.out.printf("%d���� %s���� %d�� �Դϴ�. \n",year, info, day);
			
		}
		else if (month ==4|| month==6|| month==9|| month == 11 )
		{ 
			
			day = 30;
			
		}
		else
		{
			day = 31;
		}
		System.out.printf("%d���� %s���� %d�� �Դϴ�. \n",year, info, day);
		
		/*
		System.out.println(year + " ���� " + isYear +"�Դϴ�..");
	}
		if(month == 2)
		{
			System.out.println("28");
			
		}
		else if (month == 3 || month == 5 || month ==1 || 
				month ==7 || month == 8 || month ==10  || month ==12)
		{
			System.out.println("31");
		
		}
		else 
		{
			System.out.println("30");
		}
	
		*/
	/*
		int month = scn.nextInt();
		
		switch(month)
		{
		case 2 :
			System.out.println("28");
			break;
			
		case 1,3,5,7,8,10,12 :
			System.out.println("31");
		break;
		
		default :
			System.out.println("30");
		
		}
	
	*/
	
	}
	
}
