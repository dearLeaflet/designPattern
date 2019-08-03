/**
 * 
 */
package prototypePattern;

/**
 * @author Administrator
 *
 */
public class PrototypeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapCach.shapeLoad();
		Shape shape = ShapCach.getShape("0");
		shape.draw();
	}

}
