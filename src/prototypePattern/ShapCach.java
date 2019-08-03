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
	private static Hashtable<String, Shape> shapMapHashtable = new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeID) {
		Shape shape = shapMapHashtable.get(shapeID);
		return (Shape) shape.clone();
	}
	
	public static void shapeLoad() {
		Shape circleShape = new Circle();
		circleShape.setIdString("0");
		shapMapHashtable.put(circleShape.getIdString(), circleShape);
		
		Shape squareShape = new Square();
		squareShape.setIdString("1");
		shapMapHashtable.put("1", squareShape);
		
		Shape rectangleShape = new Rectangle();
		rectangleShape.setIdString("2");
		shapMapHashtable.put("2", rectangleShape);
	}
}
