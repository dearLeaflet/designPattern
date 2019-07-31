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
	 * ��ȡ��ɫ
	 * @param color
	 * @return
	 */
	abstract Color getColor(String color);
	/***
	 * ��ȡ��״
	 * @param shape
	 * @return 
	 */
	abstract Shape getShape(String shape);
}
