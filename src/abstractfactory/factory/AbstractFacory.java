/**
 * 
 */
package abstractfactory.factory;

import abstractfactory.color.Color;
import abstractfactory.shape.Shape;

/**
 * @author Administrator
 *
 */
public abstract class AbstractFacory {
	/***
	 * 获取颜色
	 * @param color
	 * @return
	 */
	abstract Color getColor(String color);
	/***
	 * 获取形状
	 * @param shape
	 * @return 
	 */
	abstract Shape getShape(String shape);
}
