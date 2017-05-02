package withBridge;

public class Circle extends Shape{

	public Circle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		color.applyColor();
	}

}
