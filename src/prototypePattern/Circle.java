/**
 * 
 */
package prototypePattern;

/**
 * @author Administrator
 *
 */
public class Circle extends BaseShape{

	public Circle() {
		typeString = "Circle";
	}
	
	@Override
	void draw() {
		System.out.println("Cicle Drawing");		
	}
	

}
