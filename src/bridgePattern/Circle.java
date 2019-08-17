package bridgePattern;

public class Circle extends AbstractShape{
	private int radius;
	private int x;
	private int y;

	public Circle(int radius, int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		
	}
	
	@Override
	public void draw() {
		drawAPI.draw(radius, x, y);
	}

}
