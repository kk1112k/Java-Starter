package sample;

import java.util.Scanner;

public class samlple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		/*
			int a =11;
			
			while(a<=10)
			{
				System.out.println(a++);
			}
			a = 11;
			do
			{
				System.out.println(a++);
			} while(a<=10);
			
			*���ĺ� a-z ����ϴ� ���α׷�
			
			
			char  alpha= 'A';
			
			while(alpha <='Z')
			{
				System.out.printf("%c", alpha++);
			}
			
			���� )���� ���� num �����ϰ� 1������ 1�� ������Ű�鼭 10���� ���� �� ���ϴ� ���α׷�.
			while�� �̿��� �ۼ��ϰ� 1���� 10���� �հ� while���� ���� ���� num�� ���� ����ϴ� ���α׷�
			��¿� 1���� 10������ �� = 55
				 while�� ������ num�� =11
					
			
			int num =1; 
			int sum =0; 
			
			 while(num<= 10)
			 {
				 sum += num;
				 num++;
				 
			 }
			System.out.printf("1���� 10������ ���� %d\n",sum);
			System.out.printf("num�� �� = %d", num);
			
			
			 ���� ������ �Է¹޾� 80�̻� �հ�, �ƴ� ���հ��ϴ� �۾� �ݺ��ϴٰ�
			 0~100�̤��� ���� �Է��̸� ����.
			 �� ��¿� 
			 �����Է��ϼ���. : 50
			 ���˼��դ��ϴ� ���հ�
			 �����Է��ϼ��� : 80 
			 �����ؿ� �հ�
			 �����Է��ϼ��� : 111
			 ��
							
		int score;
		System.out.print("������ �Է��ϼ��� : ");
		score =scn.nextInt();
		
		while(score>=0 && score<= 100)
		{
			if(score < 80)
			{
				System.out.println("�˼��մϴ�. ���հ��Դϴ�.");
			}
			else
			{
				System.out.println("�����մϴ�. �հ��Դϴ�.");
			}
			System.out.print("������ �Է��ϼ��� : ");
			score=scn.nextInt();
			 
			 ���� ���� ���ѷ���
		
		int score;
		
		while(true)
		{
			System.out.print("���� �Է��ϼ��� : ");
			score = scn.nextInt();
			
			if(score <0 || score >100)
			{
				break;
			}
			if(score>=80)
			{ 
				System.out.print("�հ��Դϴ�.\n");
			}
			else
			{
				System.out.print("���հ��Դϴ�. \n");
			}
		}
		while ��
		���� ������ ��� �Է¹޴ٰ� 0�� �Ǹ� 0�����ϰ� ���� �Է� �ڷ���� �հ�
		��� ���. ����� �Ҽ�2����
		�Է¤�/�� 15 88 97 0
		��� �Է��ڷ� ���� = 3
			�Է��ڷ� �հ� = 200
			�Է��ڷ� ��� = 66.67 (%.2f)
		
	
		int a=0;
		int sum=0;
		int cnt=0;
		double avg=0;
		

		while(true)
		{	
			a= scn.nextInt();
			
			if(a ==0)
			{
				break;
			}
			
			sum += a;
			cnt ++;
			
		}
		avg = (double)sum/cnt;
		System.out.printf("�Էµ� �ڷ��� ���� = %d \n", cnt);
		System.out.printf("�Էµ� �ڷ��� �հ� = %d \n", sum);
		System.out.printf("�Էµ� �ڷ��� ��� = %.2f", avg);
		
		
		���� ���� �Է¹޴ٰ� 0�Է��Ǹ� �Էµ� ���� Ȧ�� �հ� ��� ��� !
		��� ������ ���ϱ�. 
		�Է¤��� 5 8 17 6 31 0
			  Ȧ �� = 53
			  Ȧ ��  =17
	
	
		int a =0;
		int avg;
		int sum=0, cnt=0;
		
		while(true)
		{
			a = scn.nextInt();
			if(a==0)
			{
				break;
			}
			
			 if(a%2 != 0)
			{
				 sum +=a;
				cnt++;
			}
			 
		}
		
		avg = sum/cnt;
		System.out.printf("Ȧ���� �� : %d \n", sum);
		System.out.printf("Ȧ���� ��� : %d", avg);
		
		DO WHILE 
		���� ) �Ʒ��� ���� �޽����� ����ϰ� ���ڸ� �Է¹޾� ������ ��ȣ�� �ش��ϴ� �޽����� 
		����ϴ� �۾��� �ݤ����ϴ� 4�� �ԷµǸ� �޼��� ����� ���� ���α׷�
		(1~4 �̿ܐl ���ڰ� �ԷµǸ� "�߸� �����ϼ̾���")
		�� ��¿�
		1. �Է��ϱ�
		2. ����ϱ�
		3. �����ϱ�
		4. ������
		�۾��� ��ȣ �����ϱ� : 2
		
		����ϱ⸦ �����Ͽ����ϴ�.
		
		1. �Է��ϱ�
		2. ����ϱ�
		3. �����ϱ�
		4. ������
		�۾��� ��ȣ �����ϱ� : 5
		
		�߸� �����Ͽ����ϴ�.
		
		1. �Է��ϱ�
		2. ����ϱ�
		3. �����ϱ�
		4. ������
		�۾��� ��ȣ �����ϱ� : 4
		
		�����⸦ �����Ͽ����ϴ�.
			
	*/
		int a=0;
		
		
		do
		{	
			System.out.println("1. �Է��ϱ�\n2. ����ϱ�\n3. �����ϱ�\n4. ������");
			System.out.print("\n�۾��� ��ȣ�� �����ϼ���. : ");
			a = scn.nextInt();
			switch(a)
			{
			case 1:
				System.out.println("\n�Է��ϱ⸦ �����ϼ̽��ϴ�.");
			break;
			case 2:
				System.out.println("\n����ϱ⸦ �����ϼ̽��ϴ�.");
			break;
			case 3 :
				System.out.println("\n�����ϱ⸦ �����ϼ̽��ϴ�.");
			break;
			case 4 :
				System.out.println("\n�����⸦ �����ϼ̽��ϴ�.");
				break;
			default:
				System.out.println("\n�߸�");
			}
		}
		while( a !=4);
		
	
	
	}
	
	

}

