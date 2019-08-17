/**
 * 
 */
package bridgePattern;

/**
 * @author Administrator
 *
 */
public abstract class AbstractShape {
	protected DrawAPI drawAPI = null;
	
	public AbstractShape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
