/**
 * 
 */
package prototypePattern;

import java.util.Hashtable;

/**
 * @author Administrator
 *
 */
public class ShapCach {
	private static Hashtable<String, BaseShape> shapMapHashtable = new Hashtable<String, BaseShape>();
	
	public static BaseShape getShape(String shapeId) {
		BaseShape shape = shapMapHashtable.get(shapeId);
		return (BaseShape) shape.clone();
	}
	
	public static void shapeLoad() {
		BaseShape circleShape = new Circle();
		circleShape.setIdString("0");
		shapMapHashtable.put(circleShape.getIdString(), circleShape);
		
		BaseShape squareShape = new Square();
		squareShape.setIdString("1");
		shapMapHashtable.put("1", squareShape);
		
		BaseShape rectangleShape = new Rectangle();
		rectangleShape.setIdString("2");
		shapMapHashtable.put("2", rectangleShape);
	}
}
