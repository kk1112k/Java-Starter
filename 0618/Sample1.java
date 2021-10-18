package sampla;

interface Moveable
{
	//지정된 위치로 이동하는 기능 메서드
	void move(int x, int y);
}

interface Attackable
{
	//지정된 대상을 공격하는 메서드
	void attack(Unit u);
}

interface Fightable extends Moveable, Attackable
{
	
}

class Unit
{
	int currentHP;  //유닛체력
	int x; 			//유닛 x좌표
	int y;			//유닛 y좌표
}

class Fighter extends Unit implements Fightable
{
	public void move(int x, int y)
	{
		System.out.println("Fighter class move메서드");
	}
	
	public void attack(Unit u)
	{
		System.out.println("Fighter class attack메서드");
	}
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		
		if(f instanceof Unit)
		{
			System.out.println("f는 Unit클래스의 자손");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable인터페이스 구현");
		}
		if(f instanceof Moveable) {
			System.out.println("f는 Moveable인터페이스 구현");
		}
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable인터페이스 구현");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object클래스 자손");
		}
	}

}
