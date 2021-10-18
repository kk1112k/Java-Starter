package sample1;

public class Sample {

	public static void main(String[] args) {
		// 연산자
		//출력예 : 
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
		
		//증강연산
		/*
		 * 출력예)
		 * 최초값 a=10, b=10
		 * a++ = 10, ++b = 11
		 * 실행후 a = 11, b = 11
		 * 
		 * a-- = 11, --b = 10
		 * 실행후 a = 10, b = 10
		 */
		
		int a = 10, b = 10;
				
		System.out.printf("최초값 a = %d, b = %d \n", a, b);
		System.out.printf("a++ = %d, ++b = %d \n", a++, ++b);
		System.out.printf("실행후 a = %d, b = %d \n", a, b);
		System.out.printf("a-- = %d, --b = %d \n", a--, --b);
		System.out.printf("실행후 a = %d, b = %d \n", a, b);
		
		/*
		 * 초기값은 int e = 5. f = 6, g = 0;
		 * 출력예) 
		 * 힌트) g = e + f
		 * printf 이용해서 출력
		 * e = 6, f = 5, g = 12 (g = e + f)
		 */
		
		int e = 5, f = 6, g = 0;
		
		g = ++e + f--;				
		System.out.printf("e = %d, f = %d, g = %d \n", e, f, g);
		

	}

}
