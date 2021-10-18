package sample2;

public class PointColor {
	private int x;
	private int y;
	
	private Rgb rgb;
	
	public PointColor()
	{
		this(0,0,new Rgb());
	}
	
	public PointColor(int x, int y, Rgb rgb)
	{
		this.x = x;
		this.y = y;
		this.rgb = rgb;
	}

	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Rgb getRgb() {
		return rgb;
	}

	public void setRgb(Rgb rgb) {
		this.rgb = rgb;
	}

	public void setX(int i) {
		// TODO Auto-generated method stub
		
	}


	
}
