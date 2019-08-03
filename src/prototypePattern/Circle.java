/**
 * 
 */
package prototypePattern;

/**
 * @author Administrator
 *
 */
public class Circle extends Shape{

	public void Cicle() {
		typeString = "Circle";
	}
	
	@Override
	void draw() {
		System.out.println("Cicle Drawing");		
	}
	

}
