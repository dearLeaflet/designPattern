/**
 * 
 */
package bridgePattern;


/**
 * @author Administrator
 *
 */
public class BridgePatternDemo {

	/**
	 * 
	 */
	public static void main(String[] args){
		Circle circle = new Circle(5, 4, 4, new RedCircle());
		circle.draw();
	}

}
