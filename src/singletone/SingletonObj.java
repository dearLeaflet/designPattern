/**
 * 
 */
package singletone;

/**
 * @author Administrator
 *
 */
public class SingletonObj {
	private static SingletonObj instanceObj;
	
	private SingletonObj() {
	}
	
	public static SingletonObj getInstanceObj() {
		if(instanceObj == null) {
			synchronized (SingletonObj.class) {
				if(instanceObj == null) {
					return new SingletonObj();

				}
			}
		}
		return instanceObj;
	}
	
	public void sayHello() {
		System.out.println("singleton instance");
	}
}
