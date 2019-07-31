/**
 * 
 */
package factorypattern;

/**
 * @author Administrator
 *
 */
public class ShapeFactory{
	public static Shape getShape(String shape) {
		if("Circle".equalsIgnoreCase(shape)) {
			return new Circle();
		}
		else if("Rectangle".equalsIgnoreCase(shape)) {
			return new Rectangle();
		}
		return null;
	}

}
