/**
 * 
 */
package abstractfactory.factory;

import abstractfactory.color.Color;
import abstractfactory.color.Red;
import abstractfactory.shape.Shape;

/**
 * @author Administrator
 *
 */
public class ColorFactory extends AbstractFacory {

	@Override
	public Color getColor(String color) {
		if ("red".equalsIgnoreCase(color)) {
			return new Red();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}

}
