package sample1;

public class Sample {

	public static void main(String[] args) {
		// ������
		//��¿� : 
		/*
		 * 7 + 5 = 12
		 * 7 - 5 = 2
		 * 7 * 5 = 35
		 * 7 / 5 = 1
		 * 7 % 5 = 2
		 */
		
		 int c = 7, d = 5;
		
		//printf(%d + %d = %d\n",,,);
		
		System.out.printf("%d + %d = %d \n", c, d, c + d);
		System.out.printf("%d - %d = %d \n", c, d, c - d);
		System.out.printf("%d * %d = %d \n", c, d, c * d);
		System.out.printf("%d / %d = %d \n", c, d, c / d);
		System.out.printf("%d %% %d = %d \n", c, d, c % d);
		
		//��������
		/*
		 * ��¿�)
		 * ���ʰ� a=10, b=10
		 * a++ = 10, ++b = 11
		 * ������ a = 11, b = 11
		 * 
		 * a-- = 11, --b = 10
		 * ������ a = 10, b = 10
		 */
		
		int a = 10, b = 10;
				
		System.out.printf("���ʰ� a = %d, b = %d \n", a, b);
		System.out.printf("a++ = %d, ++b = %d \n", a++, ++b);
		System.out.printf("������ a = %d, b = %d \n", a, b);
		System.out.printf("a-- = %d, --b = %d \n", a--, --b);
		System.out.printf("������ a = %d, b = %d \n", a, b);
		
		/*
		 * �ʱⰪ�� int e = 5. f = 6, g = 0;
		 * ��¿�) 
		 * ��Ʈ) g = e + f
		 * printf �̿��ؼ� ���
		 * e = 6, f = 5, g = 12 (g = e + f)
		 */
		
		int e = 5, f = 6, g = 0;
		
		g = ++e + f--;				
		System.out.printf("e = %d, f = %d, g = %d \n", e, f, g);
		

	}

}
