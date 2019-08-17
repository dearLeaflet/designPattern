/**
 * 
 */
package decoratorPattern;

/**
 * @author Administrator
 *
 */
public class RedShapeDecorator extends AbstractShapeDecorator{
	/**
	 * 
	 */

	public RedShapeDecorator(Shape shape) {
		super(shape);
	}
	@Override
	public void draw() {
		super.shape.draw();
		this.setRedBorder();
	}

	private void setRedBorder() {
		System.out.println("Set red border");
	}
}
