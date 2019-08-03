/**
 * 
 */
package prototypePattern;

/**
 * @author Administrator
 *
 */
public abstract class Shape implements Cloneable {
	private String idString;
	protected String typeString;
	
	abstract void draw();
	
	public String getTypeString() {
		return typeString;
	}
	
	public void setIdString(String idString) {
		this.idString = idString;
	}
	
	public String getIdString() {
		return idString;
	}
	
	public Object clone() {
		Object object = null;
		try {
			object = (Object) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return object;
	}
	

}
