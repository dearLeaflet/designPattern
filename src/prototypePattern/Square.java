/**
 * 
 */
package prototypePattern;

/**
 * @author Administrator
 *
 */
public class Square extends BaseShape {
	public Square() {
		typeString = "Square";
	}
	
	@Override
	public void draw() {
		System.out.println("Square drawing");
	}

}
