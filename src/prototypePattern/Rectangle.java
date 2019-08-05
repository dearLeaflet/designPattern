/**
 * 
 */
package prototypePattern;

/**
 * @author Administrator
 *
 */
public class Rectangle extends BaseShape {
	public Rectangle() {
		 typeString = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Rectangle drawing");
	}

}
