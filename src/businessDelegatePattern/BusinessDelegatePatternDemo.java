/**
 * 
 */
package businessDelegatePattern;

/**
 * @author Administrator
 *
 */
public class BusinessDelegatePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setBusinessType("MSG");
		
		Client clinet = new Client(businessDelegate);
		clinet.doTask();
		
		businessDelegate.setBusinessType("Delivery");
		clinet.doTask();
	}

}
