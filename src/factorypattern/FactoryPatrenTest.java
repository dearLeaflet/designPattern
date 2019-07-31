/**
 * 
 */
package factorypattern;

/**
 * @author Administrator
 * 静态工厂模式
 *
 */
public class FactoryPatrenTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape circle = ShapeFactory.getShape("Circle");
		if (circle != null) {
			circle.draw();
		}
		Shape rectangle = ShapeFactory.getShape("Rectangle");
		if (rectangle != null) {
			rectangle.draw();
		}
		Shape shape = ShapeFactory.getShape("test");
		if (shape != null) {
			shape.draw();
		}

	}

}
