/**
 * 
 */
package businessDelegatePattern;

/**
 * @author Administrator
 *
 */
public class BusinessLookUp {
	public BusinessService getBussinessService(String bussinessType) {
		if(bussinessType.equalsIgnoreCase("delivery")) {
			return new DeliveryService();
		}else {
			return new MsgService();
		}
	}

}
