/**
 * 
 */
package singletone;

/**
 * @author Administrator
 *
 */
public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonObj singletonObj = SingletonObj.getInstanceObj();
		singletonObj.sayHello();
	}

}
