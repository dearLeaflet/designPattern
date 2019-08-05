/**
 * 
 */
package businessDelegatePattern;

/**
 * @author Administrator
 *
 */
public class BusinessDelegate implements Cloneable {
	String businessType;
	
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	
	public void doTask() {
		BusinessLookUp businessLookUp = new BusinessLookUp();
		BusinessService businessService = businessLookUp.getBussinessService(this.businessType);
		businessService.process();
	}
	
	@Override
	public Object clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return object;
	}
}
