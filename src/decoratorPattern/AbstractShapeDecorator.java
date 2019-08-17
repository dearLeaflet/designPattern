/**
 * 
 */
package decoratorPattern;

/**
 * @author Administrator
 *
 */
public abstract class AbstractShapeDecorator implements Shape {
	
	protected Shape shape;
	public AbstractShapeDecorator(Shape shape) {
		this.shape = shape;
	}
	@Override
	public void draw() {
		this.shape.draw();
	}

}
