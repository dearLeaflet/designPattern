/**
 * 
 */
package businessDelegatePattern;

/**
 * @author Administrator
 *
 */
public class MsgService implements BusinessService {
	@Override
	public void process() {
		System.out.println("message is sending...");
	}
}
