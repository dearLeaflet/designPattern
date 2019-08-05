/**
 * 
 */
package businessDelegatePattern;

/**
 * @author Administrator
 *
 */
public class DeliveryService implements BusinessService {

	@Override
	public void process() {
		System.out.println("goods is delivering...");
	}

}
