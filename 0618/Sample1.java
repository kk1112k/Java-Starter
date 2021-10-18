package sampla;

interface Moveable
{
	//������ ��ġ�� �̵��ϴ� ��� �޼���
	void move(int x, int y);
}

interface Attackable
{
	//������ ����� �����ϴ� �޼���
	void attack(Unit u);
}

interface Fightable extends Moveable, Attackable
{
	
}

class Unit
{
	int currentHP;  //����ü��
	int x; 			//���� x��ǥ
	int y;			//���� y��ǥ
}

class Fighter extends Unit implements Fightable
{
	public void move(int x, int y)
	{
		System.out.println("Fighter class move�޼���");
	}
	
	public void attack(Unit u)
	{
		System.out.println("Fighter class attack�޼���");
	}
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		
		if(f instanceof Unit)
		{
			System.out.println("f�� UnitŬ������ �ڼ�");
		}
		if(f instanceof Fightable) {
			System.out.println("f�� Fightable�������̽� ����");
		}
		if(f instanceof Moveable) {
			System.out.println("f�� Moveable�������̽� ����");
		}
		if(f instanceof Attackable) {
			System.out.println("f�� Attackable�������̽� ����");
		}
		if(f instanceof Object) {
			System.out.println("f�� ObjectŬ���� �ڼ�");
		}
	}

}
