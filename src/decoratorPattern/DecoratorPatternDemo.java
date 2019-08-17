/**
 * 
 */
package decoratorPattern;

/**
 * @author Administrator
 *
 */
public class DecoratorPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape circleShape = new Circle();
		circleShape.draw();
		
		RedShapeDecorator redCirlce = new RedShapeDecorator(circleShape);
		redCirlce.draw();
	}

}
