package sample1;

public class Hello {

	public static void main(String[] args) {
		// ��¿�
		//ù��° ���α׷� �Դϴ�.
		//���� �ٲپ� ����մϴ�.
		//������� ����ϰ�
		//���� �ٲߴϴ�.
		
		int age = 10;
		
		System.out.println("ù ��° ���α׷� �Դϴ�.");
		System.out.println("�ٲپ� ����մϴ�.");
		System.out.println("���" + 4 + "�ϰ�");
		System.out.println("�ٲߴϴ�.");
		
		System.out.println("����ϰ�\n�ٲߴϴ�.");
		
		//������
		/*
		 * %d   :  10���� ���� ǥ��
		 * %f   :  �Ǽ�
		 * %c   :  ���� ���
		 * %s   :  ���ڿ� ���
		 */
		// ��¿� : ���� ���̴� 10�� �Դϴ�.
		System.out.printf("���� ���̴� %d�� �Դϴ�.", age);
		//��¿� : ���� ���̴� 10���̰� 10�� �ڿ��� 20���� �˴ϴ�.
		System.out.printf("\n���� ���̴� %d���̰� %d�� �ڿ��� %d���� �˴ϴ�.", 
				age, 10, age + 10);
		String name = "bk";
		//��¿� : ���� �̸��� ooo�̰�, ���̴� 10���Դϴ�.
		//printf �� ���� �̿�
		System.out.printf("\n���� �̸��� %s�̰� ���̴� %d�� �Դϴ�.", 
				name, 10);
		
		

	}

}
