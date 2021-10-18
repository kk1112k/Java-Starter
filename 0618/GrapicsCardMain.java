package sample2;

public class GrapicsCardMain {
	
	//�ü���� �׷��� ���
	public void operatingSystemWrite(GraphicsCard graphicsCard,PointColor pointColor)
	{
		if(graphicsCard != null)
		{
			System.out.println("�׷���ī�� ���");
			System.out.println("ȸ��� : "+ graphicsCard.company());
			System.out.println("�𵨸� : " + graphicsCard.model());
			System.out.println("�޸� : " + graphicsCard.memory());
			
			System.out.println("��¼���");
			graphicsCard.write(pointColor);
		}
	}

	public static void main(String[] args) {
		
		GraphicsCard amdRadeon = new AmdRadeon("Rx 50000", 4096);
		
		NvidiaGeForce nvidiaGeForce = new NvidiaGeForce("Gefprce Gt 710", 2048);
		
		PointColor pointColor = new PointColor();
		
		pointColor.setX(100);
		pointColor.setY(200);
		
		pointColor.setRgb(new Rgb(255,128,100));
		
		GrapicsCardMain cardMain = new GrapicsCardMain();
		
		cardMain.operatingSystemWrite(amdRadeon, pointColor);
		
		System.out.println();
		
		cardMain.operatingSystemWrite(amdRadeon, pointColor);

	}

	private static GrapicsCardMain GraphicsCardMain() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
