package sample1;

import java.util.Scanner;

public class forsample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		/*�ݺ���� for.
		int i, sum = 0;
		for(i=1; i<=10; ++i)
		{
			sum +=i;
			System.out.printf("i=%d,sum=%d \n", i, sum);
		}
		*/
		
		
		/*���� )for���� �̿��Ͽ� ����ϴ� ���α׷�
		 * (����Ҷ� ����ϴ� ���� i���� ���)
		 * ������1
		 * 		2
		 * 		3
		 * 		4
		 * 		5
		 * 		12345
		 */	
		
		//int i;
		/*
		for(int i = 1; i<=5; ++i)
		{
			System.out.println(i);
			
		}
		for(int i =1; i<=5; ++i)
		{
			System.out.print(i);
		}
	*/
		
		/*
		 *������)1���� 1������ �� : 1
		 *		1���� 2������ �� : 3
		 *		1���� 3������ �� : 6
		 *		1���� 4������ �� : 10
		 *		1���� 5������ �� : 15
		 *		1���� 6������ �� : 21
		 *		1���� 7������ �� : 28
		 *		1���� 8������ �� : 36
		 *		1���� 9������ �� : 45
		 *		1���� 10������ �� :55
		 *
		 */
		/*
		int i , sum = 0;
		
		for(i = 1; i<=300; i++)
		{
			sum +=i;
			System.out.printf("1���� %-8d������ �� : %-8d �Դϴ�. \n",i,sum);
		
		
		}
	*/
		
		
		/*
		 *������)1		10
		 * 		2		9
		 * 		3		8
		 * 		4		7
		 * 		5		6
		 * 		6		5
		 * 		7		4
		 * 		8		3
		 * 		9		2
		 * 		10		1
		 * 	
		 * 			
		 */
			/*
		int i, j;
			
			for(i=1,j=10; i<=10; i++,j--)
			{
				
				System.out.printf("%d \t\t %d\n", i,j);
			}
	*/
		/*
		 * ����)10������ ������ �Է¹޾� ������ŭ "JAVA ���α׷���"
		 * �̶�� ����ϴ� ���α׷�
		 * �Է¿�)5
		 * ��¿�) Java ���α׷���
		 * 		 Java ���α׷���
		 * 		 java ���α׷���
		 * 		 java ���α׷���
		 * 		 java ���α׷���	
		 */
	
		/*
			int i, n;
			n = scn.nextInt();
			
			
			for(i = 1; i <= n; i++)
			{
				System.out.println("JAVA ���α׷���");
				
			}
			*/
		/*
		 * ����) �빮�ڸ� 'A'���� 'Z'���� ����ϴ� ���α׷�
		 * for������ char Ÿ�Ժ��� 1���� ���
		 * ��¿�) ABCDEFGHIJKLMNOPQRSTUVWXYZ
		 */
			
		/*	
			char i;
			
			
			for(i = 'A';i<='Z';i++)
			{
				System.out.printf("%c",i);
			}
		*/
		/*
		 * ����)1���� 20������ Ȧ���� ���ʴ�� ����ϴ� ���α׷�
		 * ��¿�) 1 3 5 7 9 11 13 15 17 19
		 */
		/*
		int i;
		
		for(i=1; i<20; i+=2)
		{
			if(i%2 != 0)
			System.out.printf("%d \t",i);
		}
		
		System.out.println();
		for(i=1; i<20; i+=2)
		{
			
			System.out.printf("%d \t",i);
		}
	*/
		/*
		 * ����)������ �Է¹޾� 1���� �Է¹��� �������� ���� ����ϴ�
		 * ���α׷�
		 * �Է¿�)10
		 * ��¿�)55
		 * 
		 */
			/*
				int i ,n, sum = 0;
				n = scn.nextInt();
				
				for(i = 1; i<=n ; i++)
				{
					sum +=i;
				}
				
				System.out.print(sum);
				
				*/
				/*
				 * ����) ������ �Է¹޾� �Է¹��� �������� 100������ ����
				 * ����ϴ� ���α׷� (�Է¹޴� ������ 100����)
				 * �Է¿�)95
				 * ��¿�)585
				 */
	
	/*
			int i, n, sum = 0;
			n= scn.nextInt();
			
			for(i=n; i <=100; i++)
			{
				sum += i;
			}
				System.out.print(sum);
				*/
		
		/*
		 * ����) 10���� ������ �Է¹޾� �� ���� �� ¦���� ������ 
		 * ����� ����ϴ� ���α׷�
		 * �Է¿�)15 22 3 129 66 81 35 1 46 888
		 * ��¿�)�Է¹��� ¦���� 4���Դϴ�.
		 * 
		 */
		/*	
		int i, n, count=0;
			
			
			for(i=1; i<=10; i++)
			{
				n=scn.nextInt();
				
				if(n %2 == 0)
				{
					count++;
				}
				
			}
			
			System.out.printf("�Է¹��� ¦���� %d�Դϴ�.\n ",count);
			*/
		/*
		 * ����)10���� ������ �Է¹޾� 3�� ����� ������ 5�� ����� ������
		 * ���� ����ϴ� ���α׷�
		 * �Է¿�) 10 15 36 99 100 19 46 88 87 13
		 * ��¿�)3�� ��� : 4
		 * 		5�� ��� : 3
		 * 
		
		
			int i, n, count=0 , count2=0;
			
			for(i=1;i<=10;i++)
			{
				n=scn.nextInt();
				
				if(n %3==0)
				{
					count++;
				}
				if(n %5==0)
				{
					count2++;
				}
			}
			
			System.out.printf("3�� ��� : %d\n", count);
			System.out.printf("5�� ��� : %d  ", count2);
	 */
		/*
		 * ����)5���� ������ �Է¹޾Ƽ� ������ ����� ����ϴ� ���α׷�
		 * ����� �Ҽ� ù°�ڸ����� ���.
		 * �Է¿�)90 85 100 66 88 //score
		 * ��¿�) ���� : 429      // sum
		 * 		 ��� : 85.8		// avg = sum / 5.0 , (double)
		 * 
		 */
			
			int i,score,n, sum=0;		
			double avg;
			System.out.println("�л����� ����ΰ���?");
			n = scn.nextInt();
			
			for(i=1; i<=n; i++)
			
			{
				score = scn.nextInt();
				sum +=score;
				
			}
			avg = (double)sum/n;
			System.out.printf("����: %d\n", sum);
			System.out.printf("���: %.1f", avg);
	}
	
	
	
	
}
